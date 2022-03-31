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
 * 标签表
 * </p>
 *
 * @author Clozer
 * @since 2022-03-29 10:27:29
 */
@Getter
@Setter
@TableName("tag")
@ApiModel(value = "Tag对象", description = "标签表")
public class Tag implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("审核状态")
    @TableField("audit_state")
    private String auditState;

    @ApiModelProperty("所属分组")
    @TableField("group_name")
    private String groupName;

    @ApiModelProperty("名称")
    @TableField("`name`")
    private String name;

    @ApiModelProperty("描述")
    @TableField("description")
    private String description;

    @ApiModelProperty("引用统计")
    @TableField("ref_count")
    private Long refCount;

    @ApiModelProperty("创建人")
    @TableField("creator_id")
    private Long creatorId;

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
