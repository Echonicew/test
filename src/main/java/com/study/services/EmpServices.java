package com.study.services;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.study.model.mapper.EmpMapper;
import com.study.pojo.Dept;
import com.study.pojo.Emp;
import com.study.pojo.EmpEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import sun.net.idn.Punycode;

import java.util.List;
@Service
public class EmpServices {
    @Autowired
    private EmpMapper mapper;

    /**分页查询
     * @param pageNo
     * @param pageSize
     * @return
     */
    public PageInfo<Emp> selectByPager(Integer pageNo,Integer pageSize){
        PageHelper.startPage(pageNo,pageSize);
        List<Emp> list = mapper.selectAll();
        PageInfo<Emp> pageInfo = PageInfo.of(list);
        return pageInfo;
    }
    public List<EmpEntity> selectByKeyWord(String keyword, Integer pageNo, Integer pageSize){
        Sort.Direction direction = Sort.Direction.DESC;/*排序方式*/
        PageRequest pager = PageRequest.of(pageNo-1,pageSize,
                direction,"empno");/*主键排序*/
        return mapper.selectByKeyWord(keyword,pager);
    }
   /* public List<Emp> selectByKeyWord(String keyword,Integer pageNo,Integer pageSize){
        Sort.Direction direction = Sort.Direction.DESC;*//*排序方式*//*
        PageRequest pager = PageRequest.of(pageNo-1,pageSize,
                direction,"empno");*//*主键排序*//*
        return mapper.selectByKeyWord(keyword,pager);
    }*/
    public Integer doInsert(Emp emp){
        System.out.println("新增前的实体类："+emp);
        return mapper.doInsert(emp);
    }
    public Emp delAll(Integer id){
       return mapper.delectById(id);
    }

}
