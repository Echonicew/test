package com.study.controller;

import com.github.pagehelper.PageInfo;
import com.study.pojo.Emp;
import com.study.pojo.EmpEntity;
import com.study.services.EmpServices;
import com.study.vo.PaggerVo;
import com.study.vo.VoOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vues")
@CrossOrigin
public class EmpAllController {
    @Autowired
    EmpServices es;
    @GetMapping("all")
    public PageInfo<Emp> selectByPager(@RequestBody PaggerVo vo){
        return es.selectByPager(vo.getNo(),vo.getSize());
    }
    @GetMapping("pager")
    public List<EmpEntity> selectByPager(@RequestParam(value = "no",defaultValue = "1") Integer no,
                                         @RequestParam(value = "size",defaultValue = "10")Integer size){
        return es.selectByKeyWord("A",no,size);
    }
    @PostMapping("/del")
    public Emp dels(@RequestBody VoOne did){
        System.out.println("前台的传递的参数："+did.getDid());
        return es.delAll(did.getDid());
    }

}
