package com.jojo.crazy.diamond.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jojo.crazy.diamond.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author Clozer
 * @since 2022-03-29 10:27:29
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
