package com.jzz.mapper;

import com.jzz.entity.Order;

import java.util.List;

public interface OrderMapper {


    List<Order> select(Order order);

    int updateOrder(Order order);

    int deleteOrder(List<String> orderiid);







    //查询所有订单
    List<Order> selectAll();

    List<Order> selectAllById(String orderId);

    int insertOrder(Order order);

    int updateOrderById(Order order);

    int deleteOrderById(String orderId);

    int deleteOrderByIdMe(int memberId);



}
