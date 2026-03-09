package com.cclinux.projects.meetbeauty.mapper;

import com.cclinux.framework.core.mapper.ProjectBaseMapper;
import com.cclinux.projects.meetbeauty.model.MeetModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("MeetBeautyMeetMapper")
@Mapper
public interface MeetMapper extends ProjectBaseMapper<MeetModel> {
}
