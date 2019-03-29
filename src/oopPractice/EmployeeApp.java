package oopPractice;
import java.lang.String;
import java.awt.print.Printable;

public class EmployeeApp {
    public static void main(String[] args) {

        Employee emp1 = new Programmer("Susan", "HR");  // instantiation

        Employee emp2 = new SecurityGuard("Jane");        // instantiation


        System.out.println(emp1.getName());
        System.out.println(emp1.work());
        System.out.println(emp2.getDepartment());
        System.out.println(emp2.work());



    }  // closes main


}  // closes EmployeeApp class



