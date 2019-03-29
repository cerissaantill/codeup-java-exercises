package oopPractice;
import java.lang.String;


abstract class Employee {

    protected String name;
    protected String department;

    public Employee(String name, String department) {   // Employee constructor
        this.name = name;
        this.department = department;
    }

    public String getName() {           // getName method
        System.out.println("\nEmployee name: ");
        return name;
    }

    public String getDepartment() {     // getDepartment method
        System.out.println("\nDepartment: ");
        return department;
    }

    abstract String work();            // abstract method must have ;





}  // closes Employee class
