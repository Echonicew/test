package com.study.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.study.pojo.Dept;
import com.study.services.DeptServices;
import com.study.vo.PaggerVo;
import com.study.vo.VoOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.UUID;

/*

 */
@RestController /*@Controller+@ResponseBody  不跳转页面，把方法的返回作为响应的主体内容*/
@RequestMapping("/vue")
@CrossOrigin  /*允许别的域名跨域访问当前Controller*/
public class VueController {
    @Autowired
    DeptServices ds;

    /**请求地址：http://localhost:8085/vue/getDept?did=10
     * @param {did:20}
     * @return @RequestBody将整个请求主体转换成Vo对象
     */
    @PostMapping("getDept")
    public Dept selectByDid(@RequestBody VoOne vo){
        System.out.println("前台的传递的参数："+vo.getDid());
        return ds.selectById(vo.getDid());
    }

    //{no:1,size:2}
   /* @PostMapping("getPager")
    public PageInfo<Dept> selectByPager(@RequestBody PaggerVo vo){
        return ds.selectByPager(vo.getNo(),vo.getSize());
    }*/
    /** 请求地址：http://localhost:8085/vue
     * @return
     */
    @GetMapping
    public String first(){
        JSONObject json = new JSONObject();
        json.put("msg","我是后台"+new Date().toLocaleString());
        return json.toJSONString();
    }

    @GetMapping("list")
    public String list(Integer count){
        //创建数组
        String[] arr = new String[count];
        for(int i=0;i<count;i++){
            arr[i]= "哈哈哈"+i;
        }
        //创建json对象
        JSONObject json = new JSONObject();
        json.put("list",arr);
        return json.toJSONString();
    }
    @PostMapping("del")
    public String doDelect(@RequestBody Dept d){
        int result=ds.doDelect(d.getDeptno());
        JSONObject json=new JSONObject();
        json.put("code",result);
        return json.toJSONString();
    }
   /* @PutMapping("put")
    public String doUpdate(@RequestBody Dept dept){

    }*/
}
