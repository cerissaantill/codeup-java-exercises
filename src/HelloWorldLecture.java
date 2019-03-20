import java.util.Scanner;  // allows us to get data from user entered in console

public class HelloWorldLecture {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name: ");
        String name = scanner.nextLine(); // .next() waits on input from user on command line.
                                          // .nextLine() will return a string input that has more than one word.

        System.out.print("What is your favorite number? ");
        int favoriteNumber = scanner.nextInt();
// var type    var name        statement

        System.out.format("Hello " + name + ". Your favorite number is %d.", favoriteNumber);








//        String message = "Hello";
//        String name = "Zion";
//        double amount = 72.60;
//        System.out.format("%s, %s\n", message, name);
////        System.out.println("Hello Zion!");
//        System.out.format("%s, %s. owes %s.\n", message, name, name, amount);
//


    }

}
