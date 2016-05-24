package com.eeknev.org;

/**
 * Created by vgontla on 5/24/2016.
 */
public class Student {

    private String name;
    private String company;
    private int age;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String tosString(){
        return "Student";
    }
}
