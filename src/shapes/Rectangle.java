package shapes;

import java.lang.Math;


public class Rectangle {


    protected double length;
    protected double width;


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


//    public void setLength(int length) {
//        this.length = length;
//    }
//
//
//    public void setWidth(int width) {
//        this.width = width;
//    }



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



}  // closes Rectangle class


//  Inheritance & Polymorphism Exercise:

//  1. The rectangle class should have protected properties for both length and width.
//      Rectangle should define a constructor that accepts two numbers
//      for length and width, and sets those properties.
//
//      Create two methods on the Rectangle class, getArea and getPerimeter
//       that return the respective values.






