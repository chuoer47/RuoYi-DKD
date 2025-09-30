package com.dkd.manage.service.impl;

import java.util.List;

import cn.hutool.core.bean.BeanUtil;
import com.dkd.common.utils.DateUtils;
import com.dkd.manage.domain.Node;
import com.dkd.manage.service.INodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dkd.manage.mapper.VendingMachineMapper;
import com.dkd.manage.domain.VendingMachine;
import com.dkd.manage.service.IVendingMachineService;

/**
 * 设备管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-09-17
 */
@Service
public class VendingMachineServiceImpl implements IVendingMachineService 
{
    @Autowired
    private VendingMachineMapper vendingMachineMapper;
    @Autowired
    private INodeService nodeService;


    /**
     * 查询设备管理
     * 
     * @param id 设备管理主键
     * @return 设备管理
     */
    @Override
    public VendingMachine selectVendingMachineById(Long id)
    {
        return vendingMachineMapper.selectVendingMachineById(id);
    }

    /**
     * 查询设备管理列表
     * 
     * @param vendingMachine 设备管理
     * @return 设备管理
     */
    @Override
    public List<VendingMachine> selectVendingMachineList(VendingMachine vendingMachine)
    {
        return vendingMachineMapper.selectVendingMachineList(vendingMachine);
    }

    /**
     * 新增设备管理
     * 
     * @param vendingMachine 设备管理
     * @return 结果
     */
    @Override
    public int insertVendingMachine(VendingMachine vendingMachine)
    {
        vendingMachine.setCreateTime(DateUtils.getNowDate());
        return vendingMachineMapper.insertVendingMachine(vendingMachine);
    }

    /**
     * 修改设备管理
     * 
     * @param vendingMachine 设备管理
     * @return 结果
     */
    @Override
    public int updateVendingMachine(VendingMachine vendingMachine)
    {
        if (vendingMachine.getNodeId()!=null) {
            // 查询点位表，补充：区域、点位、合作商等信息
            Node node = nodeService.selectNodeById(vendingMachine.getNodeId());
            BeanUtil.copyProperties(node,vendingMachine,"id");// 商圈类型、区域、合作商
            vendingMachine.setAddr(node.getAddress());// 设备地址
        }
        vendingMachine.setUpdateTime(DateUtils.getNowDate());// 更新时间
        return vendingMachineMapper.updateVendingMachine(vendingMachine);
    }

    /**
     * 批量删除设备管理
     * 
     * @param ids 需要删除的设备管理主键
     * @return 结果
     */
    @Override
    public int deleteVendingMachineByIds(Long[] ids)
    {
        return vendingMachineMapper.deleteVendingMachineByIds(ids);
    }

    /**
     * 删除设备管理信息
     * 
     * @param id 设备管理主键
     * @return 结果
     */
    @Override
    public int deleteVendingMachineById(Long id)
    {
        return vendingMachineMapper.deleteVendingMachineById(id);
    }

    /**
     * 根据设备编号查询设备信息
     *
     * @param innerCode
     * @return VendingMachine
     */
    public VendingMachine selectVendingMachineByInnerCode(String innerCode){
        return vendingMachineMapper.selectVendingMachineByInnerCode(innerCode);
    }
}
