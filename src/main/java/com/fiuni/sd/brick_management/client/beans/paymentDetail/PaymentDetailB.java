package com.fiuni.sd.brick_management.client.beans.paymentDetail;

import com.fiuni.sd.brick_management.client.beans.base.BaseBean;
import org.apache.commons.lang.StringUtils;

import java.util.Map;

public class PaymentDetailB extends BaseBean {
    private static final long serialVersionUID = 1L;
    private Integer unitPrice;
    private Integer quantity;
    private Integer payment_id;
    private Integer paymentConceptId;
    private Integer paymentRealatedId;

    public PaymentDetailB(Map<String, String> params) {
        super(params);
    }
    public Integer getUnitPrice(){
        return unitPrice;
    }
    public void setUnitPrice(Integer unitPrice){
        this.unitPrice = unitPrice;
    }
    public Integer getQuantity(){
        return quantity;
    }
    public void setQuantity(Integer quantity){
        this.quantity = quantity;
    }
    public Integer getPayment_id(){
        return payment_id;
    }
    public void setPayment_id(Integer payment_id){
        this.payment_id = payment_id;
    }
    public Integer getPaymentConceptId(){
        return paymentConceptId;
    }
    public void setPaymentConceptId(Integer paymentConceptId){
        this.paymentConceptId = paymentConceptId;
    }
    public Integer getPaymentRealatedId(){
        return paymentRealatedId;
    }
    public void setPaymentRealatedId(Integer paymentRealatedId){
        this.paymentRealatedId = paymentRealatedId;
    }
    @Override
    protected void create(Map<String, String> params) {
        if (!StringUtils.isBlank(params.get("id"))) {
            setId(Integer.valueOf(params.get("id")));
        }
        if(!StringUtils.isBlank(params.get("unitPrice"))){
            setUnitPrice(Integer.valueOf(params.get("unitPrice")));
        }
        if(!StringUtils.isBlank(params.get("quantity"))){
            setQuantity(Integer.valueOf(params.get("quantity")));
        }
        if(!StringUtils.isBlank(params.get("payment_id"))){
            setPayment_id(Integer.valueOf(params.get("payment_id")));
        }
        if(!StringUtils.isBlank(params.get("paymentConceptId"))){
            setPaymentConceptId(Integer.valueOf(params.get("paymentConceptId")));
        }
        if(!StringUtils.isBlank(params.get("paymentRealatedId"))){
            setPaymentRealatedId(Integer.valueOf(params.get("paymentRealatedId")));
        }
    }

}
