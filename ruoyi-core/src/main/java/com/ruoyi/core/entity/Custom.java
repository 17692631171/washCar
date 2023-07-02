package com.ruoyi.core.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 顾客基础表
 * @TableName t_custom
 */
public class Custom implements Serializable {
    /**
     * 顾客ID
     */
    private String customId;

    /**
     * 真名
     */
    private String realName;

    /**
     * 网名
     */
    private String nickName;

    /**
     * 账户名
     */
    private String userName;

    /**
     * 密码
     */
    private String passWord;

    /**
     * 地址
     */
    private String address;


    /**
     * 生日
     */
    private Date birthdayTime;

    /**
     * 注册方式
     */
    private String regType;

    /**
     * 职业
     */
    private String job;

    /**
     * 注册时间
     */
    private Date regTime;

    /**
     * 最后一次更新时间
     */
    private Date updateTime;

    /**
     * 状态
     */
    private String status;

    /**
     * 备注
     */
    private String remarks;

    private static final long serialVersionUID = 1L;

    /**
     * 顾客ID
     */
    public String getCustomId() {
        return customId;
    }

    /**
     * 顾客ID
     */
    public void setCustomId(String customId) {
        this.customId = customId;
    }

    /**
     * 真名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 真名
     */
    public void setRealName(String realName) {
        this.realName = realName;
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
     * 账户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 账户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 密码
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * 密码
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }


    /**
     * 生日
     */
    public Date getBirthdayTime() {
        return birthdayTime;
    }

    /**
     * 生日
     */
    public void setBirthdayTime(Date birthdayTime) {
        this.birthdayTime = birthdayTime;
    }

    /**
     * 注册方式
     */
    public String getRegType() {
        return regType;
    }

    /**
     * 注册方式
     */
    public void setRegType(String regType) {
        this.regType = regType;
    }

    /**
     * 职业
     */
    public String getJob() {
        return job;
    }

    /**
     * 职业
     */
    public void setJob(String job) {
        this.job = job;
    }

    /**
     * 注册时间
     */
    public Date getRegTime() {
        return regTime;
    }

    /**
     * 注册时间
     */
    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    /**
     * 最后一次更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 最后一次更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", customId=").append(customId);
        sb.append(", realName=").append(realName);
        sb.append(", nickName=").append(nickName);
        sb.append(", userName=").append(userName);
        sb.append(", passWord=").append(passWord);
        sb.append(", address=").append(address);
        sb.append(", birthdayTime=").append(birthdayTime);
        sb.append(", regType=").append(regType);
        sb.append(", job=").append(job);
        sb.append(", regTime=").append(regTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", status=").append(status);
        sb.append(", remarks=").append(remarks);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}