package com.dkd.manage.domain.vo;

import com.dkd.manage.domain.Node;
import com.dkd.manage.domain.Partner;
import com.dkd.manage.domain.Region;
import lombok.Data;

/**
 * <p>
 *
 * @description :
 * <p>
 * @Author : Rui
 * @since : 2024/9/14.
 */
@Data
public class NodeVo extends Node {

    private int vmCount;

    private Region region;

    private Partner partner;

}
