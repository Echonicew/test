package com.study.pojo;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Entity
public class Classgrade {
    private Integer cgid;
    private String cgname;
    private String cglocation;
    private String cgstage;
    private String cgteacher;
    private Phase phaseByPhid;
    private List<Student> studentsByCgid;

    @Override
    public String toString() {
        return "Classgrade{" +
                "cgid=" + cgid +
                ", cgname='" + cgname + '\'' +
                ", cglocation='" + cglocation + '\'' +
                ", cgstage='" + cgstage + '\'' +
                ", cgteacher='" + cgteacher + '\'' +
                '}';
    }

    @Id
    @Column(name = "cgid", nullable = false)
    public Integer getCgid() {
        return cgid;
    }

    public void setCgid(Integer cgid) {
        this.cgid = cgid;
    }

    @Basic
    @Column(name = "cgname", nullable = true, length = 60)
    public String getCgname() {
        return cgname;
    }

    public void setCgname(String cgname) {
        this.cgname = cgname;
    }

    @Basic
    @Column(name = "cglocation", nullable = true, length = 255)
    public String getCglocation() {
        return cglocation;
    }

    public void setCglocation(String cglocation) {
        this.cglocation = cglocation;
    }

    @Basic
    @Column(name = "cgstage", nullable = true, length = 255)
    public String getCgstage() {
        return cgstage;
    }

    public void setCgstage(String cgstage) {
        this.cgstage = cgstage;
    }

    @Basic
    @Column(name = "cgteacher", nullable = true, length = 60)
    public String getCgteacher() {
        return cgteacher;
    }

    public void setCgteacher(String cgteacher) {
        this.cgteacher = cgteacher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classgrade that = (Classgrade) o;
        return Objects.equals(cgid, that.cgid) &&
                Objects.equals(cgname, that.cgname) &&
                Objects.equals(cglocation, that.cglocation) &&
                Objects.equals(cgstage, that.cgstage) &&
                Objects.equals(cgteacher, that.cgteacher);
    }

    @Override
    public int hashCode() {

        return Objects.hash(cgid, cgname, cglocation, cgstage, cgteacher);
    }

    @ManyToOne
    @JoinColumn(name = "phid", referencedColumnName = "phid")
    public Phase getPhaseByPhid() {
        return phaseByPhid;
    }

    public void setPhaseByPhid(Phase phaseByPhid) {
        this.phaseByPhid = phaseByPhid;
    }

    @OneToMany(mappedBy = "classgradeByCgid")
    public List<Student> getStudentsByCgid() {
        return studentsByCgid;
    }

    public void setStudentsByCgid(List<Student> studentsByCgid) {
        this.studentsByCgid = studentsByCgid;
    }
}
