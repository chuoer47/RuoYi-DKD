-- 字典类型表（sys_dict_type）数据插入
insert into sys_dict_type (dict_id, dict_name, dict_type, status, create_by, create_time, update_by, update_time, remark)
values ('100', '商圈类型', 'business_type', '0', 'admin', '2025-09-29 16:57:29', '', NULL, '商圈类型');

insert into sys_dict_type (dict_id, dict_name, dict_type, status, create_by, create_time, update_by, update_time, remark)
values ('101', '员工状态', 'emp_status', '0', 'admin', '2025-09-29 17:20:27', '', NULL, '员工状态');

insert into sys_dict_type (dict_id, dict_name, dict_type, status, create_by, create_time, update_by, update_time, remark)
values ('102', '设备状态', 'vm_status', '0', 'admin', '2025-09-29 17:26:42', '', NULL, '设备状态');

insert into sys_dict_type (dict_id, dict_name, dict_type, status, create_by, create_time, update_by, update_time, remark)
values ('103', '工单状态', 'task_status', '0', 'admin', '2025-09-30 10:33:34', '', NULL, '工单状态');

insert into sys_dict_type (dict_id, dict_name, dict_type, status, create_by, create_time, update_by, update_time, remark)
values ('104', '工单创建类型', 'task_create_type', '0', 'admin', '2025-09-30 10:34:52', '', NULL, '工单创建类型');

-- 字典数据表（sys_dict_data）数据插入
insert into sys_dict_data (dict_code, dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, update_by, update_time, remark)
values ('100', '1', '旅游区', '1', 'business_type', NULL, 'default', 'N', '0', 'admin', '2025-09-29 16:57:58', '', NULL, NULL);

insert into sys_dict_data (dict_code, dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, update_by, update_time, remark)
values ('101', '2', '商场', '2', 'business_type', NULL, 'default', 'N', '0', 'admin', '2025-09-29 16:58:08', '', NULL, NULL);

insert into sys_dict_data (dict_code, dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, update_by, update_time, remark)
values ('102', '3', '学校', '3', 'business_type', NULL, 'default', 'N', '0', 'admin', '2025-09-29 16:58:16', '', NULL, NULL);

insert into sys_dict_data (dict_code, dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, update_by, update_time, remark)
values ('103', '4', '交通枢纽', '4', 'business_type', NULL, 'default', 'N', '0', 'admin', '2025-09-29 16:58:23', '', NULL, NULL);

insert into sys_dict_data (dict_code, dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, update_by, update_time, remark)
values ('104', '1', '启用', '1', 'emp_status', NULL, 'default', 'N', '0', 'admin', '2025-09-29 17:20:43', '', NULL, NULL);

insert into sys_dict_data (dict_code, dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, update_by, update_time, remark)
values ('105', '2', '停用', '0', 'emp_status', NULL, 'default', 'N', '0', 'admin', '2025-09-29 17:20:52', '', NULL, NULL);

insert into sys_dict_data (dict_code, dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, update_by, update_time, remark)
values ('106', '1', '未投放', '0', 'vm_status', NULL, 'default', 'N', '0', 'admin', '2025-09-29 17:26:59', '', NULL, NULL);

insert into sys_dict_data (dict_code, dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, update_by, update_time, remark)
values ('107', '2', '运营', '1', 'vm_status', NULL, 'default', 'N', '0', 'admin', '2025-09-29 17:27:05', '', NULL, NULL);

insert into sys_dict_data (dict_code, dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, update_by, update_time, remark)
values ('108', '3', '撤机', '3', 'vm_status', NULL, 'default', 'N', '0', 'admin', '2025-09-29 17:27:16', '', NULL, NULL);

insert into sys_dict_data (dict_code, dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, update_by, update_time, remark)
values ('109', '1', '代办', '1', 'task_status', NULL, 'default', 'N', '0', 'admin', '2025-09-30 10:33:54', '', NULL, NULL);

insert into sys_dict_data (dict_code, dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, update_by, update_time, remark)
values ('110', '2', '进行', '2', 'task_status', NULL, 'default', 'N', '0', 'admin', '2025-09-30 10:33:59', '', NULL, NULL);

insert into sys_dict_data (dict_code, dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, update_by, update_time, remark)
values ('111', '3', '取消', '3', 'task_status', NULL, 'default', 'N', '0', 'admin', '2025-09-30 10:34:07', '', NULL, NULL);

insert into sys_dict_data (dict_code, dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, update_by, update_time, remark)
values ('112', '4', '已完成', '4', 'task_status', NULL, 'default', 'N', '0', 'admin', '2025-09-30 10:34:20', '', NULL, NULL);

insert into sys_dict_data (dict_code, dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, update_by, update_time, remark)
values ('113', '1', '自动', '0', 'task_create_type', NULL, 'default', 'N', '0', 'admin', '2025-09-30 10:35:17', '', NULL, NULL);

insert into sys_dict_data (dict_code, dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, update_by, update_time, remark)
values ('114', '2', '手动', '1', 'task_create_type', NULL, 'default', 'N', '0', 'admin', '2025-09-30 10:35:25', '', NULL, NULL);
