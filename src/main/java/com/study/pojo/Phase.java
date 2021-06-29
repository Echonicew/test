package com.study.pojo;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Phase {
    private Integer phid;
    private String phname;
    private Collection<Classgrade> classgradesByPhid;
    private Collection<Subject> subjectsByPhid;

    @Id
    @Column(name = "phid", nullable = false)
    public Integer getPhid() {
        return phid;
    }

    public void setPhid(Integer phid) {
        this.phid = phid;
    }

    @Basic
    @Column(name = "phname", nullable = true, length = 40)
    public String getPhname() {
        return phname;
    }

    public void setPhname(String phname) {
        this.phname = phname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phase phase = (Phase) o;
        return Objects.equals(phid, phase.phid) &&
                Objects.equals(phname, phase.phname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(phid, phname);
    }

    @OneToMany(mappedBy = "phaseByPhid")
    public Collection<Classgrade> getClassgradesByPhid() {
        return classgradesByPhid;
    }

    public void setClassgradesByPhid(Collection<Classgrade> classgradesByPhid) {
        this.classgradesByPhid = classgradesByPhid;
    }

    @OneToMany(mappedBy = "phaseByPhid")
    public Collection<Subject> getSubjectsByPhid() {
        return subjectsByPhid;
    }

    public void setSubjectsByPhid(Collection<Subject> subjectsByPhid) {
        this.subjectsByPhid = subjectsByPhid;
    }
}
