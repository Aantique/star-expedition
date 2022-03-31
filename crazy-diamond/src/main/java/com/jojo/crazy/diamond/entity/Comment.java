package com.jojo.crazy.diamond.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 帖子评论表
 * </p>
 *
 * @author Clozer
 * @since 2022-03-29 10:27:29
 */
@Getter
@Setter
@TableName("comment")
@ApiModel(value = "Comment对象", description = "帖子评论表")
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("评论人ID")
    @TableField("user_id")
    private Long userId;

    @ApiModelProperty("被评论ID")
    @TableField("reply_id")
    private Long replyId;

    @ApiModelProperty("二次被评论ID")
    @TableField("reply_reply_id")
    private Long replyReplyId;

    @ApiModelProperty("帖子ID")
    @TableField("posts_id")
    private Long postsId;

    @ApiModelProperty("内容")
    @TableField("content")
    private String content;

    @ApiModelProperty("删除标识（0:未删除、1:已删除）")
    @TableField("is_delete")
    private Integer isDelete;

    @ApiModelProperty("记录创建时间")
    @TableField(value = "create_at", fill = FieldFill.INSERT)
    private LocalDateTime createAt;

    @ApiModelProperty("记录修改时间")
    @TableField(value = "update_at", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateAt;


}
