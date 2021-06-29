package com.study.model.dao;

import com.study.pojo.Orders;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDao extends CrudRepository<Orders,Integer> {
    @Query("select d from Orders d where d.oState like concat('%',?1,'%')")
    List<Orders> selectByKeyWord(String keyword, Pageable pager);

}
