package com.workintech.developers;



public class MidDeveloper extends  Employee{

public MidDeveloper(int id, String name, int salary){

    super(id,name,salary);
}

    @Override
    public void work() {
        System.out.println("Mid Developer is implementing complex features and participating in code reviews.");
        setSalary(getSalary() + 1000); // Junior Dev maaşını arttır
    }
}
