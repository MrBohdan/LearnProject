package AnnotationDemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * There are three types of annotations Retention SOURCE/CLASS/RUNTIME. They
 * change the life-cycle of annotations when the system is run. Class Annotation
 * is super-interface for all annotations of interface
 *
 * @author Bohdan Skrypnyk
 */
// this indicates that the purpose of this annotation is the type of data.
@Target(ElementType.TYPE_USE)
@interface TypeAnno {
}

// this indicates that the purpose of this annotation is the type of data.
@Target(ElementType.TYPE_USE)
@interface NotZeroLeng {
}

// this indicates that the purpose of this annotation is the type of data.
@Target(ElementType.TYPE_USE)
@interface Unique {
}

// this indicates that the purpose of this annotation is the type of data.
@Target(ElementType.TYPE_USE)
@interface MaxLength {

    int value();
}

// this indicates that the purpose of this annotation is type of a parameter.
@Target(ElementType.TYPE_PARAMETER)
@interface What1 {

    String description();
}

// this indicates that the purpose of this annotation is a field.
@Target(ElementType.FIELD)
@interface EmptyOK {
}

// this indicates that the purpose of this annotation is a methods.
@Target(ElementType.METHOD)
@interface Recomended {
}

public class TypeAnnoDemo<@What1(description = "") T> {

    // apply annotation to the constructor
    @Unique
    TypeAnnoDemo() {

    }

    // annotation of the type 'String', but not a field 
    // because of 'ElementType.TYPE_USE', wich take type of element.
    @TypeAnno
    String str;

    // annotation text of the field, not a type 'String'
    // because of 'ElementType.FIELD', wich take an element.
    @EmptyOK
    String test;

    // @TypeAnno annotate just 'this', so called reciever
    // and refer to the TypeAnnoDemo class.
    public int f(@TypeAnno TypeAnnoDemo<T> this, int x) {
        return 10;
    }

    // @TypeAnno annotate return type 'Integer', because of 'ElementType.TYPE_USE'.
    public @TypeAnno
    Integer f1(int a, int b) {
        return a + b;
    }

    // @Recomended annotate initialization of the method/ method type 
    // Because  of 'ElementType.METHOD'.
    public @Recomended
    Integer f2(String str) {
        return str.length() / 2;
    }

    // annotate arrey levels
    String @MaxLength(10) [] @NotZeroLeng [] w;

    // annotate the type of the massive 'Integer'.
    @TypeAnno
    Integer[] a;

    public static void myMeth(int i) {

        // Using TypeAnno on type of argument  'Integer'.
        TypeAnnoDemo<@TypeAnno Integer> typeannoDemo = new TypeAnnoDemo<@TypeAnno Integer>();

        // Apply annotation TYPE_USE to 'new'.
        @Unique
        TypeAnnoDemo<Integer> typeannoDemo1 = new @Unique TypeAnnoDemo<@TypeAnno Integer>();

        Object x = new Integer(10);
        Integer y;

        // annotation of the cust.
        y = (@TypeAnno Integer) x;
    }

    public static void main(String args[]) {
        myMeth(10);
    }

    class SomeClass extends @TypeAnno TypeAnnoDemo<Boolean> {

    }
}
