package util;

import java.util.Scanner;


// create a class named Input that has a private property named Scanner.
public class Input {
    private Scanner scanner;


    public Input() {
        this.scanner = new Scanner(System.in);
    }



    // create String getString() method that return command line  user input

    public String getString() {
        return scanner.nextLine();
    }




    // boolean yesNo() method that returns command line user input

    public boolean yesNo() {
        String result = scanner.nextLine();
        return result.equalsIgnoreCase("y") || result.equalsIgnoreCase("yes");
    }




    // int getInt() method ...

    public int getInt() {
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        }
        scanner.next();
        return getInt();
    }




    // int getInt(int min, int max) method...

    int getInt(int min, int max) {

        int userInt = getInt();
        if (userInt >= min && userInt <= max) {
            return userInt;
        }
        scanner.nextInt();
        return getInt(min, max);
    }



    public double getDouble() {
        if (scanner.hasNextDouble()) {
            return scanner.nextDouble();
        }
        scanner.next();
        return getDouble();
    }



    double getDouble(double min, double max) {
        double userDouble = getDouble();
        if (userDouble >= min && userDouble <= max) {
            return userDouble;
        }
        scanner.next();
        return getDouble(min, max);
    }





    public static void main(String[] args) {
        Input in = new Input();
        System.out.println("Enter yes or no [y/n");
        System.out.println(in.yesNo());

        System.out.println(in.getInt(2, 4));
    }


}
// Input class at the top