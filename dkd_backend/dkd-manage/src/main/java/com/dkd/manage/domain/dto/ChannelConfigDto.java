package com.dkd.manage.domain.dto;

import lombok.Data;

import java.util.List;

/**
 * <p>
 *
 * @description :
 * <p>
 * @Author : Ryan/Rui.Zhang
 * @since : 2024/9/19.
 */
@Data
public class ChannelConfigDto {

    // 售货机编号
    private String innerCode;
    // 货道配置
    private List<ChannelSkuDto> channelList;

}
