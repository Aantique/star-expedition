package com.jojo.stone.free.utils;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jojo.stone.free.req.PageReq;
import org.springframework.beans.BeanUtils;

import java.util.List;

/**
 * @author Clozer
 * @date 2022/3/30 17:29
 */
public class PageUtils {

    public static <T> IPage<T> getPages(BaseMapper<T> mapper,PageReq pageReq){
        IPage<T> page = new Page<T>(pageReq.getCurrent(),pageReq.getSize());
        mapper.selectPage(page,null);
        return page;
    }

    public static <T> IPage<T> getPagesByWrapper(BaseMapper<T> mapper, PageReq pageReq, Wrapper<T> wa){
        IPage<T> page = new Page<T>(pageReq.getCurrent(),pageReq.getSize());
        mapper.selectPage(page,wa);
        return page;
    }

}
