package com.study.services;

import com.study.model.dao.OrderDao;
import com.study.model.dao.OrdetailsDao;
import com.study.pojo.Orders;
import com.study.pojo.Ordetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class OrdetailsServices {
    @Autowired
    private OrdetailsDao dao;
    /*@Autowired
    OrdersServices os;*/
    @Autowired
    OrderDao orderDao;
    public Integer deInsert(Ordetails ordetails){
        if (ordetails.getMydrder()!=null && ordetails.getMydrder().getOid()==null){
            /*Integer oid=os.doUpdate(ordetails.getMydrder());*/
            Orders orders=orderDao.save(ordetails.getMydrder());
            ordetails.setMydrder(orders);
        }
        ordetails=dao.save(ordetails);
        return ordetails.getOdid();
    }
    /*一次添加多条详情*/
    public boolean doInsert(List<Ordetails> list){
        /*判断订单是否已添加*/
         if (list.size()>0) {
             Orders orders=list.get(0).getMydrder();
             if (orders!=null && orders.getOid()==null){
                 orders=orderDao.save(orders);
             }
             for (Ordetails od:list){
                 od.setMydrder(orders);
                 dao.save(od);
             }
             return true;
         }
       return false;
      }
    }
