package com.fiuni.sd.brick_management.client.beans.payment;

import com.fiuni.sd.brick_management.client.beans.base.BaseBean;
import org.apache.commons.lang.StringUtils;

import java.util.Map;

public class PaymentB extends BaseBean {
    private static final long serialVersionUID = 1L;
    private Integer workId;
    private Integer debtId;
    private Integer providerId;
    private Integer total;
    private String date;
    private String documentType;
    private Integer number;
    private Integer stamping;
    private Integer billType;

    public PaymentB(Map<String, String> params) {
        super(params);
    }
    public Integer getWorkId() {
        return workId;
    }

    public void setWorkId(Integer workId) {
        this.workId = workId;
    }
    public Integer getDebtId() {
        return debtId;
    }
    public void setDebtId(Integer debtId) {
        this.debtId = debtId;
    }
    public Integer getProviderId() {
        return providerId;
    }
    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }
    public Integer getTotal() {
        return total;
    }
    public void setTotal(Integer total) {
        this.total = total;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getDocumentType() {
        return documentType;
    }
    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public Integer getStamping() {
        return stamping;
    }
    public void setStamping(Integer stamping) {
        this.stamping = stamping;
    }
    public Integer getBillType() {
        return billType;
    }
    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    @Override
    protected void create(Map<String, String> params) {
        if (!StringUtils.isBlank(params.get("id"))) {
            setId(Integer.valueOf(params.get("id")));
        }
        if(!StringUtils.isBlank(params.get("workId"))){
            setWorkId(Integer.valueOf(params.get("workId")));
        }
        if(!StringUtils.isBlank(params.get("debtId"))){
            setDebtId(Integer.valueOf(params.get("debtId")));
        }
        if(!StringUtils.isBlank(params.get("providerId"))){
            setProviderId(Integer.valueOf(params.get("providerId")));
        }
        if(!StringUtils.isBlank(params.get("total"))){
            setTotal(Integer.valueOf(params.get("total")));
        }
        setDate(params.get("date"));
        setDocumentType(params.get("documentType"));
        if(!StringUtils.isBlank(params.get("number"))){
            setNumber(Integer.valueOf(params.get("number")));
        }
        if(!StringUtils.isBlank(params.get("stamping"))){
            setStamping(Integer.valueOf(params.get("stamping")));
        }
        if(!StringUtils.isBlank(params.get("billType"))){
            setBillType(Integer.valueOf(params.get("billType")));
        }
    }


}

