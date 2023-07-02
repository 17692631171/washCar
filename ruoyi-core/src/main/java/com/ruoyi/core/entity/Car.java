package com.ruoyi.core.entity;

import java.io.Serializable;

/**
 * 
 * @TableName t_car
 */
public class Car implements Serializable {
    /**
     * 车id
     */
    private String carId;

    /**
     * 车牌号
     */
    private String carNumber;

    /**
     * 类型
     */
    private String type;

    /**
     * 品牌
     */
    private String brand;

    /**
     * 型号
     */
    private String model;

    /**
     * 颜色
     */
    private String color;

    /**
     * 用户id，用于外键
     */
    private String customId;

    private static final long serialVersionUID = 1L;

    /**
     * 车id
     */
    public String getCarId() {
        return carId;
    }

    /**
     * 车id
     */
    public void setCarId(String carId) {
        this.carId = carId;
    }

    /**
     * 车牌号
     */
    public String getCarNumber() {
        return carNumber;
    }

    /**
     * 车牌号
     */
    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    /**
     * 类型
     */
    public String getType() {
        return type;
    }

    /**
     * 类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 品牌
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 品牌
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 型号
     */
    public String getModel() {
        return model;
    }

    /**
     * 型号
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * 颜色
     */
    public String getColor() {
        return color;
    }

    /**
     * 颜色
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 用户id，用于外键
     */
    public String getCustomId() {
        return customId;
    }

    /**
     * 用户id，用于外键
     */
    public void setCustomId(String customId) {
        this.customId = customId;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", carId=").append(carId);
        sb.append(", carNumber=").append(carNumber);
        sb.append(", type=").append(type);
        sb.append(", brand=").append(brand);
        sb.append(", model=").append(model);
        sb.append(", color=").append(color);
        sb.append(", customId=").append(customId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}