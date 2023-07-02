package com.ruoyi.core.entity.vo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 作者： 张玉
 * 创建时间：2023/7/1
 * 描述：顾客列表信息
 */
public class CustomListVO {
    /**
     * 真名
     */
    private String realName;
    /**
     * 性别
     */
    private String sex;
    /**
     * 微信号
     */
    private String weChatNumber;
    /**
     * 车牌号
     */
    private String carNumber;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 地址
     */
    private String address;
    /**
     * 状态
     */
    private String status;
    /**
     * 累计消费
     */
    private BigDecimal consumptionTotal;
    /**
     * 上次消费时间
     */
    private Date lastConsumptionDate;

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getWeChatNumber() {
        return weChatNumber;
    }

    public void setWeChatNumber(String weChatNumber) {
        this.weChatNumber = weChatNumber;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getConsumptionTotal() {
        return consumptionTotal;
    }

    public void setConsumptionTotal(BigDecimal consumptionTotal) {
        this.consumptionTotal = consumptionTotal;
    }

    public Date getLastConsumptionDate() {
        return lastConsumptionDate;
    }

    public void setLastConsumptionDate(Date lastConsumptionDate) {
        this.lastConsumptionDate = lastConsumptionDate;
    }

    @Override
    public String toString() {
        return "CustomListVO{" +
                "realName='" + realName + '\'' +
                ", sex='" + sex + '\'' +
                ", weChatNumber='" + weChatNumber + '\'' +
                ", carNumber='" + carNumber + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", status='" + status + '\'' +
                ", consumptionTotal=" + consumptionTotal +
                ", lastConsumptionDate=" + lastConsumptionDate +
                '}';
    }
}
