package com.dkd.manage.domain.dto;

import lombok.Data;

/**
 * <p>
 *
 * @description : 某个货道对应的sku信息
 * <p>
 * @Author : Ryan/Rui.Zhang
 * @since : 2024/9/19.
 */
@Data
public class ChannelSkuDto {

    private String innerCode;
    private String channelCode;
    private Long skuId;
}
