package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {


    //  protected properties for length and width:

    protected double length;
    protected double width;



    //  CONSTRUCTOR that accepts two numbers and sets those properties:

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }



    //  GETTERS:
    //  (methods for getting length and width)

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }



    //  abstract methods for getting length and width:

    abstract class length {

    }

    abstract class width {

    }

    abstract class setWidth {

    }







}  // closes Quadrilateral class





















