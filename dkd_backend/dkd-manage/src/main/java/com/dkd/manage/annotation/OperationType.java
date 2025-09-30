package com.dkd.manage.annotation;

/**
 * <p>
 *
 * @description :
 * <p>
 * @Author : Ryan/Rui.Zhang
 * @since : 2024/9/20.
 */
public enum OperationType {

    // todo 因为表中有的字段同时有by和time，有的只有by，需要分类

    /**
     * 修改
     */
    UPDATE,

    /**
     * 新增
     */
    INSERT;

}
