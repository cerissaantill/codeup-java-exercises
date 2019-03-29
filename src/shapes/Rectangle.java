package shapes;

public class Rectangle extends Quadrilateral implements Measurable {


    // Command N automatically creates skeleton of all methods
    //  that need to be implemented.

    double length() {
        return 0;
    }


    double width() {
        return 0;
    }


    double getPerimeter() {
        return 0;
    }


    double getArea() {
        return 0;
    }








// --- OLD-  all code below is from the previous exercise before refactoring: ----


/* //  Inheritance & Polymorphism Exercise:

//  1. The rectangle class should have protected properties for both length and width.
//      Rectangle should define a constructor that accepts two numbers
//      for length and width, and sets those properties.

//      Create two methods on the Rectangle class, getArea and getPerimeter
//       that return the respective values.




    protected double length;
    protected double width;


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    public double getPerimeter() {
        double perimeter = (2*length) + (2*width);
        return perimeter;
    }


    public double getArea() {
        double area = length * width;
        return area;
    }




        public void getInfo () {
            if (length == width) {
                System.out.println("\nThe Perimeter of a Square with side length of " + length + " = " + getPerimeter());
                System.out.println("The Area of a Rectangle with a length of " + length + " = " + getArea());


            }
        }

*/



}  // closes Rectangle class










