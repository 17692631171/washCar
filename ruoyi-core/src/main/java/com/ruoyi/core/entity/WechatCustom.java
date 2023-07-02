package com.ruoyi.core.entity;

import java.io.Serializable;

/**
 * 微信顾客表
 * @TableName t_wechat_custom
 */
public class WechatCustom implements Serializable {
    /**
     * 微信openid
     */
    private String wechatOpenid;

    /**
     * 头像url
     */
    private String avatar;

    /**
     * 网名
     */
    private String nickName;

    /**
     * 微信号
     */
    private String wechatNumber;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 顾客id，用于外键
     */
    private String customId;

    private static final long serialVersionUID = 1L;

    /**
     * 微信openid
     */
    public String getWechatOpenid() {
        return wechatOpenid;
    }

    /**
     * 微信openid
     */
    public void setWechatOpenid(String wechatOpenid) {
        this.wechatOpenid = wechatOpenid;
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
     * 网名
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 网名
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 微信号
     */
    public String getWechatNumber() {
        return wechatNumber;
    }

    /**
     * 微信号
     */
    public void setWechatNumber(String wechatNumber) {
        this.wechatNumber = wechatNumber;
    }

    /**
     * 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
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


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wechatOpenid=").append(wechatOpenid);
        sb.append(", avatar=").append(avatar);
        sb.append(", nickName=").append(nickName);
        sb.append(", wechatNumber=").append(wechatNumber);
        sb.append(", phone=").append(phone);
        sb.append(", customId=").append(customId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}