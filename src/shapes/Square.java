package shapes;
import java.lang.Math;

public class Square extends Rectangle {

//  Inheritance and Polymorphism Exercise:

// 1.  Create a class named Square, also inside of shapes, that extends Rectangle.
//      Square should define a constructor that accepts one argument, side, and
//      calls the parent's constructor to set both the length and width to
//      the value of side.

        private int side;

        public Square(int side) {
            super(side, side);
            this.side = side;
        }



        public int getArea() {
            int area = (side * 2);
            return area;
        }



        public int getPerimeter() {
            int perimeter = (side * 4);
            return perimeter;
        }


}  // closes Square class
















