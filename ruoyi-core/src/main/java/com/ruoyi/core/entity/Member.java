package com.ruoyi.core.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 会员信息表
 * @TableName t_member
 */
@TableName(value ="t_member")
public class Member implements Serializable {
    /**
     * 会员id
     */
    @TableId(type = IdType.AUTO)
    private Integer memberId;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 余额
     */
    private BigDecimal balance;

    /**
     * 等级
     */
    private Integer level;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

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
     * 类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 余额
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * 余额
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * 等级
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 等级
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}