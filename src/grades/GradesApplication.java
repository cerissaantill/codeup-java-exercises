package grades;
import java.util.HashMap;
import util.Input;
import java.lang.String;
import java.util.Map;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

            // import input class:
            Input input = new Input();


            Student student1 = new Student("Cerissa");
            Student student2 = new Student("Katie");
            Student student3 = new Student("Elizabeth");
            Student student4 = new Student("Honey");


            student1.addGrade(100);
            student1.addGrade(92);
            student1.addGrade(85);
            student1.addGrade(95);


            student2.addGrade(93);
            student2.addGrade(100);
            student2.addGrade(89);
            student2.addGrade(82);


            student3.addGrade(75);
            student3.addGrade(86);
            student3.addGrade(92);
            student3.addGrade(83);


            student4.addGrade(94);
            student4.addGrade(89);
            student4.addGrade(99);
            student4.addGrade(81);



            students.put(" cerissaantill", student1);
            students.put(" katietottenham", student2);
            students.put(" elizabethwalton", student3);
            students.put(" honeybadger", student4);


            ////////////////////////////////////////////////

            System.out.println("Welcome\n");
            System.out.println();
            System.out.println("Here are the github usernames of our students: \n");

            for (String key: students.keySet()) {
                System.out.print(" | " + key);
            }


        System.out.println("\n\n ** OR enter \"ALL\" to view all student grades and class average");


        do {
            System.out.println("\n\nWhich user would you like information on? \nEnter username below: ");
                System.out.println("> ");
            String userInput = input.getString();


            if (students.keySet().contains(userInput)) {

                System.out.println("\nInformation for: " + userInput + "\n");
                System.out.println("Name: " + students.get(userInput).getName() + "\nGithub username: " + userInput);
                System.out.println("Current Average: " + students.get(userInput).getAverage());
                System.out.println("All Grades: " + students.get(userInput).getGrades());

            }  else {
                System.out.println("Sorry, no student found with the github username of " + userInput);
                System.out.println("\nEnter a valid username to view information:\n");
                userInput = input.getString();
                System.out.print("> " + userInput);
            }

        } while (input.yesNo());
        System.out.println("\nWould you like to view another student?");


            System.out.println("\nGoodbye");



/////  Walkthrough While:  //////////////////

//        System.out.println("\nWould you like to view another student?");
//
//        keepGoing = userInput.yesNo();
//        System.out.println(keepGoing);
//
//    } while (keepGoing);
//            System.out.println("\nGoodbye");





    }  //  closes main method


}  //  closes GradesApplication class
