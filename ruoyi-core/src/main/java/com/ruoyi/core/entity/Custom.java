package com.ruoyi.core.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruoyi.common.xss.Xss;

import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * 顾客信息表
 * @author 张玉
 * @TableName t_custom
 */
@TableName(value ="t_custom")
public class Custom implements Serializable {
    /**
     * 顾客id
     */
    @TableId
    private Long customId;

    /**
     * 真名
     */
    private String realName;

    /**
     * 网名
     */
    private String nickName;

    /**
     * 地址
     */
    private String address;

    /**
     * 注册类型 0小程序，1手动
     */
    private Integer regType;

    /**
     * 职业
     */
    private Integer job;

    /**
     * 注册时间
     */
    private Date regTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 状态 0正常，1封存，2停用
     */
    private Integer status;

    /**
     * 备注
     */
    private String remakes;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

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
     * 注册类型 0小程序，1手动
     */
    public Integer getRegType() {
        return regType;
    }

    /**
     * 注册类型 0小程序，1手动
     */
    public void setRegType(Integer regType) {
        this.regType = regType;
    }

    /**
     * 职业
     */
    public Integer getJob() {
        return job;
    }

    /**
     * 职业
     */
    public void setJob(Integer job) {
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
     * 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 状态 0正常，1封存，2停用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态 0正常，1封存，2停用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 备注
     */
    public String getRemakes() {
        return remakes;
    }

    /**
     * 备注
     */
    public void setRemakes(String remakes) {
        this.remakes = remakes;
    }

    @Override
    public String toString() {
        return "Custom{" +
                "customId=" + customId +
                ", realName='" + realName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", address='" + address + '\'' +
                ", regType=" + regType +
                ", job=" + job +
                ", regTime=" + regTime +
                ", updateTime=" + updateTime +
                ", status=" + status +
                ", remakes='" + remakes + '\'' +
                '}';
    }
}