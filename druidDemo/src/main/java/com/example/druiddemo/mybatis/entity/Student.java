package com.example.druiddemo.mybatis.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {
    private String id;
    private String studentname;
    private String classid;
    private int count;
}
