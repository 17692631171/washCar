package com.ruoyi.core.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 微信信息表
 * @TableName t_wechat
 */
@TableName(value ="t_wechat")
public class Wechat implements Serializable {
    /**
     * 微信用户openid
     */
    @TableId
    private String openId;

    /**
     * 头像url
     */
    private String avatar;

    /**
     * 微信号
     */
    private String signal;

    /**
     * 手机号
     */
    private String mobile;
    /**
     * 性别
     */
    private Integer sex;

    /**
     * 顾客id
     */
    private Long customId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 微信用户openid
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * 微信用户openid
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /**
     * 头像url
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 头像url
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 微信号
     */
    public String getSignal() {
        return signal;
    }

    /**
     * 微信号
     */
    public void setSignal(String signal) {
        this.signal = signal;
    }

    /**
     * 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 性别
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 顾客id
     */
    public void setSex(Integer sex) {
        this.sex = sex;
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

    @Override
    public String toString() {
        return "Wechat{" +
                "openId='" + openId + '\'' +
                ", avatar='" + avatar + '\'' +
                ", signal='" + signal + '\'' +
                ", mobile='" + mobile + '\'' +
                ", sex=" + sex +
                ", customId=" + customId +
                '}';
    }
}