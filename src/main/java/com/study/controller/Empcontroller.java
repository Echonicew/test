package com.study.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.study.pojo.DeptEntity;
import com.study.pojo.EmpEntity;
import com.study.services.EmpServer;
import com.study.vo.Didone;
import com.study.vo.empvo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/emp")
@CrossOrigin
public class Empcontroller {
    @Autowired
    EmpServer empServer;
    @GetMapping("/list")
    public String index(Integer no,Integer size){
        PageInfo<EmpEntity> list=empServer.selectall(1,5);
        List<DeptEntity> list1=empServer.selectdept();
        JSONObject json=new JSONObject();
        json.put("list",list);
        json.put("dept",list1);
        System.out.println(list1.toString());
        return json.toString();
    }

    @PostMapping("/delete")
    public String delete(@RequestBody Didone did){
        System.out.println(did.getDid());
        Integer i=empServer.delete(did.getDid());
        JSONObject json=new JSONObject();
        if (i>0){
           json.put("ok",1);
        }else {
            json.put("ok",-1);
        }
     return json.toString();
    }

    @PostMapping("add")
    public String add(@RequestBody empvo entity){
        EmpEntity empEntity=new EmpEntity();
        empEntity.setEmpno(entity.getEmpno());
        empEntity.setEname(entity.getEname());
        empEntity.setJob(entity.getJob());
        empEntity.setSal(entity.getSal());
        empEntity.setComm(entity.getComm());
        empEntity.setMgr(entity.getMgr());
        DeptEntity deptEntity=new DeptEntity();
        deptEntity.setDeptno(entity.getDeptno());
        empEntity.setDepts(deptEntity);
        Integer i=empServer.doInsert(empEntity);
        JSONObject json=new JSONObject();

        if (i>0){
            json.put("ok",1);
        }else {
            json.put("ok",-1);
        }
        return json.toString();
    }
}
