package com.jzz.test;

import com.jzz.entity.OrderDetail;
import com.jzz.mapper.OrderDetailMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class OrderDetailMapperTest {

    public static void main(String[] args) {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(
                OrderMapperTest.class.getClassLoader().getResourceAsStream("Mybatis.xml")
        );

        SqlSession session = factory.openSession(true);

        OrderDetailMapper orderDetailMapper = session.getMapper(OrderDetailMapper.class);

        //查询
//        orderDetailMapper.selectAll("2");

        //删除
//        orderDetailMapper.deleteOrderById("123");

        //修改
//        OrderDetail orderDetail = new OrderDetail();
//        orderDetail.setDetailId("123");
//        orderDetail.setOrderId("2");
//        orderDetail.setGoodsId(333);
//        orderDetail.setCounts(30);
//        orderDetailMapper.updateOrder(orderDetail);

        //增加
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("1233");
        orderDetail.setOrderId("1");
        orderDetail.setGoodsId(520);
        orderDetail.setCounts(100);
        orderDetailMapper.insertDetail(orderDetail);




    }

}
