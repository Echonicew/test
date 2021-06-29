package com.study.vo;


public class pagevo{


    private Integer no;
    private Integer size;

    @Override
    public String toString() {
        return "pagevo{" +
                "no=" + no +
                ", size=" + size +
                '}';
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
