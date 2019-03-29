package shapes;

public class Square extends Quadrilateral {


    public double getPerimeter() {
        return 2*length + 2*width;
    }


    public double getArea() {
        return length*width;
    }


    public Square(double side) {
        super(side,side);
    }








// --- OLD-  all code below is from the previous exercise before refactoring: ----


//  Inheritance and Polymorphism Exercise:

// 1.  Create a class named Square, also inside of shapes, that extends Rectangle.
//      Square should define a constructor that accepts one argument, side, and
//      calls the parent's constructor to set both the length and width to
//      the value of side.


/*
    protected double side;


    public Square(int side) {
        super(side, side);    // super constructor
        this.side = side;
    }



    public double getArea() {
        double area = (side * 2);
        return area;
    }



    public double getPerimeter() {
        double perimeter = (side * 4);
        return perimeter;
    }

*/


}  // closes Square class















