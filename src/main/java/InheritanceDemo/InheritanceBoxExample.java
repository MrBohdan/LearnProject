package InheritanceDemo;

/**
 * Inheritance is used to create hierarchies of the classes. Superclass define
 * common characteristic for all subclasses, this reduces duplication of the So,
 * each subclass gets characteristics of the superclass and will add its own
 * unique characteristics.
 *
 * @author Bohdan Skrypnyk
 */
// create superclass
class Box {

    private double width;
    private double height;
    private double depth;

    // clone of the object
    Box(Box obj) {
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    // constructor for all var
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // constructor with no var
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // constructor to create cube
    Box(double len) {
        width = height = depth = len;
    }

    //return volume
    double volume() {
        return width * height * depth;
    }
}

// create subclass by extending super class 
class BoxWeight extends Box {

    double weight;

    // create clone og the object
    public BoxWeight(BoxWeight obj) {

        // The keyword 'super' used to refer to the constructor of a superclass
        super(obj);
        weight = obj.weight;
    }

    // constructor for all variables
    public BoxWeight(double w, double h, double d, double m) {

        // The keyword 'super' used to refer to the constructor of a superclass
        super(w, h, d);
        weight = m;
    }

    public BoxWeight() {

        // The keyword 'super' used to refer to the constructor of a superclass
        super();
        weight = -1;
    }

    // constructor to create cube 
    public BoxWeight(double len, double m) {

        // The keyword 'super' used to refer to the constructor of a superclass
        super(len);
        weight = m;
    }
}

// create subclass by extending super class 
class BoxColor extends Box {

    String color;

    public BoxColor(double w, double h, double d, String c) {

        // The keyword 'super' used to refer to the constructor of a superclass
        super(w, h, d);
        color = c;
    }
}

// create a subclass of the subclass which extends the superclass
// number of the subclasses are unlimited
class Shipping extends BoxWeight {

    double cost; // cost of shipping 

    // clone of the object
    Shipping(Shipping obj) {

        // The keyword 'super' used to refer to the constructor of a superclass
        super(obj);
    }

    //defult constructor (if values not passed)
    public Shipping() {

        // The keyword 'super' used to refer to the constructor of a superclass
        super();
        this.cost = - 1;
    }

    //constructor for all var
    public Shipping(double cost, double w, double h, double d, double m) {

        // The keyword 'super' used to refer to the constructor of a superclass
        super(w, h, d, m);
        this.cost = cost;
    }

    //constructor just for cost
    public Shipping(double cost) {
        this.cost = cost;
    }

    //constructor to create cube
    public Shipping(double cost, double len, double m) {

        // The keyword 'super' used to refer to the constructor of a superclass
        super(len, m);
        this.cost = cost;
    }

}

public class InheritanceBoxExample {

    public static void main(String args[]) {

        // initialize objects 'BoxWeight'
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight mycube = new BoxWeight(3, 2);
        BoxWeight myclone = new BoxWeight(mybox1);

        // initialize objects 'Shipping'
        Shipping myshipping1 = new Shipping(11, 12, 15, 25, 5.06);
        Shipping myshipping2 = new Shipping(5, 1, 10, 15, 2.77);
        Shipping myshipping3 = new Shipping(5.6, 9.7, 5.25);
        Shipping myshipping4 = new Shipping();

        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of the mybox1 :" + vol);
        System.out.println("Weight of the mybox1 :" + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Volume of the mybox2 :" + vol);
        System.out.println("Weight of the mybox2 :" + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("Volume of the mybox3 :" + vol);
        System.out.println("Weight of the mybox3 :" + mybox3.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println("Volume of the myclone :" + vol);
        System.out.println("Weight of the myclone :" + myclone.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println("Volume of the mycube :" + vol);
        System.out.println("Weight of the mycube :" + mycube.weight);
        System.out.println();

        BoxColor mycolor = new BoxColor(12, 15, 20, "red");
        System.out.println("Color of the mycolor :" + mycolor.color);
        System.out.println();

        vol = myshipping1.volume();
        System.out.println("Volume of the shipping1 :" + vol);
        System.out.println("Weight of the shipping1 :" + myshipping1.weight);
        System.out.println("Cost of the shipping1 :" + myshipping1.cost);
        System.out.println();

        vol = myshipping2.volume();
        System.out.println("Volume of the shipping2 :" + vol);
        System.out.println("Weight of the shipping2 :" + myshipping2.weight);
        System.out.println("Cost of the shipping2 :" + myshipping2.cost);
        System.out.println();

        vol = myshipping3.volume();
        System.out.println("Volume of the shipping3 :" + vol);
        System.out.println("Weight of the shipping3 :" + myshipping3.weight);
        System.out.println("Cost of the shipping3 :" + myshipping3.cost);
        System.out.println();

        vol = myshipping4.volume();
        System.out.println("Volume of the shipping4 :" + vol);
        System.out.println("Weight of the shipping4 :" + myshipping4.weight);
        System.out.println("Cost of the shipping4 :" + myshipping4.cost);
        System.out.println();
    }
}
