package com.jzz.mapper;

import com.jzz.entity.OrderDetail;

import java.util.List;

public interface OrderDetailMapper {

    List<OrderDetail> selectAll(String orderId);

    int deleteOrderById(String orderId);
    int updateOrder(OrderDetail orderDetail);

    int insertDetail(OrderDetail orderDetail);

}
