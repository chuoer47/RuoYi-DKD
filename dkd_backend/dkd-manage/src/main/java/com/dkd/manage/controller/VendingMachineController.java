package com.dkd.manage.controller;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

import cn.hutool.core.bean.BeanUtil;
import com.dkd.common.constant.DkdContants;
import com.dkd.common.utils.DateUtils;
import com.dkd.common.utils.uuid.UUIDUtils;
import com.dkd.manage.domain.Channel;
import com.dkd.manage.domain.Node;
import com.dkd.manage.domain.VmType;
import com.dkd.manage.mapper.VendingMachineMapper;
import com.dkd.manage.service.IChannelService;
import com.dkd.manage.service.INodeService;
import com.dkd.manage.service.IVmTypeService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dkd.common.annotation.Log;
import com.dkd.common.core.controller.BaseController;
import com.dkd.common.core.domain.AjaxResult;
import com.dkd.common.enums.BusinessType;
import com.dkd.manage.domain.VendingMachine;
import com.dkd.manage.service.IVendingMachineService;
import com.dkd.common.utils.poi.ExcelUtil;
import com.dkd.common.core.page.TableDataInfo;

/**
 * 设备管理Controller
 * 
 * @author ruoyi
 * @date 2024-09-17
 */
@RestController
@RequestMapping("/manage/vm")
public class VendingMachineController extends BaseController
{
    @Autowired
    private IVendingMachineService vendingMachineService;
    @Autowired
    private INodeService nodeService;
    @Autowired
    private IVmTypeService vmTypeService;
    @Autowired
    private IChannelService channelService;
    @Autowired
    private VendingMachineMapper vendingMachineMapper;

    /**
     * 查询设备管理列表
     */
    @PreAuthorize("@ss.hasPermi('manage:vm:list')")
    @GetMapping("/list")
    public TableDataInfo list(VendingMachine vendingMachine)
    {
        startPage();
        List<VendingMachine> list = vendingMachineService.selectVendingMachineList(vendingMachine);
        return getDataTable(list);
    }

    /**
     * 导出设备管理列表
     */
    @PreAuthorize("@ss.hasPermi('manage:vm:export')")
    @Log(title = "设备管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VendingMachine vendingMachine)
    {
        List<VendingMachine> list = vendingMachineService.selectVendingMachineList(vendingMachine);
        ExcelUtil<VendingMachine> util = new ExcelUtil<VendingMachine>(VendingMachine.class);
        util.exportExcel(response, list, "设备管理数据");
    }

    /**
     * 获取设备管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('manage:vm:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(vendingMachineService.selectVendingMachineById(id));
    }

    /**
     * 新增设备管理
     */
    @PreAuthorize("@ss.hasPermi('manage:vm:add')")
    @Log(title = "设备管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VendingMachine vendingMachine)
    {
        //1. 新增设备
        //1-1 生成8位编号，补充货道编号
        String innerCode = UUIDUtils.getUUID();
        vendingMachine.setInnerCode(innerCode); // 售货机编号
        //1-2 查询售货机类型表，补充设备容量
        VmType vmType = vmTypeService.selectVmTypeById(vendingMachine.getVmTypeId());
        vendingMachine.setChannelMaxCapacity(vmType.getChannelMaxCapacity());
        //1-3 查询点位表，补充 区域、点位、合作商等信息
        Node node = nodeService.selectNodeById(vendingMachine.getNodeId());
        BeanUtil.copyProperties(node, vendingMachine, "id");
        vendingMachine.setAddr(node.getAddress());
        //1-4 设备状态
        vendingMachine.setVmStatus(DkdContants.VM_STATUS_NODEPLOY);// 0-未投放（数据库有默认值，这个不写也不影响）
        vendingMachine.setCreateTime(DateUtils.getNowDate());// 创建时间
        vendingMachine.setUpdateTime(DateUtils.getNowDate());// 更新时间
        //1-5 保存
        int result = vendingMachineMapper.insertVendingMachine(vendingMachine);
        //2. 新增货道
        //2-1 声明货道集合
        List<Channel> channelList = new ArrayList<>();
        //2-2 双层for循环
        for (int i = 1; i <= vmType.getVmRow(); i++) { // 外层行
            for (int j = 1; j <= vmType.getVmCol(); j++) {// 内层列
                //2-3 封装channel
                Channel channel = new Channel();
                channel.setChannelCode(i + "-" + j);// 货道编号
                channel.setVmId(vendingMachine.getId());// 售货机id
                channel.setInnerCode(vendingMachine.getInnerCode());// 售货机编号
                channel.setMaxCapacity(vmType.getChannelMaxCapacity());// 货道最大容量
                channel.setCreateTime(DateUtils.getNowDate());// 创建时间
                channel.setUpdateTime(DateUtils.getNowDate());// 更新时间
                channelList.add(channel);
            }
        }
        //2-4 批量新增
        channelService.batchInsertChannel(channelList);
        return AjaxResult.success(result);
    }

    /**
     * 修改设备管理
     */
    @PreAuthorize("@ss.hasPermi('manage:vm:edit')")
    @Log(title = "设备管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VendingMachine vendingMachine)
    {
        return toAjax(vendingMachineService.updateVendingMachine(vendingMachine));
    }

    /**
     * 删除设备管理
     */
    @PreAuthorize("@ss.hasPermi('manage:vm:remove')")
    @Log(title = "设备管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(vendingMachineService.deleteVendingMachineByIds(ids));
    }
}
