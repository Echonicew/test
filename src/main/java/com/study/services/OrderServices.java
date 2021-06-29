package com.study.services;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.study.model.mapper.OrderMapper;
import com.study.pojo.Orderes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class OrderServices {
    @Autowired
    private OrderMapper mapper;

    public PageInfo<Orderes> selectAll(Integer pageNo, Integer pageSize){
//        com.github.pagehelper.PageHelper
        Page<Object> objects = PageHelper.startPage(pageNo, pageSize);
        List<Orderes> list = mapper.selectAll();
        PageInfo<Orderes> pageInfo = PageInfo.of(list);
        return pageInfo;
    }
}
