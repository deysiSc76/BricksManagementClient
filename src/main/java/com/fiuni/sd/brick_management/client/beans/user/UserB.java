package com.fiuni.sd.brick_management.client.beans.user;

import com.fiuni.sd.brick_management.client.beans.base.BaseBean;
import org.apache.commons.lang.StringUtils;

import java.util.Map;

public class UserB extends BaseBean {
    private static final long serialVersionUID = 1L;
    private String name;
    private String last_name;
    private int number;
    private String document;
    private String address;
    private String comentario;
    private String email;
    private String password;

    public UserB(Map<String, String> params) {
        super(params);
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {

        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getNumber() {

        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDocument() {

        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getComentario() {

        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    protected void create(Map<String, String> params) {
        if (!StringUtils.isBlank(params.get("id"))) {
            setId(Integer.valueOf(params.get("id")));
        }
        setName(params.get("Name"));
        setLast_name(params.get("last_name"));
        if (!StringUtils.isBlank(params.get("number"))) {
            setNumber(Integer.valueOf(params.get("number")));
        }
        setDocument(params.get("document"));
        setAddress(params.get("address"));
        setComentario(params.get("comentario"));
        setEmail(params.get("email"));


    }
}
