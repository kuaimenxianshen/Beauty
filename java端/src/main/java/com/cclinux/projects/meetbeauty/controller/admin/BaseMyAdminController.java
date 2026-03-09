package com.cclinux.projects.meetbeauty.controller.admin;

import com.cclinux.framework.core.platform.controller.BaseAdminController;
import com.cclinux.projects.meetbeauty.service.admin.AdminMgrService;

import javax.annotation.Resource;

/**
 * @Notes: 本项目管理系统控制器基类
 * @Author: cclinux0730 (weixin)
 * @Ver: ccminicloud-framework 3.2.1
 */
public class BaseMyAdminController extends BaseAdminController {
    @Resource(name = "MeetBeautyAdminMgrService")
    private AdminMgrService adminMgrService;

}
