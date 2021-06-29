package com.study.model.mapper;

import com.study.pojo.Dept;
import com.study.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {
    List<Emp> selectAll();

    Dept selectById(Integer deptno);
    Integer delete(Integer id);
}
