package com.study.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Jihui {
    private Integer jid;
    private String laiyuan;
    private String kehuname;
    private Byte jilv;
    private String gaiyao;
    private String lianxiren;
    private String dianhua;
    private String miaoshu;
    private String cjren;
    private Timestamp cjtime;

    @Id
    @Column(name = "jid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }

    @Basic
    @Column(name = "laiyuan")
    public String getLaiyuan() {
        return laiyuan;
    }

    public void setLaiyuan(String laiyuan) {
        this.laiyuan = laiyuan;
    }

    @Basic
    @Column(name = "kehuname")
    public String getKehuname() {
        return kehuname;
    }

    public void setKehuname(String kehuname) {
        this.kehuname = kehuname;
    }

    @Basic
    @Column(name = "jilv")
    public Byte getJilv() {
        return jilv;
    }

    public void setJilv(Byte jilv) {
        this.jilv = jilv;
    }

    @Basic
    @Column(name = "gaiyao")
    public String getGaiyao() {
        return gaiyao;
    }

    public void setGaiyao(String gaiyao) {
        this.gaiyao = gaiyao;
    }

    @Basic
    @Column(name = "lianxiren")
    public String getLianxiren() {
        return lianxiren;
    }

    public void setLianxiren(String lianxiren) {
        this.lianxiren = lianxiren;
    }

    @Basic
    @Column(name = "dianhua")
    public String getDianhua() {
        return dianhua;
    }

    public void setDianhua(String dianhua) {
        this.dianhua = dianhua;
    }

    @Basic
    @Column(name = "miaoshu")
    public String getMiaoshu() {
        return miaoshu;
    }

    public void setMiaoshu(String miaoshu) {
        this.miaoshu = miaoshu;
    }

    @Basic
    @Column(name = "cjren")
    public String getCjren() {
        return cjren;
    }

    public void setCjren(String cjren) {
        this.cjren = cjren;
    }

    @Basic
    @Column(name = "cjtime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Timestamp getCjtime() {
        return cjtime;
    }

    public void setCjtime(Timestamp cjtime) {
        this.cjtime = cjtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jihui jihui = (Jihui) o;
        return Objects.equals(jid, jihui.jid) && Objects.equals(laiyuan, jihui.laiyuan) && Objects.equals(kehuname, jihui.kehuname) && Objects.equals(jilv, jihui.jilv) && Objects.equals(gaiyao, jihui.gaiyao) && Objects.equals(lianxiren, jihui.lianxiren) && Objects.equals(dianhua, jihui.dianhua) && Objects.equals(miaoshu, jihui.miaoshu) && Objects.equals(cjren, jihui.cjren) && Objects.equals(cjtime, jihui.cjtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jid, laiyuan, kehuname, jilv, gaiyao, lianxiren, dianhua, miaoshu, cjren, cjtime);
    }
}
