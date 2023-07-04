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
    private Integer sex;
    /**
     * 微信号
     */
    private String signalNo;
    /**
     * 车牌号
     */
    private String carId;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 地址
     */
    private String address;
    /**
     * 状态
     */
    private Integer status;
    /**
     * 会员卡等级
     */
    private Integer level;
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

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getSignalNo() {
        return signalNo;
    }

    public void setSignalNo(String signalNo) {
        this.signalNo = signalNo;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
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
                ", sex=" + sex +
                ", signalNo='" + signalNo + '\'' +
                ", carId='" + carId + '\'' +
                ", mobile='" + mobile + '\'' +
                ", address='" + address + '\'' +
                ", status=" + status +
                ", level=" + level +
                ", consumptionTotal=" + consumptionTotal +
                ", lastConsumptionDate=" + lastConsumptionDate +
                '}';
    }
}
