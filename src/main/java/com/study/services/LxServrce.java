package com.study.services;


import com.study.model.mapper.ClassgradeMapper;
import com.study.pojo.Classgrade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LxServrce {
    @Autowired
    private ClassgradeMapper classgradeMapper;

    public List<Classgrade> selectAll(){
        return classgradeMapper.selectAll();
    }

}
