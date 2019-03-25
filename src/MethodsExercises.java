import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class MethodsExercises {

    public static void main(String[] args) {

        System.out.print(addition(7, 5));
        System.out.println();
        System.out.print(subtraction(10, 5));
        System.out.println();
        System.out.print(multiplication(6, 6));
        System.out.println();
        System.out.print(division(81, 9));
        System.out.println();
        System.out.print(modulus(100, 3));
        System.out.println();


        System.out.println();
//        System.out.print(getInteger(1,10));
        System.out.println();
        System.out.print(factorial(1,10));
        System.out.println();




    }
    // end of main



// 1. Basic Arithmetic Methods:

//////  Addition: //////////////////////////////////////////////////////
  // integers:
    public static int addition(int numberA, int numberB) {
        return numberA + numberB;
    }


//////  Subtraction: //////////////////////////////////////////////////
  // integers:
    public static int subtraction(int numberA, int numberB) {
        return numberA - numberB;
    }


//////  Multiplication: ///////////////////////////////////////////////
  // integers:
    public static int multiplication(int numberA, int numberB) {
        return numberA * numberB;
    }


//////  Division: //////////////////////////////////////////////////////
  // integers:
    public static int division(int numberA, int numberB) {
        return numberA / numberB;
    }


//////  Modulus: ///////////////////////////////////////////////////////
  // integers:
    public static int modulus(int numberA, int numberB) {
        return numberA % numberB;
    }



//////  BONUS: Multiply without the * operator: ///////////////////////////
// hint: use a loop








// 2. Method that validates user inputs are in a certain range:  ///////////////

    public static int getInteger(int min, int max) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.format("\nEnter a number between %d - %d: %n", min, max);
        int userInteger = scan.nextInt();
        if (userInteger >= min && userInteger <= max) {
            return userInteger;
        } else {
            System.out.format("\nThat number was not between %d - %d:\n", min, max);
            return getInteger(min, max);
        }
    }


// 3. Calculate the factorial of a number:  /////////////////////////////////////

    public static long factorial(int numberA, int numberB) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.format("\nEnter a number between 1 - 10 to get its factorial: \n");
        long factorialNumber = scan.nextInt();
        long factorial = 1;
        System.out.print(factorialNumber + "! = ");
        for (int i = 1; i <= factorialNumber; i++) {
            factorial *= i;
            if (i < factorialNumber) {
                System.out.print(i + " x ");
            } else {
                System.out.println(i + " ");
            }
        }
        System.out.print("= ");
        return factorial;
    }


// 4. Create an application that simulates dice rolling:  ////////////////////////////


    // carlo's pod's answer
    public static void diceRoll(long numberOfSides) {
        long min =1;
        long roll1 = (long)(Math.random() * numberOfSides) + min;
        long roll2 = (long)(Math.random() * numberOfSides) + min;
        System.out.printf("You rolled %d and %d", roll1, roll2);

    }


// 5. Game Development 101  //////////////////////////////////////////////////////////

//    public class HighLow {
//        public static void main(String[] args) {
//
//            public static Random random = new Random();            // random # generator
//            public static Scanner scan = new Scanner(System.in);  // using scanner to get input from user
//
//
//            public static int getRandInt ( int min, int max){
//                return random.nextInt(max) + min;
//            }






//        } // main
//
//    }  // HighLow class
//
//





}
// end of MethodsExercises class






// Methods Exercise =====================================================

/*
1. Basic Arithmetic

    a. Create four separate methods. Each will perform an arithmetic operation:

       - Addition
       - Subtraction
       - Multiplication
       - Division

    b. Each function needs to take two parameters/arguments so that the operation can be performed.
    c. Test your functions and verify the output.
    d. Add a modulus function that finds the modulus of two numbers.

       Food for thought: What happens if we try to divide by zero? What should happen?


           Bonus

    a. Create your multiplication method without the * operator (Hint: a loop might be helpful).
    b. Do the above with recursion.

2. Create a method that validates that user input is in a certain range
    The method signature should look like this:

        public static int getInteger(int min, int max);

    and is used like this:

        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);


    If the input is invalid, prompt the user again.
    Hint: recursion might be helpful here!


3. Calculate the factorial of a number.

        - Prompt the user to enter an integer from 1 to 10.
        - Display the factorial of the number entered by the user.
        - Ask if the user wants to continue.
        - Use a for loop to calculate the factorial.
        - Assume that the user will enter an integer, but verify it’s between 1 and 10.
        - Use the long type to store the factorial.
        - Continue only if the user agrees to.
        - A factorial is a number multiplied by each of the numbers before it.
        - Factorials are denoted by the exclamation point (n!).
            Ex:
                1! = 1               = 1
                2! = 1 x 2           = 2
                3! = 1 x 2 x 3       = 6
                4! = 1 x 2 x 3 x 4   = 24

        Bonus

        Test the application and find the integer for the highest factorial that can be accurately calculated by this application, then modify the prompt so that it prompts the user for a number "from 1 to {the highest integer that returns accurate factorial calculation}". Don’t forget to change your verification too!
        Use Recursion to implement the factorial.


4. Create an application that simulates dice rolling.

        - Ask the user to enter the number of sides for a pair of dice.
        - Prompt the user to roll the dice.
        - "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
        - Use static methods to implement the method(s) that generate the random numbers.
        - Use the .random method of the java.lang.Math class to generate random numbers.


5. Game Development 101

        Welcome to the world of game development!

        You are going to build a high-low guessing game. Create a class named HighLow inside of src.

        The specs for the game are:

        - Game picks a random number between 1 and 100.
        - Prompts user to guess the number
        - All user inputs are validated
        - If user's guess is less than the number, it outputs "HIGHER"
        - If user's guess is more than the number, it outputs "LOWER"
        - If a user guesses the number, the game should declare "GOOD GUESS!"

        Hints
        - Use the random method of the java.lang.Math class to generate a random number.

        Bonus
       -  Keep track of how many guesses a user makes
       -  Set an upper limit on the number of guesses
*/
