package com.dkd.framework.web.enumerate;

import lombok.Getter;

/**
 * <p>
 *
 * @description : 枚举类型
 * <p>
 * @Author : Rui
 * @since : 2024/9/14.
 */
@Getter
public enum IntegrityViolationType {

    FOREIGN_KEY("foreign", "无法删除，有其他数据引用"),

    UNIQUE_CONSTRAINT("unique constraint", "唯一性约束违反，请检查数据"),

    DUPLICATE("Duplicate", "重复数据，请检查数据"),

    NOT_NULL_CONSTRAINT("not-null constraint", "非空约束违反，请检查数据");

    /**
     * 默认异常
     */
    // DEFAULT("", "您的操作违反了数据库中的完整性约束");

    private final String keyword;
    private final String message;

    IntegrityViolationType(String keyword, String message) {
        this.keyword = keyword;
        this.message = message;
    }


    }
