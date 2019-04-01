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
       return name;
    }


    // adds the given grade to the grades property
    public void addGrade(int grade) {
       grades.add(grade);
    }


    // returns the average of the student's grades
    public double getGradeAverage() {
       return gradeAverage;
    }







    // grades Getter
    public ArrayList<Integer> getGrades() {
        return grades;
    }


    // returns the average of the students grades
    public int getAverage() {
        if (grades.size() == 0) {
            return 0;
        } else {
            grades = getGrades();
            int sum = 0;
            for (int grade : grades) {
                sum += grade;
            }
            return sum / grades.size();
        }
    }






    public static void main(String[] args) {
        System.out.println();












    }  // closes main method

}  // closes Student class
