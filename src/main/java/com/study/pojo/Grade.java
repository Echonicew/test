package com.study.pojo;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Grade {
    private Integer gdid;
    private BigDecimal gdsum;

    private Subject subjectBySjid;
    private Student studentByStid;
    private Collection<Performance> performancesByGdid;

    @Override
    public String toString() {
        return "Grade{" +
                "gdid=" + gdid +
                ", gdsum=" + gdsum +
                '}';
    }

    @Id
    @Column(name = "gdid", nullable = false)
    public Integer getGdid() {
        return gdid;
    }

    public void setGdid(Integer gdid) {
        this.gdid = gdid;
    }

    @Basic
    @Column(name = "gdsum", nullable = true, precision = 2)
    public BigDecimal getGdsum() {
        return gdsum;
    }

    public void setGdsum(BigDecimal gdsum) {
        this.gdsum = gdsum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grade grade = (Grade) o;
        return Objects.equals(gdid, grade.gdid) &&
                Objects.equals(gdsum, grade.gdsum);
    }

    @Override
    public int hashCode() {

        return Objects.hash(gdid, gdsum);
    }

    @ManyToOne
    @JoinColumn(name = "sjid", referencedColumnName = "sjid")
    public Subject getSubjectBySjid() {
        return subjectBySjid;
    }

    public void setSubjectBySjid(Subject subjectBySjid) {
        this.subjectBySjid = subjectBySjid;
    }

    @ManyToOne
    @JoinColumn(name = "stid", referencedColumnName = "stid")
    public Student getStudentByStid() {
        return studentByStid;
    }

    public void setStudentByStid(Student studentByStid) {
        this.studentByStid = studentByStid;
    }

    @OneToMany(mappedBy = "gradeByGdid")
    public Collection<Performance> getPerformancesByGdid() {
        return performancesByGdid;
    }

    public void setPerformancesByGdid(Collection<Performance> performancesByGdid) {
        this.performancesByGdid = performancesByGdid;
    }
}
