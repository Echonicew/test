package com.study.pojo;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Product {
    private Integer id;
    private String productname;
    private String descs;
    private Integer cid;
    private List<Ordetails> details;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "productname")
    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    @Basic
    @Column(name = "descs")
    public String getDescs() {
        return descs;
    }

    public void setDescs(String descs) {
        this.descs = descs;
    }

    @Basic
    @Column(name = "cid")
    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) && Objects.equals(productname, product.productname) && Objects.equals(descs, product.descs) && Objects.equals(cid, product.cid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productname, descs, cid);
    }

    @OneToMany(mappedBy = "myproduct")
    public List<Ordetails> getDetails() {
        return details;
    }

    public void setDetails(List<Ordetails> details) {
        this.details = details;
    }
}
