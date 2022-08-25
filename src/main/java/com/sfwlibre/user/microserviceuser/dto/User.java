package com.sfwlibre.user.microserviceuser.dto;

import java.util.Date;

public class User {
    
    private int user_id;
    private String name;
    private String last_name;

    
    private Date date_register;
    
    private Date date_down;
    private String user;
    private String access_token;
    public int getUser_id() {
        return user_id;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
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
    public Date getDate_register() {
        return date_register;
    }
    public void setDate_register(Date date_register) {
        this.date_register = date_register;
    }
    public Date getDate_down() {
        return date_down;
    }
    public void setDate_down(Date date_down) {
        this.date_down = date_down;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getAccess_token() {
        return access_token;
    }
    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }
    
    @Override
    public String toString() {
        return "User [access_token=" + access_token + ", date_down=" + date_down + ", date_register=" + date_register
                + ", last_name=" + last_name + ", name=" + name + ", user=" + user + ", user_id=" + user_id + "]";
    }

  
    
}
