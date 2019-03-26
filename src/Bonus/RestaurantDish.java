package Bonus;

public class RestaurantDish {

    public int costInCents;
    public String nameOfDish;
    public boolean wouldRecommend;

    public void eat () {
        System.out.println("Nom nom nom!");
    }

}
// RestaurantDish class

// ===============================================================
// -- SHORT ASSIGNMENT #2 (part 2) --
//  Refactor your RestaurantDish and RestaurantTest classes...

//   1) Change your public properties in your RestaurantDish class to private
//   2) Add getters and setters for these properties (write them manually then erase them and use IntelliJ to do this quickly)
//   3) Refactor code used in RestaurantTest to set and print these property values...
//       ...to use your getters and setters
//    4) Add a constructor method to RestaurantDish that will assign property...
//       ...values based on arguments passed into the constructor
//
