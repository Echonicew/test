package com.study.model.dao;

import com.study.pojo.Jihui;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JihuiDao extends CrudRepository<Jihui,Integer> {

}
