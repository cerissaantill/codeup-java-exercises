//import java.sql.SQLOutput;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        System.out.print("Console Exercises");

/*
 1.   Write some java code that uses the variable pi to output the following:
      The value of pi is approximately 3.14.

*/
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f.", pi);



/* Explore the Scanner Class:

 1. Prompt a user to enter a integer and store that value in an int variable using the nextInt method.

 */
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter an integer: \n");
        int userInteger = scanner.nextInt();
        System.out.println("You entered: --> \"" + userInteger + "\" <--");



// 2. Prompt a user to enter 3 words and store each of them in a separate variable, then display them back, each on a newline.
        System.out.println("Enter three words: ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        scanner.nextLine();
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);




/*
    3. Prompt a user to enter a sentence, then store that sentence in a String variable using
      the .next method, then display that sentence back to the user.

*/
        System.out.println("\nEnter a Sentence: \n");
        String userSentence = scanner.nextLine();
        System.out.format("Your sentence is %s", userSentence);
        System.out.println();

/*
        A better way to fix the skipping problem: Quick two steps to avoid the scanner object “skipping” inputs
           1. `new Scanner(System.in).useDelimiter("\n")`
           2.  use `.next()` instead of .nextLine for your text inputs

*/


/*
 4. Rewrite the above example using the .nextLine method.

*/


/*
 Calculate the perimeter and area of Codeup's classrooms:

 1. Prompt the user to enter values of length and width of a classroom at Codeup.
     Use the .nextLine method to get user input and cast the resulting string to a numeric type.

      Assume that the rooms are perfect rectangles.
      Assume that the user will enter valid numeric data for length and width.

*/



/*
 2. Display the area and perimeter of that classroom.
     The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle
     is equal to 2 times the length plus 2 times the width.

*/

/*
 3. Bonus:
  - Accept decimal entries
  - Calculate the volume of the rooms in addition to the area and perimeter

*/

        System.out.println("\nWe are going to calculate the perimeter, area, and volume of the classroom.\n");
        System.out.println("\nEnter the length in feet\n");
        float length = scanner.nextFloat();
    // double instead of float?

        System.out.println("\nEnter The width in feet\n");
        float width = scanner.nextFloat();


        System.out.println("\nEnter The height in feet\n");
        float height = scanner.nextFloat();


        float perimeter = (length*2) + (width*2);
        float area = length * width;
        float volume = length * width * height;
        System.out.format("You entered the number: %d.\nYou entered the words: %s, %s,  %s. \nYour sentence was: %s \n", userInteger, word1, word2, word3, userSentence);


        System.out.format("\nThe perimeter of the room is %.2f feet.\nThe area of the room is %.2f square feet.\nThe volume of the room is %.2f cubed feet.\n", perimeter, area, volume);


    }
}


