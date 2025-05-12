package com.workintech.developers;

public class JuniorDeveloper extends  Employee{

    public  JuniorDeveloper(int id, String name, int salary) {

        super(id,name,salary);
    }

    @Override
    public void work() {
        System.out.println("Junior Developer is coding basic features and learning from mentors.");
        setSalary(getSalary() + 500); // Junior Dev maaşını arttır
    }
}
