package com.fiuni.sd.brick_management.client.beans.rol;

import com.fiuni.sd.brick_management.client.beans.base.BaseBean;
import org.apache.commons.lang.StringUtils;

import java.util.Map;

public class RolB extends BaseBean {

    private static final long serialVersionUID = 1L;
    private String type;

    public RolB(Map<String, String> params) {
        super(params);
    }

    public String getType() {

        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    protected void create(Map<String, String> params) {
        if (!StringUtils.isBlank(params.get("id"))) {
            setId(Integer.valueOf(params.get("id")));
        }
        setType(params.get("type"));
    }
}
