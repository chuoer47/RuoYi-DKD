package com.dkd.manage.aspect;

import cn.hutool.core.date.DateTime;
import com.dkd.common.utils.SecurityUtils;
import com.dkd.manage.annotation.AutoFill;
import com.dkd.manage.annotation.OperationType;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.util.Date;

import static com.dkd.manage.constant.AutoFillConstant.*;

/**
 * <p>
 *
 * @description :
 * <p>
 * @Author : Ryan/Rui.Zhang
 * @since : 2024/9/20.
 */
@Aspect
@Component
public class AutoFillAspect {

    /**
     * 设置切入点
     */
    @Pointcut("execution(* com.dkd.manage.mapper.*.*(..)) && @annotation(com.dkd.manage.annotation.AutoFill)")
    public void autoFillPointCut(){}


    /**
     * 前置通知，在通知中进行公共字段的赋值
     * @param joinPoint
     */
    @Before("autoFillPointCut()")
    public void autoFill(JoinPoint joinPoint){
        System.out.println("进入公共字段赋值切面...");
        // 获取到当前被拦截方法上的数据库操作类型
        MethodSignature signature = (MethodSignature) joinPoint.getSignature(); // 获取签名对象
        AutoFill autoFill = signature.getMethod().getAnnotation(AutoFill.class); // 获得签名上的注释对象
        OperationType operationType = autoFill.value();// 获得数据库操作类型
        // 获取到被拦截方法参数--实体对象
        Object[] args = joinPoint.getArgs();
        if(args == null || args.length == 0){
            return ;
        }

        Object entity = args[0];
        // 准备赋值数据
        Date now = DateTime.now();
        Long id = SecurityUtils.getLoginUser().getUserId();


        // 根据当前不同的操作类型，为对应的属性通过反射来赋值
        if(operationType == OperationType.INSERT){
            // 为4个公共字段赋值
            try {
                Method setCreateTime = entity.getClass().getMethod(SET_CREATE_TIME, Date.class);
                Method setCreateUser = entity.getClass().getMethod(SET_CREATE_USER, Long.class);
                Method setUpdateTime = entity.getClass().getMethod(SET_UPDATE_TIME, Date.class);
                Method setUpdateUser = entity.getClass().getMethod(SET_UPDATE_USER, Long.class);

                // 通过反射为对象属性赋值
                setCreateTime.invoke(entity,now);
                setCreateUser.invoke(entity,id);
                setUpdateTime.invoke(entity,now);
                setUpdateUser.invoke(entity,id);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if(operationType == OperationType.UPDATE){
            try {
                // 若存在字段则修改
                Method setUpdateTime = entity.getClass().getMethod(SET_UPDATE_TIME, Date.class);
                setUpdateTime.invoke(entity,now);

                // updateBy 没有这个字段
                /*if (entity.getClass().getMethod(SET_UPDATE_USER, Long.class) != null){
                    Method setUpdateUser = entity.getClass().getMethod(SET_UPDATE_USER, Long.class);
                    setUpdateUser.invoke(entity,id);
                }*/
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }
}
