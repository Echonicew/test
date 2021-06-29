package com.study.model.mapper;


import com.study.pojo.Grade;

import java.util.List;

public interface GradeMapper {

    List<Grade> selectByPrimaryKey(Integer gdid);

    List<Grade> selectAll();

}