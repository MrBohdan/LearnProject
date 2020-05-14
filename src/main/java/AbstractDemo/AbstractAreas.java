package AbstractDemo;

/**
 * The keyword 'abstract' is a non-access modifier. Abstract class working in a
 * similar way as the superclass, so the subclass should implement all methods
 * from abstract class or be abstract. Any class which has more than one
 * abstract method must be initialized as abstract. Abstract classes cannot be
 * used to create objects, so the instance of the not be received by using the
 * keyword 'new'. Abstract methods cannot be static and constructors cannot be
 * abstract. The difference with the interface, that abstract classes can have
 * abstract and regular methods together. Moreover, in the abstract can be
 * declared variables, in the interface they should be final.
 *
 * @author Bohdan Skrypnyk
 */
// create an abstract class 
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
        // Abstract classes cannot be used to create objects, 
        // so the instance of the not be received by using the keyword 'new'.
        //Figure figure = new Figure (12,2);

        // an abstract class can be accessed through the subclasses
        Rectangle rectangle = new Rectangle(9, 8);
        Triangle triangle = new Triangle(10, 5);
        Figure figure; // or via class reference 

        figure = rectangle;
        System.out.println("Area equal = " + figure.area() + "\n");

        figure = triangle;
        System.out.println("Area equal = " + figure.area());
    }
}
