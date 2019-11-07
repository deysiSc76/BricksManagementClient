package com.fiuni.sd.brick_management.client.beans.charge;

import com.fiuni.sd.brick_management.client.beans.base.BaseBean;
import org.apache.commons.lang.StringUtils;

import java.util.Map;

public class ChargeB extends BaseBean {
    private static final long serialVersionUID = 1L;
    private String description;
    private int amount;
    private String date;
    private int budget_id;
    private int client_id;

    public ChargeB(Map<String, String> params) {
        super(params);
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public int getAmount() {

        return amount;
    }

    public void setAmountn(int amount) {
        this.amount = amount;
    }
    public String getDate() {

        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public int getBudget_id() {

        return budget_id;
    }

    public void setBudget_id(int budget_id) {
        this.budget_id = budget_id;
    }
    public int getClient_id() {

        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    @Override
    protected void create(Map<String, String> params) {
        if (!StringUtils.isBlank(params.get("id"))) {
            setId(Integer.valueOf(params.get("id")));
        }
        setDescription(params.get("description"));
        setDate(params.get("date"));
        if (!StringUtils.isBlank(params.get("amount"))) {
            setAmountn(Integer.valueOf(params.get("amount")));
        }
        if (!StringUtils.isBlank(params.get("budget_id"))) {
            setBudget_id(Integer.valueOf(params.get("budget_id")));
        }
        if (!StringUtils.isBlank(params.get("client_id"))) {
            setClient_id(Integer.valueOf(params.get("client_id")));
        }



    }
}
