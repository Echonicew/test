package com.study.pojo;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "emp", schema = "suwei", catalog = "")
public class EmpEntity {
    private int empno;
    private String ename;
    private String job;
    private Double mgr;
    private Date hiredate;
    private Double sal;
    private Double comm;
    private DeptEntity depts;

    @Override
    public String toString() {
        return "EmpEntity{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", mgr=" + mgr +
                ", hiredate=" + hiredate +
                ", sal=" + sal +
                ", comm=" + comm +
                '}';
    }

    @Id
    @Column(name = "EMPNO")
  // @GeneratedValue(strategy = )
    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    @Basic
    @Column(name = "ENAME")
    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Basic
    @Column(name = "JOB")
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Basic
    @Column(name = "MGR")
    public Double getMgr() {
        return mgr;
    }

    public void setMgr(Double mgr) {
        this.mgr = mgr;
    }

    @Basic
    @Column(name = "HIREDATE")
    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    @Basic
    @Column(name = "SAL")
    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    @Basic
    @Column(name = "COMM")
    public Double getComm() {
        return comm;
    }

    public void setComm(Double comm) {
        this.comm = comm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmpEntity empEntity = (EmpEntity) o;
        return empno == empEntity.empno && Objects.equals(ename, empEntity.ename) && Objects.equals(job, empEntity.job) && Objects.equals(mgr, empEntity.mgr) && Objects.equals(hiredate, empEntity.hiredate) && Objects.equals(sal, empEntity.sal) && Objects.equals(comm, empEntity.comm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empno, ename, job, mgr, hiredate, sal, comm);
    }

    @ManyToOne
    @JoinColumn(name = "DEPTNO", referencedColumnName = "DEPTNO")
    public DeptEntity getDepts() {
        return depts;
    }

    public void setDepts(DeptEntity depts) {
        this.depts = depts;
    }
}
