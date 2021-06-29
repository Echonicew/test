package com.study.pojo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Student {
    private Integer stid;
    private String stname;
    private String stsex;
    private Timestamp stbirth;
    private Collection<Grade> gradesByStid;
    private Classgrade classgradeByCgid;

    @Override
    public String toString() {
        return "Student{" +
                "stid=" + stid +
                ", stname='" + stname + '\'' +
                ", stsex='" + stsex + '\'' +
                ", stbirth=" + stbirth +
                '}';
    }

    @Id
    @Column(name = "stid", nullable = false)
    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    @Basic
    @Column(name = "stname", nullable = true, length = 40)
    public String getStname() {
        return stname;
    }

    public void setStname(String stname) {
        this.stname = stname;
    }

    @Basic
    @Column(name = "stsex", nullable = true, length = 6)
    public String getStsex() {
        return stsex;
    }

    public void setStsex(String stsex) {
        this.stsex = stsex;
    }

    @Basic
    @Column(name = "stbirth", nullable = true)
    public Timestamp getStbirth() {
        return stbirth;
    }

    public void setStbirth(Timestamp stbirth) {
        this.stbirth = stbirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(stid, student.stid) &&
                Objects.equals(stname, student.stname) &&
                Objects.equals(stsex, student.stsex) &&
                Objects.equals(stbirth, student.stbirth);
    }

    @Override
    public int hashCode() {

        return Objects.hash(stid, stname, stsex, stbirth);
    }

    @OneToMany(mappedBy = "studentByStid")
    public Collection<Grade> getGradesByStid() {
        return gradesByStid;
    }

    public void setGradesByStid(Collection<Grade> gradesByStid) {
        this.gradesByStid = gradesByStid;
    }

    @ManyToOne
    @JoinColumn(name = "cgid", referencedColumnName = "cgid")
    public Classgrade getClassgradeByCgid() {
        return classgradeByCgid;
    }

    public void setClassgradeByCgid(Classgrade classgradeByCgid) {
        this.classgradeByCgid = classgradeByCgid;
    }
}
