package com.example.demo;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.stereotype.Component;

public class pojo {




    private int stid;
    private String studentName;

    public int getStid() {
        return stid;
    }

    public void setStid(int stid) {
        this.stid = stid;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    private int phoneNo;

    public pojo() {
    }


    public pojo(String studentName) {
        this.studentName = studentName;
    }
}
