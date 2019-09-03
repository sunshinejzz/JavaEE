package com.jzz.enumeration;


/**
 * 枚举订单状态
 */

public enum OrderStatusEnum {
    NO_PAYED(0, "未支付"),
    PAYED(1, "已支付"),
    CANCLE(2, "已取消"),
    FINASH(3, "已完成");

    private Integer status;
    private String message;


    OrderStatusEnum() {
    }

    OrderStatusEnum(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "OrderStatusEnum{" +
                "status=" + status +
                ", message='" + message + '\'' +
                '}';
    }


    public static OrderStatusEnum getOrderStatusEnum(Integer code) {

        for (OrderStatusEnum value : OrderStatusEnum.values()) {
            if (code.equals(value.getStatus())) {
                return value;
            }
        }
        return null;

    }


}
