package com.fiuni.sd.brick_management.client.beans.provider;


import java.util.Map;

import com.fiuni.sd.brick_management.client.beans.base.BaseBean;
import org.apache.commons.lang.StringUtils;


public class ProviderB extends BaseBean {

    private static final long serialVersionUID = 1L;
    private String bussinessName;
    private int number;
    private String address;
    private String ruc;

    public ProviderB(Map<String, String> params) {
        super(params);
    }

    public String getBussinessName() {

        return bussinessName;
    }

    public void setBussinessName(String bussinessName )
    {
        this.bussinessName= bussinessName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number ) {
        this.number= number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address ) {
        this.address= address;
    }
    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc ) {
        this.ruc= ruc;
    }




    @Override
    protected void create(Map<String, String> params) {
        if (!StringUtils.isBlank(params.get("id"))) {
            setId(Integer.valueOf(params.get("id")));
        }
        setBussinessName(params.get("bussinessName"));
        if (!StringUtils.isBlank(params.get("number"))) {
            setNumber(Integer.valueOf(params.get("number")));
        }
        setAddress(params.get("address"));
        setRuc(params.get("ruc"));



    }

    /*
    * {
    *   "id": "1",
    *   "name": "empresa",
    *   "location": "encar"
    * }
    * */

}
