import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {


    // adding spacing between exercises
        System.out.println();


        System.out.print("Enter a question to ask about Bob: \n");
        for (int i=0; i<=5; i++) {
            Scanner scan = new Scanner(System.in).useDelimiter("\n");
            String userInput = scan.nextLine();
            if(i<5) {
                if (userInput.endsWith("?")) {
                    System.out.println("Sure?\n");
                } else if (userInput.endsWith("!")) {
                    System.out.println("Whoa, chill out!\n");
                } else if (userInput.equals("")) {
                    System.out.println("Fine. Be that way!\n");
                } else {
                    System.out.println("Whatever.\n");
                }
            } else if (i>=5) {
                System.out.println("Goodbye.\n");
            }

        }



    }
}

