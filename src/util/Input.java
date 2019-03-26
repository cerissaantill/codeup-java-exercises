package util;

import java.util.Scanner;


// create a class named Input that has a private property named Scanner.

public class Input {
    private Scanner scanner;

    public Input(Scanner scanner) {
        this.scanner = scanner;
    }

    // create String getString() method that return command line  user input
    public String getString() {
        return scanner.nextLine();
    }

    // create boolean yesNo() method that returns command line user input
    public boolean yesNo() {
        String userInput = getString();
        return (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("n"));
    }

    // create int getInt(int min, int max) method ...
    public int getInt(int min, int max) {
        return
    }

    // create int getInt() method ...
    public int getInt() {

    }

    // create double getDouble(double min, double max) method ...
    public double getDouble(double min, double max) {

    }

    // create double getDouble() method ...
    public double getDouble() {

    }










}
// Input class at the top