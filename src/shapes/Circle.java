package shapes;

public class Circle {

    private double radius;


    // Constructor:

    public Circle(double radius) {
        this.radius = radius;
    }


    public double getArea() {
        double area = Math.PI * (radius * radius);
        return area;
    }


    public double getCircumference() {
        return 2 * Math.PI * radius;
    }



}
// closes the Circle class