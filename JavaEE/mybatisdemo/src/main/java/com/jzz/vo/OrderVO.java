package com.jzz.vo;

import com.jzz.enumeration.OrderStatusEnum;

import java.util.Date;

public class OrderVO {

    private String orderId;
    //新的状态
    private OrderStatusEnum orderStatusEnum;
    private Integer memberId;
    private Date createTime;
    private Date updateTime;


    public OrderVO() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public OrderStatusEnum getOrderStatusEnum() {
        return orderStatusEnum;
    }

    public void setOrderStatusEnum(OrderStatusEnum orderStatusEnum) {
        this.orderStatusEnum = orderStatusEnum;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "OrderVO{" +
                "orderId='" + orderId + '\'' +
                ", orderStatusEnum=" + orderStatusEnum +
                ", memberId=" + memberId +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }




}
