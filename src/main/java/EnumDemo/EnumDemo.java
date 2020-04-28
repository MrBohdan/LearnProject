package EnumDemo;

/**
 * Enum - a special type of class, with constant/final variables. There is no
 * way to create a new instance of enum class by using "new". Enum class cannot
 * be a superclass and cannot inherit from other class
 *
 * @author Bohdan Skrypnyk
 */
// types of apples
enum Apple {
    Gala, GrannySmith, Honeycrisp, GoldenDelicious, Braeburn
}

public class EnumDemo {

    public static void main(String args[]) {
        Apple ap;

        ap = Apple.Gala;
        System.out.println("Value of ap: " + ap);

        ap = Apple.Braeburn;

        // compare two types of enum
        if (ap == Apple.Braeburn) {
            System.out.println("Variable \"ap\" contain Braeburn");
        }

        switch (ap) {
            case Gala:
                System.out.println("Gala is red");
                break;
            case GrannySmith:
                System.out.println("Granny Smith is green");
                break;
            case Honeycrisp:
                System.out.println("Honeycrisp is orange");
                break;
            case GoldenDelicious:
                System.out.println("Golden is Delicious ");
                break;
            case Braeburn:
                System.out.println("Braeburn is red");
                break;
        }

        System.out.println();

        // method 'values()' returns massive of enum constants
        for (Apple a : Apple.values()) {
            System.out.println(a);
        }

        System.out.println();

        // method 'valueOf(String str)' return enum constants of given type
        ap = Apple.valueOf("GoldenDelicious");

        System.out.println(ap);
    }
}
