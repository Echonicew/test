package com.study.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Orderes {
    private Integer id;
    private String ideres;
    private String oname;
    private String iphone;
    private String peis;
    private String zhif;
    private String orderes;
    private Date times;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ideres")
    public String getIderes() {
        return ideres;
    }

    public void setIderes(String ideres) {
        this.ideres = ideres;
    }

    @Basic
    @Column(name = "oname")
    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname;
    }

    @Basic
    @Column(name = "iphone")
    public String getIphone() {
        return iphone;
    }

    public void setIphone(String iphone) {
        this.iphone = iphone;
    }

    @Basic
    @Column(name = "peis")
    public String getPeis() {
        return peis;
    }

    public void setPeis(String peis) {
        this.peis = peis;
    }

    @Basic
    @Column(name = "zhif")
    public String getZhif() {
        return zhif;
    }

    public void setZhif(String zhif) {
        this.zhif = zhif;
    }

    @Basic
    @Column(name = "orderes")
    public String getOrderes() {
        return orderes;
    }

    public void setOrderes(String orderes) {
        this.orderes = orderes;
    }

    @Basic
    @Column(name = "times")
    public Date getTimes() {
        return times;
    }

    public void setTimes(Date times) {
        this.times = times;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orderes orderes1 = (Orderes) o;
        return Objects.equals(id, orderes1.id) && Objects.equals(ideres, orderes1.ideres) && Objects.equals(oname, orderes1.oname) && Objects.equals(iphone, orderes1.iphone) && Objects.equals(peis, orderes1.peis) && Objects.equals(zhif, orderes1.zhif) && Objects.equals(orderes, orderes1.orderes) && Objects.equals(times, orderes1.times);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ideres, oname, iphone, peis, zhif, orderes, times);
    }
}
