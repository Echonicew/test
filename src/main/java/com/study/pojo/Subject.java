package com.study.pojo;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Subject {
    private Integer sjid;
    private String sjname;
    private Collection<Grade> gradesBySjid;
    private Phase phaseByPhid;

    @Id
    @Column(name = "sjid", nullable = false)
    public Integer getSjid() {
        return sjid;
    }

    public void setSjid(Integer sjid) {
        this.sjid = sjid;
    }

    @Basic
    @Column(name = "sjname", nullable = true, length = 255)
    public String getSjname() {
        return sjname;
    }

    public void setSjname(String sjname) {
        this.sjname = sjname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return Objects.equals(sjid, subject.sjid) &&
                Objects.equals(sjname, subject.sjname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(sjid, sjname);
    }

    @OneToMany(mappedBy = "subjectBySjid")
    public Collection<Grade> getGradesBySjid() {
        return gradesBySjid;
    }

    public void setGradesBySjid(Collection<Grade> gradesBySjid) {
        this.gradesBySjid = gradesBySjid;
    }

    @ManyToOne
    @JoinColumn(name = "phid", referencedColumnName = "phid")
    public Phase getPhaseByPhid() {
        return phaseByPhid;
    }

    public void setPhaseByPhid(Phase phaseByPhid) {
        this.phaseByPhid = phaseByPhid;
    }
}
