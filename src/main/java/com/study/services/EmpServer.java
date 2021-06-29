package com.study.services;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.study.model.mapper.EmpMapper;
import com.study.pojo.DeptEntity;
import com.study.pojo.Emp;
import com.study.pojo.EmpEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServer {

    @Autowired
    EmpMapper empMapper;
    public PageInfo<EmpEntity> selectall(Integer pageno, Integer size){
        PageHelper.startPage(pageno,size);
        List<EmpEntity> list=empMapper.selectAlll();
        PageInfo<EmpEntity> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }
    public List<EmpEntity> selectByKeyWord(String keyword, Integer pageNo, Integer pageSize){
        Sort.Direction direction = Sort.Direction.DESC;/*排序方式*/
        PageRequest pager = PageRequest.of(pageNo-1,pageSize,
                direction,"empno");/*主键排序*/
        return empMapper.selectByKeyWord(keyword,pager);
    }

    public Integer delete(Integer id){
        return empMapper.delete(id);
    }

    public Integer doInsert(EmpEntity entity){
        return empMapper.doInsert(entity);
    }

    public List<DeptEntity> selectdept() {
        return empMapper.selectdept();
    }
}
