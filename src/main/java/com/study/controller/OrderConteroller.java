package com.study.controller;

import com.github.pagehelper.PageInfo;
import com.study.pojo.Emp;
import com.study.pojo.Orderes;
import com.study.services.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
@CrossOrigin
public class OrderConteroller {
    @Autowired
    OrderServices es;
    @GetMapping
    public PageInfo<Orderes> selectByPager(@RequestParam(value = "no",defaultValue = "1")Integer no,
                                           @RequestParam(value = "size",defaultValue = "10")Integer size){
        return es.selectAll(no,size);

    }
}
