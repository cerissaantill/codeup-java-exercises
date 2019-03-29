package oopPractice;
import java.lang.String;


abstract class Employee {

    protected String name;
    protected String department;


    public Employee(String name, String department) {   // Employee constructor
        this.name = name;
        this.department = department;
    }


    public String getName() {                    //  method getName
        System.out.println("\nEmployee name: ");
        return name;
    }


    public String getDepartment() {             // method  getDepartment
        System.out.println("\nDepartment: ");
        return department;
    }


    abstract String work();                      // abstract method has ;
                                                    // (instead of a body)



}  // closes Employee class
