package com.jojo.crazy.diamond.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jojo.crazy.diamond.entity.Posts;
import com.jojo.crazy.diamond.vo.PostsVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 帖子表 Mapper 接口
 * </p>
 *
 * @author Clozer
 * @since 2022-03-29 10:27:29
 */
@Mapper
public interface PostsMapper extends BaseMapper<Posts> {

    List<PostsVo> selectPostVos();

}
