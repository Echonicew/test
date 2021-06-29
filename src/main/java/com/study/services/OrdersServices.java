package com.study.services;

import com.study.model.dao.OrderDao;
import com.study.model.dao.OrdetailsDao;
import com.study.model.mapper.OrdersMapper;
import com.study.pojo.Orders;
import com.study.pojo.Ordetails;
import com.study.vo.OrdersVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

/*
 * @author SMILE.Huang
 * @date 2021-06-07 10:48
 */
@Service
@Transactional
public class OrdersServices {
    @Autowired
    private OrderDao dao;
    @Autowired
    private OrdetailsDao detailDAO;
    @Autowired
    private OrdersMapper mapper;

    public List<Orders> selectAll(){
        return mapper.selectAll();
    }

    //    public List<Orders> selectBySearch(Orders orders, String begin,String end){
//        System.out.println("3333");
//        return mapper.selectBySearch(orders, begin, end);
//    }
    public List<Orders> selectBySearch(OrdersVo vo){
        return mapper.selectBySearch2(vo);
    }

    //新增订单的同时新增详情
    public boolean doInsert(Orders orders){
        //新增订单
        if(orders.getOid()==null){
            orders = dao.save(orders);
        }
        //再遍历详情
        BigDecimal total = new BigDecimal("0");
        for (Ordetails detail : orders.getDetails()) {
            detail.setMydrder(orders);
            BigDecimal sum = detail.getgPrice().multiply(new BigDecimal(detail.getNum()));
            total = total.add(sum);
            detailDAO.save(detail);
        }
        orders.setoRental(total);
        return true;
    }



    /**订单新增和修改，它是主表，新增的时候不需要维护关系
     * 关系字段details，在新增的时候不需要处理
     * @param orders
     * @return
     */
    public Integer doUpdate(Orders orders){
        orders = dao.save(orders);
        return orders.getOid();
    }
}
