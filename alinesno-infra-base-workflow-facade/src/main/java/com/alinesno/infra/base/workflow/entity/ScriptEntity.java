package com.alinesno.infra.base.workflow.entity;

import com.alinesno.infra.common.facade.mapper.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@TableName("script")
public class ScriptEntity extends BaseEntity {

    // 应用名称
    @ColumnType(length=32)
    @ColumnComment("应用名称")
    @TableField("application_name")
    private String applicationName;

    // 脚本ID
    @ColumnType(length=32)
    @ColumnComment("脚本ID")
    @TableField("script_id")
    private String scriptId;

    // 脚本名称
    @ColumnType(length=64)
    @ColumnComment("脚本名称")
    @TableField("script_name")
    private String scriptName;

    // 脚本数据
    @ColumnType(value= MySqlTypeConstant.TEXT)
    @ColumnComment("脚本数据")
    @TableField("script_data")
    private String scriptData;

    // 脚本类型
    @ColumnType(length=16)
    @ColumnComment("脚本类型")
    @TableField("script_type")
    private String scriptType;

}
