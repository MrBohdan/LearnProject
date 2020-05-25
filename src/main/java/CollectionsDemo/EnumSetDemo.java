package CollectionsDemo;

import java.util.EnumSet;

/**
 * Enum - a special type of class, with constant/final variables. There is no
 * way to create a new instance of enum class by using "new". Enum class cannot
 * be a superclass and cannot inherit from other classes, but it working the
 * same as usual class, so there can be initialized constructors, methods, and
 * so on.
 *
 * Class 'EnumSet' extends class 'AbstractSet' and implement an interface 'Set',
 * is used as special implementation for enumeration type.
 *
 * @author Bohdan Skrypnyk
 */
enum Apple {
    Gala, GrannySmith, Honeycrisp, GoldenDelicious, Braeburn
}

public class EnumSetDemo {

    public static void main(String args[]) {

        // initialization of the 'EnumSet' with the type 'Apple'
        EnumSet<Apple> set1, set2, set3, set4;

        // assign values to 'set1'
        set1 = EnumSet.of(Apple.Braeburn, Apple.Gala, Apple.GoldenDelicious, Apple.GrannySmith);

        // A method 'complementOf()' will return enum which was not
        // included in  the given set but defined in the enum class.
        set2 = EnumSet.complementOf(set1);

        // A method 'allOf()' return all defined values in the enum class.
        set3 = EnumSet.allOf(Apple.class);

        // A method 'range()' return values between the given range.
        set4 = EnumSet.range(Apple.Gala, Apple.GrannySmith);

        System.out.println("Set 1 EnumSet.of() : " + set1);
        System.out.println("Set 2 EnumSet.complementOf(set1) : " + set2);
        System.out.println("Set 3 EnumSet.allOf(Apple.class) : " + set3);
        System.out.println("Set 4 EnumSet.range(Apple.Gala, Apple.GrannySmith): " + set4);
    }
}
