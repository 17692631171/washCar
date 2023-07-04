package com.ruoyi.core.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 
 * @TableName t_custom_member
 */
@TableName(value ="t_custom_member")
public class CustomMember implements Serializable {
    /**
     * 会员id
     */
    private Integer memberId;

    /**
     * 顾客id
     */
    private Long customId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 会员id
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 会员id
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * 顾客id
     */
    public Long getCustomId() {
        return customId;
    }

    /**
     * 顾客id
     */
    public void setCustomId(Long customId) {
        this.customId = customId;
    }
}