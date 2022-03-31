package com.jojo.crazy.diamond.vo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author Clozer
 * @date 2022/3/31 14:08
 */
@Data
public class PostsVo {

    private Long id;
    private String auditState;
    private String category;
    private Long authorId;
    private String title;
    private String contentType;
    private Long views;
    private Long approvals;
    private Long comments;
    private Long typeId;
    private String headImg;
    private Integer official;
    private Integer top;
    private Integer sort;
    private Integer marrow;
    private Long commentId;
    private Integer isDelete;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
}
