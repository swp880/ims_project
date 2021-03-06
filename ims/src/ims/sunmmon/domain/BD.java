﻿package ims.sunmmon.domain;

import java.io.Serializable;
import java.sql.Date;

// 출고/입금 
public class BD implements Serializable {

    // 번호 
    private Integer bdNo;

    // 출고번호 
    private Integer beNo;

    // 입금번호 
    private Integer depNo;

    // 거래완료일 
    private Date bdDate;

    // 매출수량 
    private Integer quantity;

    // 금액합계 
    private Integer ammount;

    // 사용(조회)가능여부 
    private Integer useable;

    // 적요 
    private String conVer;

    // 비고 
    private String note;

    public Integer getBdNo() {
        return bdNo;
    }

    public void setBdNo(Integer bdNo) {
        this.bdNo = bdNo;
    }

    public Integer getBeNo() {
        return beNo;
    }

    public void setBeNo(Integer beNo) {
        this.beNo = beNo;
    }

    public Integer getDepNo() {
        return depNo;
    }

    public void setDepNo(Integer depNo) {
        this.depNo = depNo;
    }

    public Date getBdDate() {
        return bdDate;
    }

    public void setBdDate(Date bdDate) {
        this.bdDate = bdDate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getAmmount() {
        return ammount;
    }

    public void setAmmount(Integer ammount) {
        this.ammount = ammount;
    }

    public Integer getUseable() {
        return useable;
    }

    public void setUseable(Integer useable) {
        this.useable = useable;
    }

    public String getConVer() {
        return conVer;
    }

    public void setConVer(String conVer) {
        this.conVer = conVer;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    // Bd 모델 복사
    public void CopyData(BD param)
    {
        this.bdNo = param.getBdNo();
        this.beNo = param.getBeNo();
        this.depNo = param.getDepNo();
        this.bdDate = param.getBdDate();
        this.quantity = param.getQuantity();
        this.ammount = param.getAmmount();
        this.useable = param.getUseable();
        this.conVer = param.getConVer();
        this.note = param.getNote();
    }
}