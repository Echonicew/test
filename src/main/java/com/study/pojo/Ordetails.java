package com.study.pojo;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class Ordetails {
    private Integer odid;
    private Integer num;
    private BigDecimal gPrice;
    private Orders mydrder;
    private Product myproduct;

    @Id
    @Column(name = "odid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getOdid() {
        return odid;
    }

    public void setOdid(Integer odid) {
        this.odid = odid;
    }

    @Basic
    @Column(name = "num")
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Basic
    @Column(name = "g_price")
    public BigDecimal getgPrice() {
        return gPrice;
    }

    public void setgPrice(BigDecimal gPrice) {
        this.gPrice = gPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ordetails ordetails = (Ordetails) o;
        return Objects.equals(odid, ordetails.odid) && Objects.equals(num, ordetails.num) && Objects.equals(gPrice, ordetails.gPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(odid, num, gPrice);
    }

    @ManyToOne
    @JoinColumn(name = "oid", referencedColumnName = "oid")
    public Orders getMydrder() {
        return mydrder;
    }

    public void setMydrder(Orders mydrder) {
        this.mydrder = mydrder;
    }

    @ManyToOne
    @JoinColumn(name = "pid", referencedColumnName = "id")
    public Product getMyproduct() {
        return myproduct;
    }

    public void setMyproduct(Product myproduct) {
        this.myproduct = myproduct;
    }
}
