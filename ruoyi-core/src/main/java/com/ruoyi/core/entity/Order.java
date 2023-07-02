package com.ruoyi.core.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * @TableName t_order
 */
public class Order implements Serializable {
    /**
     * 订单id
     */
    private String orderId;

    /**
     * 顾客id，用于外键
     */
    private String customId;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 支付方式（0会员卡，1现金，2微信，3支付宝）
     */
    private String payType;

    /**
     * 价格
     */
    private BigDecimal totalPrice;

    /**
     * 发票
     */
    private String invoice;

    /**
     * 发票类型
     */
    private String invoiceType;

    /**
     * 发票抬头
     */
    private String invoiceTitle;

    /**
     * 发票内容
     */
    private String invoiceContent;

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 订单状态
     */
    private String orderState;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 订正时间
     */
    private Date modifyTime;

    /**
     * 取消时间
     */
    private Date cancelTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 付款时间
     */
    private Date payTime;

    /**
     * 备注信息
     */
    private String noteMessage;

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
     * 顾客id，用于外键
     */
    public String getCustomId() {
        return customId;
    }

    /**
     * 顾客id，用于外键
     */
    public void setCustomId(String customId) {
        this.customId = customId;
    }

    /**
     * 真实姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 真实姓名
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * 支付方式（0会员卡，1现金，2微信，3支付宝）
     */
    public String getPayType() {
        return payType;
    }

    /**
     * 支付方式（0会员卡，1现金，2微信，3支付宝）
     */
    public void setPayType(String payType) {
        this.payType = payType;
    }

    /**
     * 价格
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * 价格
     */
    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * 发票
     */
    public String getInvoice() {
        return invoice;
    }

    /**
     * 发票
     */
    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    /**
     * 发票类型
     */
    public String getInvoiceType() {
        return invoiceType;
    }

    /**
     * 发票类型
     */
    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    /**
     * 发票抬头
     */
    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    /**
     * 发票抬头
     */
    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    /**
     * 发票内容
     */
    public String getInvoiceContent() {
        return invoiceContent;
    }

    /**
     * 发票内容
     */
    public void setInvoiceContent(String invoiceContent) {
        this.invoiceContent = invoiceContent;
    }

    /**
     * 公司名称
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 公司名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * 订单状态
     */
    public String getOrderState() {
        return orderState;
    }

    /**
     * 订单状态
     */
    public void setOrderState(String orderState) {
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
     * 订正时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 订正时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 取消时间
     */
    public Date getCancelTime() {
        return cancelTime;
    }

    /**
     * 取消时间
     */
    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    /**
     * 结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 付款时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 付款时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 备注信息
     */
    public String getNoteMessage() {
        return noteMessage;
    }

    /**
     * 备注信息
     */
    public void setNoteMessage(String noteMessage) {
        this.noteMessage = noteMessage;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", customId=").append(customId);
        sb.append(", realName=").append(realName);
        sb.append(", payType=").append(payType);
        sb.append(", totalPrice=").append(totalPrice);
        sb.append(", invoice=").append(invoice);
        sb.append(", invoiceType=").append(invoiceType);
        sb.append(", invoiceTitle=").append(invoiceTitle);
        sb.append(", invoiceContent=").append(invoiceContent);
        sb.append(", companyName=").append(companyName);
        sb.append(", orderState=").append(orderState);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", cancelTime=").append(cancelTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", payTime=").append(payTime);
        sb.append(", noteMessage=").append(noteMessage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}