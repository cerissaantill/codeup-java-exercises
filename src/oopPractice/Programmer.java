package oopPractice;
import java.lang.String;


public class Programmer extends Employee {

    public Programmer(String name, String department) {      // constructor
        super(name, department);
    }

    String work() {        // work method
        return "\nIT\n";
    }

    String work(String input) {
        return work();
    }


}  // closes Programmer class
