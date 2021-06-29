package com.study.controller;

import com.github.pagehelper.PageInfo;
import com.study.pojo.Jihui;
import com.study.services.JihuiServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jihui")
@CrossOrigin
public class JihuiConteroll {
    @Autowired
    private JihuiServices js;
    @GetMapping
    public PageInfo<Jihui> selectPager(Integer pageNo,Integer pageSize){
        return js.selectAll(pageNo,pageSize);
    }
    @GetMapping("search")
    public PageInfo<Jihui> selectSearch(@ModelAttribute Jihui jihui,Integer pageNo,Integer pageSize){
        return js.selectByChoose(pageNo,pageSize,jihui);
    }
    @PutMapping

    public Integer update(@ModelAttribute Jihui jihui){
        return js.update(jihui);
    }
    @PostMapping
    public Jihui selectById(Integer jid){
        return js.selectById(jid);
    }
    @DeleteMapping
    public Integer deleteById(Integer jid){
        return js.deleteById(jid);
    }
}
