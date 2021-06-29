package com.study.vo;

import java.math.BigDecimal;
import java.sql.Timestamp;

/*
 * @author SMILE.Huang
 * @date 2021-06-08 15:33
 */
public class OrdersVo {
    private Integer oid;
    private Integer uid;
    private String oState;
    private Timestamp oTime;
    private String oConsignee;
    private String oPhone;
    private String oAddress;
    private BigDecimal oRental;

    private String begin;
    private String end;

    @Override
    public String toString() {
        return "OrdersVo{" +
                "oid=" + oid +
                ", uid=" + uid +
                ", oState='" + oState + '\'' +
                ", oTime=" + oTime +
                ", oConsignee='" + oConsignee + '\'' +
                ", oPhone='" + oPhone + '\'' +
                ", oAddress='" + oAddress + '\'' +
                ", oRental=" + oRental +
                ", begin=" + begin +
                ", end=" + end +
                '}';
    }

    public Integer getOid() {

        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getoState() {
        return oState;
    }

    public void setoState(String oState) {
        this.oState = oState;
    }

    public Timestamp getoTime() {
        return oTime;
    }

    public void setoTime(Timestamp oTime) {
        this.oTime = oTime;
    }

    public String getoConsignee() {
        return oConsignee;
    }

    public void setoConsignee(String oConsignee) {
        this.oConsignee = oConsignee;
    }

    public String getoPhone() {
        return oPhone;
    }

    public void setoPhone(String oPhone) {
        this.oPhone = oPhone;
    }

    public String getoAddress() {
        return oAddress;
    }

    public void setoAddress(String oAddress) {
        this.oAddress = oAddress;
    }

    public BigDecimal getoRental() {
        return oRental;
    }

    public void setoRental(BigDecimal oRental) {
        this.oRental = oRental;
    }

    public String getBegin() {
        return begin;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
}
