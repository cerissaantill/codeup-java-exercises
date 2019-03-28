package shapes;

import java.lang.Math;

//  Inheritance & Polymorphism Exercise:
//  1.  Inside of your shapes directory, create a class named Rectangle.
//      It should have protected properties for both length and width.
//      Rectangle should define a constructor that accepts two numbers
//      for length and width, and sets those properties.
//
//      Create two methods on the Rectangle class, getArea and getPerimeter
//       that return the respective values.



public class Rectangle {


    protected int length;
    protected int width;


    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }


    public void setLength(int length) {
        this.length = length;
    }


    public void setWidth(int width) {
        this.width = width;
    }



    public int getPerimeter() {
        int perimeter = (2*length) + (2*width);
        return perimeter;
    }


    public int getArea() {
        int area = length * width;
        return area;
    }




    public void getInfo() {
        if (length == width) {
            System.out.println("The perimeter of a square with side length of " + length + " is: " + getPerimeter());
            System.out.println("The area of a rectangle with a length of " + length + " is " + getArea());


        }
    }



}  // closes Rectangle class
