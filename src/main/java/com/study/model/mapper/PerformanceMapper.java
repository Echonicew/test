package com.study.model.mapper;


import com.study.pojo.Performance;

import java.util.List;

public interface PerformanceMapper {

    Performance selectByPrimaryKey(Integer pfid);

    List<Performance> selectAll();

}