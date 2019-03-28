package shapes;


public class ShapesTest {

    public static void main(String[] args) {

        Rectangle box1= new Rectangle(4,5);

        box1.getInfo();


        System.out.println("\nThe Perimeter of box1 = " + box1.getPerimeter());
        System.out.println("\nThe Area of box1 = " + box1.getArea());


        Rectangle box2 = new Square(5);

        box2.getInfo();


    }  // closes main method

}  // closes ShapesTest class




//  Last part of Inheritance & Polymorphism Exercise:

//  - Create a variable of the type Rectangle named box1 and assign it a
//     new instance of the Rectangle class with a width of 4 and length of 5:
