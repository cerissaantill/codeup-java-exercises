import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {


  /*      2. Create a class named Bob with a main method for the following exercise.

                Bob is a lackadaisical teenager.In conversation, his responses are very limited.

        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
        He answers 'Whoa, chill out!' if you yell at him.(the input ends with an exclamation mark)
        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
        He answers 'Whatever.' to anything else.
        Write the Java code necessary so that a user of your command line application can have a conversation with Bob.
*/


    // ---- my work ----------------

/*     adding space on console
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
        }*/



    // --- WALK-THROUGH w/ a While Loop--------------


        Scanner scan = new Scanner(System.in)   ;
        boolean bobIsStillTalking = true;

        do {
            System.out.println("\nAsk Bob a question: ");
            String userInput = scan.nextLine();

            if (userInput.isEmpty()) {
                System.out.println("\nBob: 'Fine. Be that way!'\n");
            } else if (userInput.endsWith("?")) {
                System.out.println("\nBob: 'Sure.'\n");
            } else if (userInput.endsWith("!")) {
                System.out.println("\nBob: 'Whoa, chill out!'\n");
            } else if (userInput.equals("bye")) {
                System.out.println("\nBob: 'Later.'\n");
                bobIsStillTalking = false;
            } else {
                System.out.println("Bob: 'Whatever.'");
            }


        } while (bobIsStillTalking);
        System.out.println("Bob walks away...");



    }
}

