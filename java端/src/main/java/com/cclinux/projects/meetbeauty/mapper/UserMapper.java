package com.cclinux.projects.meetbeauty.mapper;

import com.cclinux.framework.core.mapper.ProjectBaseMapper;
import com.cclinux.projects.meetbeauty.model.UserModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository("MeetBeautyUserMapper")
@Mapper
public interface UserMapper extends ProjectBaseMapper<UserModel> {
}
