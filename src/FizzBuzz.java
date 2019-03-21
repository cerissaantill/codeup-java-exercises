
// --- FIZZBUZZ pushup in Java ----------- //

public class FizzBuzz {
    public static void main(String[] args) {

        System.out.format("FizzBuzz Exercise.%nPrint numbers 1-100.%nIf the number is divisible by 3 print Fizz.%nIf the number is divisible by 5 print Buzz.%nIf the number is divisible by 3 and 5 print FizzBuzz.%nIf the number doesn't comply with any of these categories print the number:%n");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
             else if (i % 3 == 0)
                System.out.println("Fizz");
             else if (i % 5 == 0)
                System.out.println("Buzz");
             else
                System.out.println(i);

        }
    }
}

// curly braces are optional throughout the if/else statements.





// --- walk-through [daniel's version] ----------- //

//public class FizzBuzz {
//    public static void main(String[] args) {
//        int top = 60;
//        int i = 1;
//        while (i < top) {
//            String message = "";
//            if (i % 3 == 0) {
//                message += "Fizz";
//            }
//            if (i % 5 == 0) {
//                message += "Buzz";
//            }
//            if (i % 3 != 0 && i % 5 != 0){
//                 message += i;
//            }
//            System.out.println(message);
//            i++;
//    }
//}
















