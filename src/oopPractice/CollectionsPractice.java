package oopPractice;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class CollectionsPractice {

//    Create an array of objects (String, for example) and fill it with items
//    and print it out. Then do the equivalent using a List to compare the
//    two data structures.

//    ---> referenced BeginnersBook.com for this exercise


    public static void main(String[] args) {

        ArrayList<String> pizzaToppings = new ArrayList<>();
        pizzaToppings.add("Cheese");
        pizzaToppings.add("Pepperoni");
        pizzaToppings.add("Goat Cheese");
        pizzaToppings.add("Pineapple");
        pizzaToppings.add("Basil");
        pizzaToppings.add("Fresh Tomato");

        //displaying elements
        System.out.println(pizzaToppings);


        //Adding element "Bacon" to the 7th position (index 6)
        pizzaToppings.add(6, "Bacon");

        //displaying elements
        System.out.println(pizzaToppings);

        System.out.println();  // adding space

        //Removing an element
        pizzaToppings.remove("Goat Cheese");
        // or
        pizzaToppings.remove(2);


        //Iterating pizzaToppings
        for(String str:pizzaToppings)
            System.out.println(str);




    }  // closes main method

}  // closes CollectionsPractice class
