package EnumDemo;

/**
 * Enum - a special type of class, with constant/final variables. There is no
 * way to create a new instance of enum class by using "new". Enum class cannot
 * be a superclass and cannot inherit from other class
 *
 * @author Bohdan Skrypnyk
 */
enum Apple1 {
    Gala(14),
    GrannySmith(74),
    Honeycrisp(12),
    GoldenDelicious(4),
    Braeburn(12),
    RibstonPippin();

    private int price; // price for each apple 

    // the constructor receives the price of apple
    Apple1(int p) {
        this.price = p;
    }

    // the constructor set price -1, for constant with no price
    Apple1() {
        this.price = -1;
    }

    // getter return price
    int getPrice() {
        return this.price;
    }
}

public class EnumDemo1 {

    public static void main(String args[]) {

        // display price of one apple 
        System.out.println("Price of Gala apple :" + Apple1.Gala.getPrice() + " euros.\n");

        // display price of all apple varieties  
        for (Apple1 a : Apple1.values()) {
            System.out.println("Price of " + a + " apple :" + a.getPrice() + " euros.");
        }
    }
}
