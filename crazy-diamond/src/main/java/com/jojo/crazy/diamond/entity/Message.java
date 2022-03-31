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
 * 消息表
 * </p>
 *
 * @author Clozer
 * @since 2022-03-29 10:27:29
 */
@Getter
@Setter
@TableName("message")
@ApiModel(value = "Message对象", description = "消息表")
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("发送渠道")
    @TableField("`channel`")
    private String channel;

    @ApiModelProperty("消息类型")
    @TableField("`type`")
    private String type;

    @ApiModelProperty("是否已读")
    @TableField("`read`")
    private String read;

    @ApiModelProperty("发送人类型")
    @TableField("sender_type")
    private String senderType;

    @ApiModelProperty("发送人")
    @TableField("sender")
    private String sender;

    @ApiModelProperty("接收人类型")
    @TableField("receiver_type")
    private String receiverType;

    @ApiModelProperty("接收人")
    @TableField("receiver")
    private String receiver;

    @ApiModelProperty("标题")
    @TableField("title")
    private String title;

    @ApiModelProperty("发送内容类型")
    @TableField("content_type")
    private String contentType;

    @ApiModelProperty("发送内容")
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
