package com.workintech.developers;

public class Employee {

    private  int id;
    private String name;
    private  int salary;

    public Employee(int id,String name, int salary){

        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println("Employee starts to working");
    }

}
