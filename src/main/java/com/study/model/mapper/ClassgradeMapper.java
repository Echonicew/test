package com.study.model.mapper;

import com.study.pojo.Classgrade;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ClassgradeMapper {

    Classgrade selectByPrimaryKey(Integer cgid);

    List<Classgrade> selectAll();

}