﻿package ims.sunmmon.domain;

import java.io.Serializable;

// 대체거래 
public class Transferslip implements Serializable {

    // 번호 
    private Integer tsNo;

    // 거래일 
    private String tsDate;

    // 거래처번호 
    private String clientNo;

    // 적요 
    private String conVer;

    // 차변계정 
    private Integer debtorNo;

    // 차변금액 
    private Integer debtorAmmount;

    // 대변계정 
    private Integer creditNo;

    // 대변금액 
    private Integer creditAmmount;

    // 사용(조회)가능여부 
    private Integer useable;

    // 비고 
    private String note;

    public Integer getTsNo() {
        return tsNo;
    }

    public void setTsNo(Integer tsNo) {
        this.tsNo = tsNo;
    }

    public String getTsDate() {
        return tsDate;
    }

    public void setTsDate(String tsDate) {
        this.tsDate = tsDate;
    }

    public String getClientNo() {
        return clientNo;
    }

    public void setClientNo(String clientNo) {
        this.clientNo = clientNo;
    }

    public String getConVer() {
        return conVer;
    }

    public void setConVer(String conVer) {
        this.conVer = conVer;
    }

    public Integer getDebtorNo() {
        return debtorNo;
    }

    public void setDebtorNo(Integer debtorNo) {
        this.debtorNo = debtorNo;
    }

    public Integer getDebtorAmmount() {
        return debtorAmmount;
    }

    public void setDebtorAmmount(Integer debtorAmmount) {
        this.debtorAmmount = debtorAmmount;
    }

    public Integer getCreditNo() {
        return creditNo;
    }

    public void setCreditNo(Integer creditNo) {
        this.creditNo = creditNo;
    }

    public Integer getCreditAmmount() {
        return creditAmmount;
    }

    public void setCreditAmmount(Integer creditAmmount) {
        this.creditAmmount = creditAmmount;
    }

    public Integer getUseable() {
        return useable;
    }

    public void setUseable(Integer useable) {
        this.useable = useable;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    // Transferslip 모델 복사
    public void CopyData(Transferslip param)
    {
        this.tsNo = param.getTsNo();
        this.tsDate = param.getTsDate();
        this.clientNo = param.getClientNo();
        this.conVer = param.getConVer();
        this.debtorNo = param.getDebtorNo();
        this.debtorAmmount = param.getDebtorAmmount();
        this.creditNo = param.getCreditNo();
        this.creditAmmount = param.getCreditAmmount();
        this.useable = param.getUseable();
        this.note = param.getNote();
    }
}