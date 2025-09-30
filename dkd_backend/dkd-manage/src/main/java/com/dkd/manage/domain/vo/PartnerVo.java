package com.dkd.manage.domain.vo;

import com.dkd.manage.domain.Partner;
import lombok.Data;

/**
 * <p>
 *
 * @description :
 * <p>
 * @Author : Rui
 * @since : 2024/9/12.
 */
@Data
public class PartnerVo extends Partner {

    // 点位数量
    private int nodeCount;
}
