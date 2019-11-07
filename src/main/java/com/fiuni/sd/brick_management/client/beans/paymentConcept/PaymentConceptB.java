package com.fiuni.sd.brick_management.client.beans.paymentConcept;

import com.fiuni.sd.brick_management.client.beans.base.BaseBean;
import org.apache.commons.lang.StringUtils;

import java.util.Map;

public class PaymentConceptB extends BaseBean  {
    private static final long serialVersionUID = 1L;
    private String name;
    private Integer cost;
    private String description;
    private Boolean material;
    private Integer budgetConceptId;
    private Integer providerId;

    public PaymentConceptB(Map<String, String> params) {
        super(params);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getCost() {
        return cost;
    }
    public void setCost(Integer cost) {
        this.cost = cost;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Boolean getMaterial() {
        return material;
    }
    public void setMaterial(Boolean material) {
        this.material = material;
    }
    public Integer getBudgetConceptId() {
        return budgetConceptId;
    }
    public void setBudgetConceptId(Integer budgetConceptId) {
        this.budgetConceptId = budgetConceptId;
    }
    public Integer getProviderId() {
        return providerId;
    }
    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    @Override
    protected void create(Map<String, String> params) {
        if (!StringUtils.isBlank(params.get("id"))) {
            setId(Integer.valueOf(params.get("id")));
        }
        setName(params.get("name"));
        if(!StringUtils.isBlank(params.get("cost"))){
            setCost(Integer.valueOf(params.get("cost")));
        }
        setDescription(params.get("description"));
        if(!StringUtils.isBlank(params.get("material"))){
            setMaterial(Boolean.valueOf(params.get("cost")));
        }
        if(!StringUtils.isBlank(params.get("budgetConceptId"))){
            setBudgetConceptId(Integer.valueOf(params.get("budgetConceptId")));
        }
        if(!StringUtils.isBlank(params.get("providerId"))){
            setProviderId(Integer.valueOf(params.get("providerId")));
        }
    }


}
