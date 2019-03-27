package bonus;

public class BurgerTools {
    String mostPopularTopping;
    int averageDaysBeforeExpiration;
    int temperatureWhenCooked;
    public void grill () {
        System.out.println("Grilling burger");
    }

    public void buildBurger (String topping, int expiration, int temp) {
        this.mostPopularTopping = topping;
        this.averageDaysBeforeExpiration = expiration;
        this.temperatureWhenCooked = temp;
    }
}


// ========================================================
//
// -- SHORT ASSIGNMENT #2 (part 1) --
//        Create a class of static properties and methods called BurgerTools
//        Include a string property of mostPopularTopping
//        Include an int property of averageDaysBeforeExpiration
//        Include an int property of temperatureWhenCooked
//        Include a void method called grill() that prints out "Grilling burger"
//        Create a class called BurgerTester to test assigning and printing property values
//        and testing methods.
//
//        If you have time, add additional properties and methods.
//
//