insert into sys_menu (menu_id, menu_name, parent_id, order_num, path, component, is_frame, is_cache, visible, menu_type, del_flag, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values ('2000', '点位管理', '0', '2', 'node', NULL, NULL, '1', '0', 'M', '0', '0', NULL, '点位管理', 'admin', '2025-09-29 16:56:27', '', NULL, '');

insert into sys_menu (menu_id, menu_name, parent_id, order_num, path, component, is_frame, is_cache, visible, menu_type, del_flag, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values ('2001', '区域管理', '2000', '1', 'region', 'manage/region/index', NULL, '1', '0', 'C', '0', '0', 'manage:region:list', '#', 'admin', '2025-09-29 09:02:46', '', NULL, '区域管理菜单');

insert into sys_menu (menu_id, menu_name, parent_id, order_num, path, component, is_frame, is_cache, visible, menu_type, del_flag, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values ('2003', '点位管理', '2000', '2', 'node', 'manage/node/index', NULL, '1', '0', 'C', '0', '0', 'manage:node:list', '点位管理', 'admin', '2025-09-29 17:07:49', 'admin', '2025-09-29 17:10:31', '');

insert into sys_menu (menu_id, menu_name, parent_id, order_num, path, component, is_frame, is_cache, visible, menu_type, del_flag, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values ('2004', '合作商管理', '2000', '3', 'partner', 'manage/partner/index', NULL, '1', '0', 'C', '0', '0', 'manage:partner:list', '#', 'admin', '2025-09-29 17:11:52', '', NULL, '');

insert into sys_menu (menu_id, menu_name, parent_id, order_num, path, component, is_frame, is_cache, visible, menu_type, del_flag, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values ('2005', '人员管理', '0', '4', 'emp', NULL, NULL, '1', '0', 'M', '0', '0', NULL, 'peoples', 'admin', '2025-09-29 17:19:46', '', NULL, '');

insert into sys_menu (menu_id, menu_name, parent_id, order_num, path, component, is_frame, is_cache, visible, menu_type, del_flag, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values ('2006', '人员列表', '2005', '1', 'emp', 'manage/emp/index', NULL, '1', '0', 'C', '0', '0', 'manage:emp:list', '#', 'admin', '2025-09-29 17:22:40', '', NULL, '');

insert into sys_menu (menu_id, menu_name, parent_id, order_num, path, component, is_frame, is_cache, visible, menu_type, del_flag, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values ('2007', '设备管理', '0', '3', 'vm', NULL, NULL, '1', '0', 'M', '0', '0', NULL, '设备管理', 'admin', '2025-09-29 17:24:26', '', NULL, '');

insert into sys_menu (menu_id, menu_name, parent_id, order_num, path, component, is_frame, is_cache, visible, menu_type, del_flag, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values ('2008', '设备管理', '2007', '1', 'vm', 'manage/vm/index', NULL, '1', '0', 'C', '0', '0', 'manage:vm:list', '设备管理', 'admin', '2025-09-29 17:25:48', '', NULL, '');

insert into sys_menu (menu_id, menu_name, parent_id, order_num, path, component, is_frame, is_cache, visible, menu_type, del_flag, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values ('2009', '设备状态', '2007', '2', 'vmStatus', 'manage/vmStatus/index', NULL, '1', '0', 'C', '0', '0', 'manage:vm:list', '#', 'admin', '2025-09-29 17:28:50', 'admin', '2025-09-29 17:34:01', '');

insert into sys_menu (menu_id, menu_name, parent_id, order_num, path, component, is_frame, is_cache, visible, menu_type, del_flag, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values ('2010', '设备类型管理', '2007', '3', 'vmType', 'manage/vmType/index', NULL, '1', '0', 'C', '0', '0', 'manage:vmType:list', '#', 'admin', '2025-09-29 17:31:36', '', NULL, '');

insert into sys_menu (menu_id, menu_name, parent_id, order_num, path, component, is_frame, is_cache, visible, menu_type, del_flag, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values ('2011', '策略管理', '0', '7', 'policy', NULL, NULL, '1', '0', 'M', '0', '0', NULL, '策略管理', 'admin', '2025-09-29 17:39:36', '', NULL, '');

insert into sys_menu (menu_id, menu_name, parent_id, order_num, path, component, is_frame, is_cache, visible, menu_type, del_flag, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values ('2012', '策略管理', '2011', '1', 'policy', 'manage/policy/index', NULL, '1', '0', 'C', '0', '0', 'manage:policy:list', '#', 'admin', '2025-09-29 17:40:22', 'admin', '2025-09-29 17:40:52', '');

insert into sys_menu (menu_id, menu_name, parent_id, order_num, path, component, is_frame, is_cache, visible, menu_type, del_flag, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values ('2013', '商品管理', '0', '5', 'sku', NULL, NULL, '1', '0', 'M', '0', '0', NULL, '商品管理', 'admin', '2025-09-30 10:26:51', '', NULL, '');

insert into sys_menu (menu_id, menu_name, parent_id, order_num, path, component, is_frame, is_cache, visible, menu_type, del_flag, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values ('2014', '商品管理', '2013', '2', 'sku', 'manage/sku/index', NULL, '1', '0', 'C', '0', '0', 'manage:sku:list', '#', 'admin', '2025-09-30 10:27:50', 'admin', '2025-09-30 10:29:24', '');

insert into sys_menu (menu_id, menu_name, parent_id, order_num, path, component, is_frame, is_cache, visible, menu_type, del_flag, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values ('2015', '商品类型', '2013', '1', 'skuClass', 'manage/skuClass/index', NULL, '1', '0', 'C', '0', '0', 'manage:skuClass:list', '#', 'admin', '2025-09-30 10:28:54', 'admin', '2025-09-30 10:30:07', '');

insert into sys_menu (menu_id, menu_name, parent_id, order_num, path, component, is_frame, is_cache, visible, menu_type, del_flag, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values ('2016', '工单管理', '0', '1', 'task', NULL, NULL, '1', '0', 'M', '0', '0', NULL, '工单管理', 'admin', '2025-09-30 10:33:06', '', NULL, '');

insert into sys_menu (menu_id, menu_name, parent_id, order_num, path, component, is_frame, is_cache, visible, menu_type, del_flag, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values ('2017', '运营工单', '2016', '1', 'task', 'manage/task/business', NULL, '1', '0', 'C', '0', '0', 'manage:task:list', '#', 'admin', '2025-09-30 10:39:24', 'admin', '2025-09-30 10:40:42', '');

insert into sys_menu (menu_id, menu_name, parent_id, order_num, path, component, is_frame, is_cache, visible, menu_type, del_flag, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values ('2018', '运维工单', '2016', '2', 'operation', 'manage/task/operation', NULL, '1', '0', 'C', '0', '0', 'manage:task:list', '#', 'admin', '2025-09-30 10:41:53', '', NULL, '');
