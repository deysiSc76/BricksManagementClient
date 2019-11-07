package com.fiuni.sd.brick_management.client.beans.work;

import com.fiuni.sd.brick_management.client.beans.base.BaseBean;
import org.apache.commons.lang.StringUtils;

import java.util.Map;

public class WorkB extends BaseBean {
    private static final long serialVersionUID = 1L;
    private String name;
    private String description;
    private Integer clientId;
    private String address;
    private String startDate;
    private  String end_date;
    private String personnelManager;
    private Integer budgetId;

    public WorkB(Map<String, String> params) {
        super(params);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public Integer getClientId(){
        return clientId;
    }
    public void setClientId(Integer clientId){
        this.clientId = clientId;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getStartDate(){
        return startDate;
    }
    public void setStartDate(String startDate){
        this.startDate = startDate;
    }
    public String getEnd_date(){
        return end_date;
    }
    public void setEnd_date(String end_date){
        this.end_date = end_date;
    }
    public String getPersonnelManager(){
        return personnelManager;
    }
    public void setPersonnelManager(String personnelManager){
        this.personnelManager = personnelManager;
    }
    public Integer getBudgetId(){
        return budgetId;
    }
    public void setBudgetId(Integer budgetId){
        this.budgetId = budgetId;
    }
    @Override
    protected void create(Map<String, String> params) {
        if (!StringUtils.isBlank(params.get("id"))) {
            setId(Integer.valueOf(params.get("id")));
        }
        setName(params.get("name"));
        setDescription(params.get("description"));
        if(!StringUtils.isBlank(params.get("clientId"))){
            setClientId(Integer.valueOf(params.get("clientId")));
        }
        setAddress(params.get("address"));
        setStartDate(params.get("startDate"));
        setEnd_date(params.get("end_date"));
        setPersonnelManager(params.get("personalManager"));
        if(!StringUtils.isBlank(params.get("budgetId"))){
            setBudgetId(Integer.valueOf(params.get("budgetId")));
        }
    }

}
