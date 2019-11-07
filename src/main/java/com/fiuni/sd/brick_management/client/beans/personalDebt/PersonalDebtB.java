package com.fiuni.sd.brick_management.client.beans.personalDebt;

import com.fiuni.sd.brick_management.client.beans.base.BaseBean;
import org.apache.commons.lang.StringUtils;

import java.util.Map;

public class PersonalDebtB extends BaseBean {

    private static final long serialVersionUID = 1L;
    private Integer amount;
    private String description;
    private Integer user_id;


    public PersonalDebtB(Map<String, String> params) {
        super(params);
    }
    public Integer getAmount(){
        return amount;
    }
    public void setAmount(Integer amount){
        this.amount = amount;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public Integer getUser_id(){
        return user_id;
    }
    public void setUser_id(Integer user_id){
        this.user_id=user_id;
    }
    @Override
    protected void create(Map<String, String> params) {
        if (!StringUtils.isBlank(params.get("id"))) {
            setId(Integer.valueOf(params.get("id")));
        }
        if(!StringUtils.isBlank(params.get("amount"))){
            setAmount(Integer.valueOf(params.get("amount")));
        }


        setDescription(params.get("description"));

        if(!StringUtils.isBlank(params.get("user_id"))){
            setUser_id(Integer.valueOf(params.get("user_id")));
        }
    }
}
