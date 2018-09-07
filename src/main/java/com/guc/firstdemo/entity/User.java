package com.guc.firstdemo.entity;

import javax.persistence.*;


/**
 * 用户model
 */
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    //   GenerationType.AUTO 主键由程序控制
    //GenerationType.IDENTITY 主键由数据库自动生成（主要是自动增长类型）

    private String name;

    private String password;

    private int age;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
