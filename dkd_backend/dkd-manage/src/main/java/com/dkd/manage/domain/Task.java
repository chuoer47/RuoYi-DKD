package com.dkd.manage.domain;

import lombok.Getter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.dkd.common.annotation.Excel;
import com.dkd.common.core.domain.BaseEntity;

/**
 * 工单对象 tb_task
 * 
 * @author ruoyi
 * @date 2024-09-19
 */
@Getter
public class Task extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 工单ID */
    private Long taskId;

    /** 工单编号 */
    @Excel(name = "工单编号")
    private String taskCode;

    /** 工单状态 */
    @Excel(name = "工单状态")
    private Long taskStatus;

    /** 创建类型 0：自动 1：手动 */
    @Excel(name = "创建类型 0：自动 1：手动")
    private Long createType;

    /** 售货机编码 */
    @Excel(name = "售货机编码")
    private String innerCode;

    /** 执行人id */
    @Excel(name = "执行人id")
    private Long userId;

    /** 执行人名称 */
    @Excel(name = "执行人名称")
    private String userName;

    /** 所属区域Id */
    @Excel(name = "所属区域Id")
    private Long regionId;

    /** 备注 */
    @Excel(name = "备注")
    private String desc;

    /** 工单类型id */
    @Excel(name = "工单类型id")
    private Long productTypeId;

    /** 指派人Id */
    @Excel(name = "指派人Id")
    private Long assignorId;

    /** 地址 */
    @Excel(name = "地址")
    private String addr;

    public void setTaskId(Long taskId) 
    {
        this.taskId = taskId;
    }

    public void setTaskCode(String taskCode)
    {
        this.taskCode = taskCode;
    }

    public void setTaskStatus(Long taskStatus)
    {
        this.taskStatus = taskStatus;
    }

    public void setCreateType(Long createType)
    {
        this.createType = createType;
    }

    public void setInnerCode(String innerCode)
    {
        this.innerCode = innerCode;
    }

    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public void setRegionId(Long regionId)
    {
        this.regionId = regionId;
    }

    public void setDesc(String desc)
    {
        this.desc = desc;
    }

    public void setProductTypeId(Long productTypeId)
    {
        this.productTypeId = productTypeId;
    }

    public void setAssignorId(Long assignorId)
    {
        this.assignorId = assignorId;
    }

    public void setAddr(String addr)
    {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("taskId", getTaskId())
            .append("taskCode", getTaskCode())
            .append("taskStatus", getTaskStatus())
            .append("createType", getCreateType())
            .append("innerCode", getInnerCode())
            .append("userId", getUserId())
            .append("userName", getUserName())
            .append("regionId", getRegionId())
            .append("desc", getDesc())
            .append("productTypeId", getProductTypeId())
            .append("assignorId", getAssignorId())
            .append("addr", getAddr())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
