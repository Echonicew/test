package com.study.model.mapper;

import com.study.pojo.Orders;
import com.study.vo.OrdersVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.sql.Timestamp;
import java.util.List;

/*
 * @author SMILE.Huang
 * @date 2021-06-08 14:41
 */
@Mapper
public interface OrdersMapper {
    //订单编号、订单总价、联系人、电话、下单时间、地址、订单状态。订单详情[]
    List<Orders> selectAll();

    //根据订单编号、联系人、联系电话、收货地址模糊查询，订单状态精准查询，下单时间范围查询
//    List<Orders> selectBySearch(@Param("order") Orders orders,
//                                @Param("start") String begin,
//                                @Param("stop") String end);

    List<Orders> selectBySearch2(OrdersVo vo);
}
