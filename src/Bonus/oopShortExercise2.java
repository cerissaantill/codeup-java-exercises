package Bonus;

public class oopShortExercise2 {
    public void main(String[] args) {

class BurgerTools {
    private String mostPopularTopping;
    private int averageDaysBeforeExpiration;
    private int temperatureWhenCooked;
    public void grill() {
        System.out.print(BurgerTools.toString());
    }

    class BurgerTester {
        private String mostPopularTopping;
        private int averageDaysBeforeExpiration;
        private int temperatureWhenCooked;

        public void main(String[] args) {
            BurgerTester burger1 = new BurgerTester();
            burger1.mostPopularTopping = "Cheese";
            burger1.averageDaysBeforeExpiration = 3;
            burger1.temperatureWhenCooked = 200;

            System.out.println(burger1);
        }

    }
    // BurgerTester class

}
// BurgerTools class


    }
    // closes main method
}
// closes oopShortExercise2 class



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
//
//
//        -- SHORT ASSIGNMENT #2 (part 2) --
//        Refactor your RestaurantDish and RestaurantTest classes...
//        1) Change your public properties in your RestaurantDish class to private
//  2) Add getters and setters for these properties (write them manually then erase them and use IntelliJ to do this quickly)
//          3) Refactor code used in RestaurantTest to set and print these property values...
//          ...to use your getters and setters
//          4) Add a constructor method to RestaurantDish that will assign property...
//          ...values based on arguments passed into the constructor
//


class RestaurantDish {

    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;
    private void eat() {
        System.out.println("\nNom nom nom!\n");
    }


    public static void main(String[] args) {
        RestaurantDish dish = new RestaurantDish();
        dish.costInCents = 3000;
        dish.nameOfDish = "\nPasta\n";
        dish.wouldRecommend = true;
        dish.eat();

        System.out.printf("\n%d %s %b\n",
                dish.costInCents,
                dish.nameOfDish,
                dish.wouldRecommend);

    }
    //  /main

}
//  /Bonus.RestaurantDish
