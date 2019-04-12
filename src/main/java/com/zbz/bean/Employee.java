package com.zbz.bean;

/**
 * @author: ag
 * @date: 2019/4/11 21:32
 */

public class Employee {
    public Employee() {
    }
    public Employee(String name, String work) {
        this.name = name;
        this.work = work;
    }
    private String name;
    private String work;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getWork() {
        return work;
    }
    public void setWork(String work) {
        this.work = work;
    }
}
