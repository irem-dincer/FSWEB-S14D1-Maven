package com.workintech.developers;

public class SeniorDeveloper extends  Employee{

    public  SeniorDeveloper(int id, String name, int salary) {
        super(id,name,salary);

    }

    @Override
    public void work() {
        System.out.println("Senior Developer is designing architecture, mentoring juniors, and solving critical issues.");
        setSalary(getSalary() + 2000); // Senior Dev maaşını arttır
    }

}
