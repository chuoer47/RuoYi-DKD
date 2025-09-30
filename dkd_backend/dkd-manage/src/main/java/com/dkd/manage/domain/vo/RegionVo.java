package com.dkd.manage.domain.vo;

import com.dkd.manage.domain.Region;
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
public class RegionVo extends Region {

    // 点位数
    private Integer nodeCount;
}
