package AbstractDemo;

/**
 * Abstract class working in the same way as the superclass, so the subclass
 * should implement all methods from abstract class or be abstract. Any class
 * which has more than one abstract method must be initialized as abstract.
 * Abstract classes cannot have any objects, so the instance of the abstract
 * class cannot be received by using the keyword 'new'. Abstract methods cannot
 * be static and constructors cannot be abstract.
 *
 * @author Bohdan Skrypnyk
 */
abstract class Figure {

    double dim1;
    double dim2;

    Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract double area();
}

class Rectangle extends Figure {

    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    double area() {
        System.out.println("Area of Rectangle");
        return dim1 + dim2;
    }

}

class Triangle extends Figure {

    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    double area() {
        System.out.println("Area of Triangle");
        return dim1 + dim2 / 2;
    }

}

public class AbstractAreas {

    public static void main(String args[]) {
        //Figure figure = new Figure (12,2); // constructors from abstract classes cannot be called 
        Rectangle rectangle = new Rectangle(9, 8);
        Triangle triangle = new Triangle(10, 5);
        Figure figure; //  but we still can call abstract class via reference

        figure = rectangle;
        System.out.println("Area equal = " + figure.area() + "\n");

        figure = triangle;
        System.out.println("Area equal = " + figure.area());
    }
}
