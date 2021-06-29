package com.study.model.mapper;


import com.study.pojo.Subject;

import java.util.List;

public interface SubjectMapper {

    Subject selectByPrimaryKey(Integer sjid);

    List<Subject> selectAll();

}