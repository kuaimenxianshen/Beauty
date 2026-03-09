package com.cclinux.projects.meetbeauty.service.cust;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.crypto.digest.DigestUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.cclinux.framework.core.mapper.UpdateWhere;
import com.cclinux.framework.core.mapper.Where;
import com.cclinux.framework.helper.FakerHelper;
import com.cclinux.framework.helper.TimeHelper;
import com.cclinux.projects.meetbeauty.mapper.MeetJoinMapper;
import com.cclinux.projects.meetbeauty.mapper.MeetMapper;
import com.cclinux.projects.meetbeauty.mapper.NewsMapper;
import com.cclinux.projects.meetbeauty.mapper.UserMapper;
import com.cclinux.projects.meetbeauty.model.MeetJoinModel;
import com.cclinux.projects.meetbeauty.model.MeetModel;
import com.cclinux.projects.meetbeauty.model.NewsModel;
import com.cclinux.projects.meetbeauty.model.UserModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Notes: 活动模块业务逻辑
 * @Author: cclinux0730 (weixin)
 * @Ver: ccminicloud-framework 3.2.1
 */

@Service("MeetBeautyTestService")
public class TestService extends BaseMyCustService {

    @Resource(name = "MeetBeautyMeetMapper")
    private MeetMapper meetMapper;

    @Resource(name = "MeetBeautyMeetJoinMapper")
    private MeetJoinMapper meetJoinMapper;

    @Resource(name = "MeetBeautyUserMapper")
    private UserMapper userMapper;

    @Resource(name = "MeetBeautyNewsMapper")
    private NewsMapper newsMapper;


    public void mockMeetBeauty() {


    }

 
}
