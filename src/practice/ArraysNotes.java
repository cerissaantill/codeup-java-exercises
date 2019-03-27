package practice;
import java.util.Arrays;

public class ArraysNotes {
    public static void main(String[] args) {


        String[] months = {
                "Enero",
                "Febrero",
                "Marzo",
                "Abril",
                "Mayo",
                "Junio",
                "Julio",
                "Augusto",
                "Septiembre",
                "Octubre",
                "Noviembre",
                "Deciembre"
        };


//        // iterating with a For loop
//        System.out.println(months);
//        for (int i = 0; i < months.length; i++) {
//            System.out.println(months[i]);
//        }
//
//
//        // iterating with an Enhanced For loop ... is similar to a forEach in JS
//        for (String month : months) {
//            System.out.println(month);
//        }



        // adding spacing
        System.out.println();

  ////////////////////////////////////////////////////////////

//
//        for (boolean decision : decisions) {
//            System.out.println(decision);
//        }


 /////////////////////////////////////////////////////////////


//        int[] phoneNumber = new int[5];
//        int[] phoneNumber2;
//
//
//
//        Arrays.fill(phoneNumber, 4);
//        for (int digit : phoneNumber) {
//            System.out.println(digit);
//        }
//
//
//
//        // adding spacing
//        System.out.println();
//
//
//
//        phoneNumber2 = Arrays.copyOf(phoneNumber, 6);
//        for (int digit : phoneNumber2) {
//            System.out.println(digit);
//        }
//
//
//        // adding spacing
//        System.out.println();
//
//
//        Arrays.fill(phoneNumber, 7);
//
//        System.out.println(Arrays.toString(phoneNumber2));
//        if (phoneNumber.equals(phoneNumber2)) {
//            System.out.println("They are equal");
//        } else {
//            System.out.println("They are different");
//        }



/////////////////////////////////////////////////////////////////

        /*

    Arrays
        .fill
        .sort
        .toString
        .copyOf

        */


        // adding spacing
        System.out.println();

////////////////////////////////////////////////////////////////

// Create an array of strings that contain 4 - 15 items:


        System.out.println("The Spurs starting 5 are: ");

        // adding spacing
        System.out.println();

       String[] players = {
               "Derek White",
               "Rudy Gay",
               "LaMarcus Aldridge",
               "Jakob Poertl",
               "DeMar Derozan"
       };



        for (String player : players) {
            System.out.println(player);
        }


        // adding spacing
        System.out.println();


        System.out.println(Arrays.toString(players));
        Arrays.sort(players);


        // adding spacing
        System.out.println();


        System.out.print(Arrays.copyOf(players, 3));


        // adding spacing
        System.out.println();




////////////////////////////////////////////////////////////////

// Multi-Dimensional Arrays :


        // chessboard example:

        String[][] java2Array = new String[3][3];
        java2Array[2][1] = "String Value";

        char[][] chessBoard = {
                {'R','N','B','Q','K','B','N','R'},
                {'P','P','P','P','P','P','P','P',},
                {'\0','\0','\0','\0','\0','\0','\0','\0',},
                {'\0','\0','\0','\0','\0','\0','\0','\0',},
                {'\0','\0','\0','\0','\0','\0','\0','\0',},
                {'\0','\0','\0','\0','\0','\0','\0','\0',},
                {'p','p','p','p','p','p','p','p',},
                {'r','n','b','q','k','b','n','r'}
        };






    }
    // closes main

}
// closes ArrayNotes class