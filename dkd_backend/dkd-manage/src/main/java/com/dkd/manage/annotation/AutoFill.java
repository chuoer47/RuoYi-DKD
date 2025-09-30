package com.dkd.manage.annotation;

/**
 * <p>
 *
 * @description :
 * <p>
 * @Author : Ryan/Rui.Zhang
 * @since : 2024/9/20.
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解
 * 对公共数据进行自动填装
 */
@Target(ElementType.METHOD)  // 该注释只对方法起作用
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoFill {
    // 使用枚举类
    OperationType value();
}
