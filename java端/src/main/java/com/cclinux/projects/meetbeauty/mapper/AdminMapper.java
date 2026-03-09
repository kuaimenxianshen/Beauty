package com.cclinux.projects.meetbeauty.mapper;

import com.cclinux.framework.core.mapper.ProjectBaseMapper;
import com.cclinux.projects.meetbeauty.model.AdminModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository("MeetBeautyAdminMapper")
@Mapper
public interface AdminMapper extends ProjectBaseMapper<AdminModel> {
}
