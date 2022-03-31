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
 * 帖子表
 * </p>
 *
 * @author Clozer
 * @since 2022-03-29 10:27:29
 */
@Getter
@Setter
@TableName("posts")
@ApiModel(value = "Posts对象", description = "帖子表")
public class Posts implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("审核状态")
    @TableField("audit_state")
    private String auditState;

    @ApiModelProperty("类别")
    @TableField("category")
    private String category;

    @ApiModelProperty("作者ID")
    @TableField("author_id")
    private Long authorId;

    @ApiModelProperty("标题")
    @TableField("title")
    private String title;

    @ApiModelProperty("内容类型")
    @TableField("content_type")
    private String contentType;

    @ApiModelProperty("markdown内容")
    @TableField("markdown_content")
    private String markdownContent;

    @ApiModelProperty("html内容")
    @TableField("html_content")
    private String htmlContent;

    @ApiModelProperty("浏览量")
    @TableField("views")
    private Long views;

    @ApiModelProperty("点赞量/收藏量")
    @TableField("approvals")
    private Long approvals;

    @ApiModelProperty("评论量")
    @TableField("comments")
    private Long comments;

    @ApiModelProperty("文章类型ID")
    @TableField("type_id")
    private Long typeId;

    @ApiModelProperty("文章头图")
    @TableField("head_img")
    private String headImg;

    @ApiModelProperty("官方")
    @TableField("official")
    private Integer official;

    @ApiModelProperty("置顶")
    @TableField("top")
    private Integer top;

    @ApiModelProperty("排序")
    @TableField("sort")
    private Integer sort;

    @ApiModelProperty("精华")
    @TableField("marrow")
    private Integer marrow;

    @ApiModelProperty("问答最佳答案ID")
    @TableField("comment_id")
    private Long commentId;

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
