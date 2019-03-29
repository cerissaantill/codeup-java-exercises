package oopPractice;


public class SecurityGuard extends Employee {

    public SecurityGuard(String name) {         // SecurityGuard constructor
        super(name, "Security");
    }


    String work() {             // command N option, first thing setup on doc
        return "\nHey, keep out!\n";
    }


}  // closes SecurityGuard class

