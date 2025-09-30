package com.dkd.manage.domain.vo;

import com.dkd.manage.domain.Channel;
import com.dkd.manage.domain.Sku;
import lombok.Data;

/**
 * <p>
 *
 * @description :
 * <p>
 * @Author : Rui
 * @since : 2024/9/19.
 */
@Data
public class ChannelVo extends Channel {

    // 商品
    private Sku sku;
}
