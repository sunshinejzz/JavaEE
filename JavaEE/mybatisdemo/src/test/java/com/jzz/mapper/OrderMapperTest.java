package com.jzz.mapper;

import com.jzz.entity.Order;
import com.jzz.enumeration.OrderStatusEnum;
import com.jzz.vo.OrderVO;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class OrderMapperTest {

    /*
    * 公共方法：创建工厂，创建SqlSession，getMapper创建接口代理
    * */
    public static OrderMapper common(){
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(
                com.jzz.test.OrderMapperTest.class.getClassLoader().getResourceAsStream("Mybatis.xml")
        );
        //创建SqlSession
        SqlSession session = factory.openSession(true); //自动提交
        //创建接口代理
        OrderMapper orderMapper = session.getMapper(OrderMapper.class);
        //返回orderMapper
        return orderMapper;
    }


    @Test
    public void selectTest(){
        Order order = new Order();
        order.setOrderId("123");
        common().select(order);
    }

    @Test
    public void updateOrderTest(){
        Order order = new Order();
        order.setOrderId("123");
        order.setStatus(1);
        order.setMemberId(666);
        common().updateOrder(order);
    }

    @Test
    public void selectAllTest(){
        //查询出来的集合
        List<Order> orderList = common().selectAll();

        List<OrderVO> orderVOList = new ArrayList<OrderVO>();

        for (Order order : orderList) {
            //创建新order对象
            OrderVO orderVO = new OrderVO();
            orderVO.setOrderId(order.getOrderId());
            orderVO.setMemberId(order.getMemberId());
            orderVO.setCreateTime(order.getCreateTime());
            orderVO.setUpdateTime(order.getUpdateTime());
            orderVO.setOrderStatusEnum(OrderStatusEnum.getOrderStatusEnum(order.getStatus()));
            //放入集合
            orderVOList.add(orderVO);
        }
        for (OrderVO orderVO : orderVOList) {
            System.out.println(orderVO.getOrderStatusEnum().getMessage());
        }
    }









}
