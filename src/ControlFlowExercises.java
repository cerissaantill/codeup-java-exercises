import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {


/*
  1. Looping Basics-----------------------------------------------------------
    a. While
       - Create an integer variable i with a value of 5.
       - Create a while loop that runs so long as i is less than or equal to 15
       - Each loop iteration, output the current value of i, then increment i by one.
            Your output should look like this:
             5 6 7 8 9 10 11 12 13 14 15

*/

        System.out.println("Incrementing from 5 to 15 using a while loop:");

        int i = 5;
        while(i<=15){
            System.out.println(i);
            i++;
        }

/*
    b. Do While

        - Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
        - Alter your loop to count backwards by 5's from 100 to -10.
        - Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
            2
            4
            16
            256
            65536
            For

*/


// adding spacing between exercises
        System.out.println();



        System.out.println("Counting by 2's from 0 to 100 using a do while loop:");
        int number = 0;
        do {
            System.out.println(number);
            number += 2;
        } while (number <= 100);



// adding spacing between exercises
        System.out.println();



        System.out.println("Counting backwards from 100 to -10 by 5's using do while loop:");
        int countBackwards = 100;
        do {
            System.out.println(countBackwards);
            countBackwards -=5;
        } while (countBackwards >= -10);



// adding spacing between exercises
        System.out.println();



        System.out.println("Starting at 2 and squaring the number up to 1,000,000 using a do while loop:");
        long squaring = 2;
        do{
            System.out.println(squaring);
            squaring *= squaring;
        } while(squaring <= 1000000);




/*
  refactor the previous two exercises to use a for loop instead

*/


// adding spacing between exercises
        System.out.println();


        System.out.println("Refactoring the previous loops to use a for loop");



        System.out.println("Incrementing from 5 to 15 using a for loop:");
        for(int n = 5; n<=15; n++) {
            System.out.println(n);
        }




// adding spacing between exercises
        System.out.println();



        System.out.println("Counting by 2's from 0 to 100 using a for loop:");
        for(int x = 0; x <=100; x+=2){
            System.out.println(x);
        }


// adding spacing between exercises
        System.out.println();



        System.out.println("Counting backwards from 100 to -10 by 5's using a for loop:");
        for (int b = 100; b>=-10; b-=5) {
            System.out.println(b);
        }


// adding spacing between exercises
        System.out.println();



        System.out.println("Starting at 2 and squaring the number up to 1,000,000 using a for loop:");
        for(long squaringFor = 2; squaringFor<=1000000; squaringFor*=squaringFor){
            System.out.println(squaringFor);
        }


// adding spacing between exercises
        System.out.println();





/*  2. FIZZBUZZ ------------------------------------------------------------------
      One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to test basic looping and conditional logic skills.

      - Write a program that prints the numbers from 1 to 100.
      - For multiples of three print “Fizz” instead of the number
      - For the multiples of five print “Buzz”.
      - For numbers which are multiples of both three and five print “FizzBuzz”.

      */

        System.out.format("FizzBuzz Exercise.%nPrint numbers 1-100.%nIf the number is divisible by 3 print Fizz.%nIf the number is divisible by 5 print Buzz.%nIf the number is divisible by 3 and 5 print FizzBuzz.%nIf the number doesn't comply with any of these categories print the number:%n");
        for (int num=1; num<=100; num++) {
            if (num%3 == 0 && num%5 == 0) {
                System.out.println("FizzBuzz");
            } else if (num%3 == 0) {
                System.out.println("Fizz");
            } else if (num%5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(num);
            }
        }



// adding spacing between exercises
        System.out.println();




/*  3. display a Table of Powers ----------------------------------------------------------
        - Prompt the user to enter an integer.
        - Display a table of squares and cubes from 1 to the value entered.
        - Ask if the user wants to continue.
        - Assume that the user will enter valid data.
        - Only continue if the user agrees to.

        */


        String userChoice;
        do {
            Scanner scan = new Scanner(System.in).useDelimiter("\n");
            System.out.format("Please enter an integer: %n");

            int userNumber = scan.nextInt();
            System.out.format("Here is your table up to %d: %n", userNumber);

//       printing the table
            System.out.format("%nnumber  | squared | cubed %n------- | ------- | -------%n");

            for (int a = 1; a <= userNumber; a++) {
                int aSquared = a * a;
                int aCubed = a * a * a;
                System.out.format(" %-7d| %-8d| %-7d%n", a, aSquared, aCubed);
            }
            System.out.println("Do you want to do another number? (yes or no)");
            userChoice = scan.next();

        } while (userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes"));





// adding spacing between exercises
        System.out.println();




/*  4.Convert Number Grades to Letter Grades -----------------------------------
        - Convert given number grades into letter grades.

        - Prompt the user for a numerical grade from 0 to 100.
        - Display the corresponding letter grade.
        - Prompt the user to continue.
        - Assume that the user will enter valid integers for the grades.
        - The application should only continue if the user agrees to.
            Grade Ranges:

            A : 100 - 88
            B : 87 - 80
            C : 79 - 67
            D : 66 - 60
            F : 59 - 0
                                                                               */

/*
        Bonus:
        - Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).

*/



        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.format("Enter a number grade (0-100), and I will convert it to a letter grade:%n");
        int userGrade = scan.nextInt();

        String letterGrade="";

        if (userGrade>88 && userGrade <=100){
            letterGrade = "A";
        } else if (userGrade < 88 && userGrade > 80) {
            letterGrade = "B";
        } else if (userGrade < 80 && userGrade > 67){
            letterGrade = "C";
        } else if (userGrade < 67 && userGrade > 60) {
            letterGrade = "D";
        } else if (userGrade < 60){
            letterGrade = "F";
        } else {
            letterGrade = "That is not a valid grade entry.";
        }

        System.out.format("Number Grade: %s. Letter Grade: %s%n", userGrade, letterGrade);


    }
}

