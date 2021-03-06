﻿package ims.sunmmon.domain;

import java.io.Serializable;
import java.sql.Date;

// 입고 
public class Warehousing implements Serializable {

    // 번호 
    private Integer wareNo;

    // 품목 
    private String itemNo;

    // 입고예정일 
    private Date wareDate;

    // 입고단위 
    private Integer unit;

    // 매입단가 
    private Integer price;

    // 할인금액 
    private Integer discount;

    // 적요 
    private String conVer;

    // 사용(조회)가능여부 
    private Integer useable;

    public Integer getWareNo() {
        return wareNo;
    }

    public void setWareNo(Integer wareNo) {
        this.wareNo = wareNo;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public Date getWareDate() {
        return wareDate;
    }

    public void setWareDate(Date wareDate) {
        this.wareDate = wareDate;
    }

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public String getConVer() {
        return conVer;
    }

    public void setConVer(String conVer) {
        this.conVer = conVer;
    }

    public Integer getUseable() {
        return useable;
    }

    public void setUseable(Integer useable) {
        this.useable = useable;
    }

    // Warehousing 모델 복사
    public void CopyData(Warehousing param)
    {
        this.wareNo = param.getWareNo();
        this.itemNo = param.getItemNo();
        this.wareDate = param.getWareDate();
        this.unit = param.getUnit();
        this.price = param.getPrice();
        this.discount = param.getDiscount();
        this.conVer = param.getConVer();
        this.useable = param.getUseable();
    }
}