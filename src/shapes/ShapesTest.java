package shapes;


public class ShapesTest {

    public static void main(String[] args) {


        Measurable myShape1 = new Square(5);
        Measurable myShape2 = new Rectangle(2,3);

        System.out.println();  // spacing

        System.out.println("Shape 1");
        System.out.println("Area: " + myShape1.getArea());
        System.out.println("Perimeter: " + myShape1.getPerimeter());

        System.out.println();  // spacing

        System.out.println("Shape 2");
        System.out.println("Area: " + myShape2.getArea());
        System.out.println("Perimeter: " + myShape2.getPerimeter());





    }  // closes main method

}  // closes ShapesTest class









// --- OLD-  all code below is from the previous exercise before refactoring: ----



//  Last part of Inheritance & Polymorphism Exercise:

//  - Create a variable of the type Rectangle named box1 and assign it a
//     new instance of the Rectangle class with a width of 4 and length of 5:

        /*
        Rectangle box1= new Rectangle(4,5);

        box1.getInfo();


        System.out.println("\nThe Perimeter of box1 = " + box1.getPerimeter());
        System.out.println("\nThe Area of box1 = " + box1.getArea());


        Rectangle box2 = new Square(5);

        box2.getInfo();
        */








