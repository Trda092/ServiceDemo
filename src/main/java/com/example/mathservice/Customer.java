package com.example.mathservice;

import org.springframework.web.bind.annotation.*;

@RestController
public class Customer {
    private String name;
    private String ID;
    private int age;
    private boolean sex;

    public Customer(){
        this.ID = "";
        this.name = "";
        this.age = 0;
        this.sex = false;
    }
    public Customer(String ID, String n, int a, boolean s){
         this.ID = ID;
         this.name = n;
         if (a<0){
             this.age = 0;
         }
         else{this.age = a;}
            this.sex = s;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

}
