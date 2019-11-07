package com.fiuni.sd.brick_management.client.beans.budgetDetail;

import com.fiuni.sd.brick_management.client.beans.base.BaseBean;
import org.apache.commons.lang.StringUtils;

import java.util.Map;

public class BudgetDetailB extends BaseBean {
    private static final long serialVersionUID = 1L;
    private Integer amount;
    private Integer quantity;
    private Integer budget_id;
    private Integer budget_concept_id;

    public BudgetDetailB(Map<String, String> params) {
        super(params);
    }
    public Integer getAmount() {

        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    public Integer getQuantity() {

        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Integer getBudget_id() {

        return budget_id;
    }

    public void setBudget_id(Integer budget_id) {
        this.budget_id = budget_id;
    }
    public Integer getBudget_concept_id() {

        return budget_concept_id;
    }

    public void setBudget_concept_id(Integer budget_concept_id) {
        this.budget_concept_id = budget_concept_id;
    }
    @Override
    protected void create(Map<String, String> params) {
        if (!StringUtils.isBlank(params.get("id"))) {
            setId(Integer.valueOf(params.get("id")));
        }
        if(!StringUtils.isBlank(params.get("amount"))){
            setAmount(Integer.valueOf(params.get("amount")));
        }
        if(!StringUtils.isBlank(params.get("quantity"))){
            setQuantity(Integer.valueOf(params.get("quantity")));
        }
        if(!StringUtils.isBlank(params.get("budget_id"))){
            setBudget_id(Integer.valueOf(params.get("budget_id")));
        }
        if(!StringUtils.isBlank(params.get("budget_concept_id"))){
            setBudget_concept_id(Integer.valueOf(params.get("budget_concept_id")));
        }
    }
}
