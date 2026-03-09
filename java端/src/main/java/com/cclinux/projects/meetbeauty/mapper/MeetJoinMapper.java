package com.cclinux.projects.meetbeauty.mapper;

import com.cclinux.framework.core.mapper.ProjectBaseMapper;
import com.cclinux.projects.meetbeauty.model.MeetJoinModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("MeetBeautyMeetJoinMapper")
@Mapper
public interface MeetJoinMapper extends ProjectBaseMapper<MeetJoinModel> {

}
