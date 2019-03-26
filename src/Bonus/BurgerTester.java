package Bonus;

public class BurgerTester {
    public static void main(String[] args) {

        BurgerTools burger = new BurgerTools();
        burger.mostPopularTopping = "cheese";
        burger.averageDaysBeforeExpiration = 3;
        burger.temperatureWhenCooked = 350;

        burger.grill();

        System.out.println(burger.mostPopularTopping);
        System.out.println(burger.averageDaysBeforeExpiration);
        System.out.println(burger.temperatureWhenCooked);

        burger.buildBurger("bacon", 3, 425);

        System.out.println(burger.mostPopularTopping);
        System.out.println(burger.averageDaysBeforeExpiration);
        System.out.println(burger.temperatureWhenCooked);

    }

}



// ===================================
//
//-- SHORT ASSIGNMENT #2 (part 1) --
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