package com.jojo.crazy.diamond.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jojo.crazy.diamond.entity.TagPostsMapping;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 标签-帖子关系表 Mapper 接口
 * </p>
 *
 * @author Clozer
 * @since 2022-03-29 10:27:29
 */
@Mapper
public interface TagPostsMappingMapper extends BaseMapper<TagPostsMapping> {

}
