package com.fiuni.sd.brick_management.client.beans.budget;

import com.fiuni.sd.brick_management.client.beans.base.BaseBean;
import org.apache.commons.lang.StringUtils;

import java.util.Map;

public class BudgetB extends BaseBean {
    private static final long serialVersionUID = 1L;
    private Integer totalAmount;
    private Integer workId;


    public BudgetB(Map<String, String> params) {
        super(params);
    }

    public Integer getTotalAmount() {

        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }
    public Integer getWorkId() {

        return workId;
    }

    public void setWorkId(Integer workId) {
        this.workId = workId;
    }
    @Override
    protected void create(Map<String, String> params) {
        if (!StringUtils.isBlank(params.get("id"))) {
            setId(Integer.valueOf(params.get("id")));
        }
        if(!StringUtils.isBlank(params.get("totalAmount"))){
            setTotalAmount(Integer.valueOf(params.get("totalAmount")));
        }
        if(!StringUtils.isBlank(params.get("workId"))){
            setWorkId(Integer.valueOf(params.get("workId")));
        }
    }
}
