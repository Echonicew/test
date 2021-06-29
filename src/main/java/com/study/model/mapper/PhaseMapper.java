package com.study.model.mapper;


import com.study.pojo.Phase;

import java.util.List;

public interface PhaseMapper {

    Phase selectByPrimaryKey(Integer phid);

    List<Phase> selectAll();

}