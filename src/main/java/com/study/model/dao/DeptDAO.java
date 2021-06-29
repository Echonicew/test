package com.study.model.dao;

import com.study.pojo.Dept;
import com.study.pojo.Emp;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeptDAO extends CrudRepository<Dept,Integer> {
    /*默认可以完成新增、修改（save），根据主键查询等方法*/

    /*预定义查询  findBy属性名(首字母大写)*/
    List<Dept> findByDname(String dname);

    /*JPQL查询  模糊查询+分页*/
    @Query("select d from Dept d where d.dname like concat('%',?1,'%')")
    List<Dept> selectByKeyWord(String keyword, Pageable pager);
    @Query("select d from Emp d where d.ename like concat('%',?1,'%')")
    List<Emp> selectByKeyWordone(String keyword, Pageable pager);
/*
    Integer doInsert(Emp emp);//自增*/
}
