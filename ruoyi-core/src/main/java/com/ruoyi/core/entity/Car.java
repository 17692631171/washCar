package com.ruoyi.core.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 车辆信息表
 * @TableName t_car
 */
@TableName(value ="t_car")
public class Car implements Serializable {
    /**
     * 车牌号
     */
    @TableId
    private String carId;

    /**
     * 车型
     */
    private Integer type;

    /**
     * 品牌
     */
    private String branch;

    /**
     * 型号
     */
    private String model;

    /**
     * 颜色
     */
    private String color;

    /**
     * 用户id
     */
    private Long customId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 车牌号
     */
    public String getCarId() {
        return carId;
    }

    /**
     * 车牌号
     */
    public void setCarId(String carId) {
        this.carId = carId;
    }

    /**
     * 车型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 车型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 品牌
     */
    public String getBranch() {
        return branch;
    }

    /**
     * 品牌
     */
    public void setBranch(String branch) {
        this.branch = branch;
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
     * 用户id
     */
    public Long getCustomId() {
        return customId;
    }

    /**
     * 用户id
     */
    public void setCustomId(Long customId) {
        this.customId = customId;
    }
}