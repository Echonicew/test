package com.study.model.mapper;


import com.study.pojo.Student;

import java.util.List;

public interface StudentMapper {

    List<Student> selectByPrimaryKey(Integer cgid);

    List<Student> selectAll();

}