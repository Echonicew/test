package com.study.services;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.study.model.dao.JihuiDao;
import com.study.model.mapper.JihuiMapper;
import com.study.pojo.Jihui;
import com.study.pojo.Orderes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JihuiServices {
    @Autowired
    private JihuiDao dao;
    @Autowired
    private JihuiMapper mapper;
    /*增改*/
    public Integer update(Jihui jihui){
        jihui =dao.save(jihui);
        return jihui.getJid();
    }
    /*删除*/
    public Integer deleteById(Integer jid){
       dao.deleteById(jid);
       return 1;
    }
    public PageInfo<Jihui> selectAll(Integer pageNo, Integer pageSize){
        Page<Object> objects = PageHelper.startPage(pageNo, pageSize);
        List<Jihui> list = mapper.selectAll();
        PageInfo<Jihui> pageInfo = PageInfo.of(list);
        return pageInfo;
    }
    public PageInfo<Jihui> selectByChoose(Integer pageNo, Integer pageSize,Jihui jihui){
        Page<Object> objects = PageHelper.startPage(pageNo, pageSize);
        List<Jihui> list = mapper.selectByChoose(jihui);
        PageInfo<Jihui> pageInfo = PageInfo.of(list);
        return pageInfo;
    }
    public Jihui selectById(Integer jid){
        return mapper.selectById(jid);
    }
}
