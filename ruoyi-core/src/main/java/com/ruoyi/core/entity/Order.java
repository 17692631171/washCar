package com.ruoyi.core.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单表
 * @TableName t_order
 */
@TableName(value ="t_order")
public class Order implements Serializable {
    /**
     * 订单id
     */
    @TableId
    private String orderId;

    /**
     * 支付方式 0现金，1会员卡，2微信，3支付宝
     */
    private Integer payType;

    /**
     * 订单金额
     */
    private BigDecimal price;

    /**
     * 订单状态 0正常，1取消付款，2已付款，3关闭订单
     */
    private Integer orderState;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修订时间
     */
    private Date modifyTime;

    /**
     * 关闭时间
     */
    private Date cancelTime;

    /**
     * 支付时间
     */
    private Date payTime;

    /**
     * 是否删除 0正常，1被删除
     */
    private Integer deleted;

    /**
     * 备注
     */
    private String noteMessage;

    /**
     * 顾客id
     */
    private Long customId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 订单id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 订单id
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 支付方式 0现金，1会员卡，2微信，3支付宝
     */
    public Integer getPayType() {
        return payType;
    }

    /**
     * 支付方式 0现金，1会员卡，2微信，3支付宝
     */
    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    /**
     * 订单金额
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 订单金额
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 订单状态 0正常，1取消付款，2已付款，3关闭订单
     */
    public Integer getOrderState() {
        return orderState;
    }

    /**
     * 订单状态 0正常，1取消付款，2已付款，3关闭订单
     */
    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
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
     * 修订时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 修订时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 关闭时间
     */
    public Date getCancelTime() {
        return cancelTime;
    }

    /**
     * 关闭时间
     */
    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    /**
     * 支付时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 支付时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 是否删除 0正常，1被删除
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * 是否删除 0正常，1被删除
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    /**
     * 备注
     */
    public String getNoteMessage() {
        return noteMessage;
    }

    /**
     * 备注
     */
    public void setNoteMessage(String noteMessage) {
        this.noteMessage = noteMessage;
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