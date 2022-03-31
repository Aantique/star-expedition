package com.jojo.stone.free.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Qiangqiang.Bian
 * @create 2020/10/31
 * @desc
 **/
@Getter
@AllArgsConstructor
public enum PostsCategoryEn {
    ARTICLE("ARTICLE", "文章"),
    FAQ("FAQ", "问答"),
    ;
    private String value;
    private String desc;
}
