package com.chenqian.cityLifeend.user;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

/**
 * @Author:chenqian
 * @Description:用户实体类
 * @Date: created in 11:05 2017/11/5
 */
@Entity
@Table(name = "sec_user")
public class User {
    @Id
    @GeneratedValue
    private Float id;
    //姓名
    @Column(name = "name")
    private String name;
    //密码
    @Column(name = "password")
    private String password;
    //用户名
    @Column(name = "username")
    private String username;
    //电子邮件
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonIgnore
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Float getId() {
        return id;
    }

    public void setId(Float id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
