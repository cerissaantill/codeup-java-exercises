package oopPractice;

public class DataTypePractice {
    public static void main(String[] args) {


    // 1. Create a byte variable and set it to any valid byte number.
        byte byteNum = (byte) 200;
        // cast because byte will default to int.

    // 2. Create a short variable and set it to any valid short number.
        short shortNum = (short) 2000;

    // 3. Create an int variable and set it to any valid int number.
        int intNum = 300000;

    // 4. Create a variable type long, and make it equal to 50000 + 10 times the sum of byte, plus the short plus the int.
        long longNum = 50000L + 10L * (byteNum + shortNum + intNum);
        // longs don't need casting.

        System.out.println("longNum total = " + longNum);




    }
}
