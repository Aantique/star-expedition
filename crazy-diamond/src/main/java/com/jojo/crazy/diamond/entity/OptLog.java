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
 * 操作日志表
 * </p>
 *
 * @author Clozer
 * @since 2022-03-29 10:27:29
 */
@Getter
@Setter
@TableName("opt_log")
@ApiModel(value = "OptLog对象", description = "操作日志表")
public class OptLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("操作类型")
    @TableField("`type`")
    private String type;

    @ApiModelProperty("操作人ID")
    @TableField("operator_id")
    private Long operatorId;

    @ApiModelProperty("操作内容")
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
