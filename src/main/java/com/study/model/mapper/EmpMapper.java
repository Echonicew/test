package com.study.model.mapper;

import com.study.pojo.Dept;
import com.study.pojo.DeptEntity;
import com.study.pojo.Emp;
import com.study.pojo.EmpEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@Mapper
public interface EmpMapper {
    List<Emp> selectAll();//查询所有
    List<EmpEntity> selectAlll();//查询所有
    Emp selectById(Integer eid);//根据主键查询

    Integer doInsert(Emp emp);//自增
    Integer doInsert(EmpEntity emp);//自增
    //根据部门查员工
    List<Emp> selectByDid(Integer deptno);
    Emp delectById(Integer id);


    List<EmpEntity> selectByKeyWord(String keyword, Pageable pager);

    Integer delete(Integer id);
    List<DeptEntity> selectdept();
}
