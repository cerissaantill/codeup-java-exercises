
import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {

    public static void main(String[] args) {


// Arrays Exercise
// 2.

/*  - Create two arrays whose elements are strings, one with at least 10 adjectives,
       another with at least 10 nouns.

    - Create a method that will return a random element from an array of strings.

    - Add a main method, and inside of your main method select and random noun and
       adjective and hyphenate the combination and display the generated name to the user.
*/


    String[] adjectives = new String[10];
        adjectives[0] = "happy";
        adjectives[1] = "excited";
        adjectives[2] = "bright";
        adjectives[3] = "gloomy";
        adjectives[4] = "local";
        adjectives[5] = "open-minded";
        adjectives[6] = "honest";
        adjectives[7] = "creative";
        adjectives[8] = "elegant";
        adjectives[9] = "independent";



    String[] nouns = new String[10];
           nouns[0] = "cluster";
           nouns[1] = "duck";
           nouns[2] = "satellite";
           nouns[3] = "unicorn";
           nouns[4] = "waffle";
           nouns[5] = "sprite";
           nouns[6] = "hammock";
           nouns[7] = "beach";
           nouns[8] = "laser";
           nouns[9] = "crock";


    int randomAdj = (int) (Math.random() + adjectives.length+-1);
    int random = (int) (Math.random() + nouns.length+-1);

        System.out.println();

    System.out.println("Your Randomly Generated Server Name: \n" + adjectives[randomAdj] + "-" + nouns[random] + ".");









    }
    // closes main method


}
// closes ServerNameGenerator class