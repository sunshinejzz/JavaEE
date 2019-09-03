package com.jzz.test;

import com.jzz.entity.Order;
import com.jzz.mapper.OrderMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class OrderMapperTest {

    public static void main(String[] args) {

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(
                OrderMapperTest.class.getClassLoader().getResourceAsStream("Mybatis.xml")
        );


        SqlSession session = factory.openSession(true); //自动提交

        //创建接口代理
        OrderMapper orderMapper = session.getMapper(OrderMapper.class);


        for (Order order : orderMapper.selectAll()) {
            System.out.println(order);
        }


        //关闭session
        session.close();

        SqlSession session1 = factory.openSession(true); //自动提交
        //创建接口代理
        orderMapper= session1.getMapper(OrderMapper.class);

        for (Order order : orderMapper.selectAll()) {
            System.out.println(order);
        }


//        Order orderparm = new Order();
//        orderparm.setOrderId("111");
//        orderparm.setStatus(1);
//        System.out.println(orderMapper.select(orderparm));


//        更新set
//        orderMapper.updateOrder(orderparm);


        //传入删除的数组
//        List<String> list = Arrays.asList("111","222");
//        orderMapper.deleteOrder(list);




  //查询所有订单放入集合
//        List<Order> orderList = orderMapper.selectAll();
//        //创建新订单集合
//        List<OrderVO> orderVOList = new ArrayList<>();
//
////        遍历集合所有订单
//        for (Order order : orderList) {
////            将订单赋值给新订单
////            创建新订单对象
//            OrderVO orderVO = new OrderVO();
//            orderVO.setOrderId(order.getOrderId());
//            orderVO.setMemberId(order.getMemberId());
//            orderVO.setCreateTime(order.getCreateTime());
//            orderVO.setUpdateTime(order.getUpdateTime());
//
//            orderVO.setOrderStatusEnum(OrderStatusEnum.getOrderStatusEnum(order.getStatus()));
//
//            //添加到新订单集合
//            orderVOList.add(orderVO);
//        }
//
//        for (OrderVO orderVO : orderVOList) {
//            System.out.println(orderVO.getOrderStatusEnum().getMessage());
//        }
//
//



        //查询所有订单
//        List<Order> orderList = orderMapper.selectAll();
//        for (Order order : orderList) {
//            System.out.println(order);
//        }

        //通过id查询
//        orderMapper.selectAllById("111");


        //插入
//        Order order = new Order();
//        order.setOrderId("124");
//        order.setStatus(2);
//        order.setMemberId(25);
//        orderMapper.insertOrder(order);

        //更新
//        Order order = new Order();
//        order.setStatus(4);
//        order.setMemberId(132);
//        order.setOrderId("111");
//        orderMapper.updateOrderById(order);

        //删除
//        orderMapper.deleteOrderById("222");
        //删除
//        orderMapper.deleteOrderByIdMe(12);





    }
}
