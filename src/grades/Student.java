package grades;
import java.lang.String;
import java.util.ArrayList;
import java.lang.Integer;


public class Student {


// private properties for name and grades
    private String name;
    private ArrayList<Integer>grades = new ArrayList<>();  //grades property should be a li of ints



// Constructor:
   public Student(String name) {
        this.name = name;           // translates to "this object"
        this.grades = grades;
    }


    // returns the student's name
    public String getName() {
       return this.name;
    }



    // adds the given grade to the grades property
    public void addGrade(int grade) {
       grades.add(grade);
    }




// //    returns the average of the student's grades
//    public double getGradeAverage() {
//       double total = 0;
//       for (int i = 0; i<this.grades.size(); i++) {
//           total += grade;
//       }
//    }


//
//    // grades Getter
//    public ArrayList<Integer> getGrades() {
//        return grades;
//    }



    // returns the average of the students grades
    public int getAverage() {
        if (grades.size() == 0) {
            return 0;
        } else {
//            grades = getGrades();
            int sum = 0;
            for (int grade : grades) {
                sum += grade;
            }
            return sum / this.grades.size();
        }
    }



// MAIN method:
    public static void main(String[] args) {

    // create Student objects, add grades to each,
    //  make sure getGradeAverage method correctly returns student's avg

        Student student1 = new Student("Cerissa");
            student1.addGrade(100);
            student1.addGrade(92);
            student1.addGrade(85);
            student1.addGrade(95);

        System.out.println("Name: " + student1.getName() + "\n"
                + "Average: " + student1.getAverage()  + "\n"
                + "All Grades: " + student1.grades + "\n"
                +  "------------------------------------");



        Student student2 = new Student("Katie");
            student2.addGrade(93);
            student2.addGrade(100);
            student2.addGrade(89);
            student2.addGrade(82);

        System.out.println("Name: " + student2.getName() + "\n"
                + "Average: " + student2.getAverage()  + "\n"
                + "All Grades: " + student2.grades + "\n"
                +  "------------------------------------");



        Student student3 = new Student("Elizabeth");
            student3.addGrade(75);
            student3.addGrade(86);
            student3.addGrade(92);
            student3.addGrade(83);

        System.out.println("Name: " + student3.getName() + "\n"
                + "Average: " + student3.getAverage()  + "\n"
                + "All Grades: " + student3.grades + "\n"
                +  "------------------------------------");



        Student student4 = new Student("Honey");
            student4.addGrade(94);
            student4.addGrade(89);
            student4.addGrade(99);
            student4.addGrade(81);

        System.out.println("Name: " + student4.getName() + "\n"
                + "Average: " + student4.getAverage()  + "\n"
                + "All Grades: " + student4.grades + "\n"
                +  "------------------------------------");




    }  // closes main method

}  // closes Student class
