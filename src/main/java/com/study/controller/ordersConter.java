package com.study.controller;

import com.study.pojo.Orders;
import com.study.pojo.Ordetails;
import com.study.services.OrdersServices;
import com.study.services.OrdetailsServices;
import com.study.vo.OrdersVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/*
 * @author SMILE.Huang
 * @date 2021-06-07 11:13
 */
@RestController
@RequestMapping("/order")
public class ordersConter {
    @Autowired
    private OrdersServices os;
    @Autowired
    private OrdetailsServices ds;
    @GetMapping
    public List<Orders> selectAll(){
        return os.selectAll();
    }

    @GetMapping("search")
    public List<Orders> selectBySearch(@ModelAttribute OrdersVo vo){
        List<Orders> list = os.selectBySearch(vo);
//        for (Orders orders : list) {
//            System.out.println(orders.getDetails());
//        }
        return list;
    }


    //模拟新增订单
    @PutMapping
    public String test(){
        //订单
        Orders orders = new Orders();//没有主键和总金额，也没有用户
        orders.setoAddress("湖南省株洲市芦淞区石宋路1059号");
        orders.setoPhone("15677889900");
        orders.setoConsignee("刘老师");
        orders.setoState("待付款");
        //订单详情  价格和数量
        Ordetails od1 = new Ordetails();//忽略了产品
        od1.setgPrice(new BigDecimal("2.5"));
        od1.setNum(10);
        Ordetails od2 = new Ordetails();//忽略了产品
        //测试事务。当订单详情添加失败，整个事务回滚，导致整张订单都会添加失败
//        od2.setgPrice(new BigDecimal("5000000000000000"));
        od2.setgPrice(new BigDecimal("5"));//这条信息会新增成功
        od2.setNum(2);
        //将订单详情添加到订单中
        List<Ordetails> details = new ArrayList<>();
        details.add(od1);
        details.add(od2);
        orders.setDetails(details);
        //最后请求新增订单
        os.doInsert(orders);
        return "新增订单完毕";

    }
}
