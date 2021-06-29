package com.study.pojo;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "dept", schema = "suwei", catalog = "")
public class DeptEntity {
    private int deptno;
    private String dname;
    private String loc;
    private List<EmpEntity> emps;

    @Override
    public String toString() {
        return "DeptEntity{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }

    @Id
    @Column(name = "DEPTNO")
    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    @Basic
    @Column(name = "DNAME")
    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Basic
    @Column(name = "LOC")
    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeptEntity that = (DeptEntity) o;
        return deptno == that.deptno && Objects.equals(dname, that.dname) && Objects.equals(loc, that.loc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deptno, dname, loc);
    }

    @OneToMany(mappedBy = "depts")
    public List<EmpEntity> getEmps() {
        return emps;
    }

    public void setEmps(List<EmpEntity> emps) {
        this.emps = emps;
    }
}
