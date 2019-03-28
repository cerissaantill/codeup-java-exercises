package shapes;

import java.lang.Math;

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
