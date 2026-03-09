package com.cclinux.projects.meetbeauty.mapper;

import com.cclinux.framework.core.mapper.ProjectBaseMapper;
import com.cclinux.projects.meetbeauty.model.FavModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("MeetBeautyFavMapper")
@Mapper
public interface FavMapper extends ProjectBaseMapper<FavModel> {
}
