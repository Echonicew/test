package com.study.model.dao;

import com.study.pojo.Ordetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdetailsDao extends CrudRepository<Ordetails,Integer> {

}
