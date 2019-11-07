package com.fiuni.sd.brick_management.client.beans.budgetConcept;

import com.fiuni.sd.brick_management.client.beans.base.BaseBean;
import org.apache.commons.lang.StringUtils;

import java.util.Map;

public class BudgetConceptB extends BaseBean {

    private static final long serialVersionUID = 1L;
    private String description;

    public BudgetConceptB(Map<String, String> params) {
        super(params);
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    protected void create(Map<String, String> params) {
        if (!StringUtils.isBlank(params.get("id"))) {
            setId(Integer.valueOf(params.get("id")));
        }
        setDescription(params.get("description"));
    }
}
