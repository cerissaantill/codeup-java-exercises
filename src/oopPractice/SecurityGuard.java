package oopPractice;
import java.awt.print.Printable;

public class SecurityGuard extends Employee {

    public SecurityGuard(String name) {         // SecurityGuard constructor
        super(name, "Security");
    }


    String work() {             // command N option, first thing setup on doc
        return "\nHey, keep out!\n";
    }

    public void print() {
        System.out.println("Here is your parking pass. Have a nice day.");
    }


}  // closes SecurityGuard class

