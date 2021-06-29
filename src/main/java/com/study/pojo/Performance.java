package com.study.pojo;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Performance {
    private Integer pfid;
    private Integer pftotal;
    private BigDecimal pfjlfs;
    private Timestamp pfdata;
    private Grade gradeByGdid;

    @Id
    @Column(name = "pfid", nullable = false)
    public Integer getPfid() {
        return pfid;
    }

    public void setPfid(Integer pfid) {
        this.pfid = pfid;
    }

    @Basic
    @Column(name = "pftotal", nullable = true)
    public Integer getPftotal() {
        return pftotal;
    }

    public void setPftotal(Integer pftotal) {
        this.pftotal = pftotal;
    }

    @Basic
    @Column(name = "pfjlfs", nullable = true, precision = 2)
    public BigDecimal getPfjlfs() {
        return pfjlfs;
    }

    public void setPfjlfs(BigDecimal pfjlfs) {
        this.pfjlfs = pfjlfs;
    }

    @Basic
    @Column(name = "pfdata", nullable = true)
    public Timestamp getPfdata() {
        return pfdata;
    }

    public void setPfdata(Timestamp pfdata) {
        this.pfdata = pfdata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Performance that = (Performance) o;
        return Objects.equals(pfid, that.pfid) &&
                Objects.equals(pftotal, that.pftotal) &&
                Objects.equals(pfjlfs, that.pfjlfs) &&
                Objects.equals(pfdata, that.pfdata);
    }

    @Override
    public int hashCode() {

        return Objects.hash(pfid, pftotal, pfjlfs, pfdata);
    }

    @ManyToOne
    @JoinColumn(name = "gdid", referencedColumnName = "gdid")
    public Grade getGradeByGdid() {
        return gradeByGdid;
    }

    public void setGradeByGdid(Grade gradeByGdid) {
        this.gradeByGdid = gradeByGdid;
    }
}
