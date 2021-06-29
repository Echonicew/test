package com.study.model.mapper;

import com.study.pojo.Jihui;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface JihuiMapper {
    /*分页查询*/
    List<Jihui> selectAll();
    /*多条件组合查询*/
    List<Jihui> selectByChoose(Jihui jihui);
    /*根据主键查询*/
    Jihui selectById(Integer jid);
}
