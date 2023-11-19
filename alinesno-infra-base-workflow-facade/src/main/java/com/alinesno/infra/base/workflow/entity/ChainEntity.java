package com.alinesno.infra.base.workflow.entity;

import com.alinesno.infra.common.facade.mapper.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@TableName("chain")
public class ChainEntity extends BaseEntity {

    // 应用名称
    @ColumnType(length=32)
    @ColumnComment("应用名称")
    @TableField("application_name")
    private String applicationName;

    // 链名称
    @ColumnType(length=32)
    @ColumnComment("链名称")
    @TableField("chain_name")
    private String chainName;

    // 链描述
    @ColumnType(length=64)
    @ColumnComment("链描述")
    @TableField("chain_desc")
    private String chainDesc;

    // EL 数据
    @ColumnType(value = MySqlTypeConstant.TEXT)
    @ColumnComment("EL 数据")
    @TableField("el_data")
    private String elData;

    // 创建时间
    @ColumnType(value = MySqlTypeConstant.DATETIME)
    @ColumnComment("创建时间")
    @TableField("create_time")
    private LocalDateTime createTime;

}
