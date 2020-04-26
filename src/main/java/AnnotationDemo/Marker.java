package AnnotationDemo;

import java.lang.annotation.*;
import java.lang.reflect.Method;

/**
 * There is three types of annotations Retention SOURCE/CLASS/RUNTIME. They
 * change behavior of annotations when system is run. Class Annotation is
 * super-interface for all annotations of interface
 *
 * @author Bohdan Skrypnyk
 */
//type of annotation
@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker {
}

public class Marker {

    @MyMarker
    public static void myMeth() {
        Marker m = new Marker();
        try {
            Method meth = m.getClass().getMethod("myMeth");

            // Check if annotation is present or not 
            if (meth.isAnnotationPresent(MyMarker.class)) {
                System.out.println("MyMarker present");
            }

        } catch (NoSuchMethodException ex) {
            System.out.println("No Such Method");
        }
    }

    public static void main(String args[]) {
        myMeth();
    }
}
