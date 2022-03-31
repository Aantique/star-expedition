package com.jojo.stone.free.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @author Clozer
 * @date 2022/3/27 1:42 PM
 */
@Slf4j
@Component
public class TimeMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("start insert");
        this.setFieldValByName("create_at",LocalDateTime.now(),metaObject);
        this.setFieldValByName("update_at",LocalDateTime.now(),metaObject);
        this.setFieldValByName("is_delete",false,metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        setFieldValByName("update_at",LocalDateTime.now(),metaObject);
    }
}
