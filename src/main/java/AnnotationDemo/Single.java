package AnnotationDemo;

import java.lang.annotation.*;
import java.lang.reflect.Method;

/**
 * There are three types of 'Retention' annotation SOURCE/CLASS/RUNTIME. They
 * change the life-cycle of annotations when the system is run. Class Annotation
 * is super-interface for all annotations of interface
 *
 * @author Bohdan Skrypnyk
 */
@Retention(RetentionPolicy.RUNTIME)
@interface SingleAnno {

    int value(); // single annotation must have name 'value'

    int num() default 15; // single annotation can be used with 'default' annotations

    int num1() default 20;
}

public class Single {

    //assign to single annotation 
    @SingleAnno(100)

    //to re-assign any annotation, need to do it for all single/default
    //@SingleAnno(value = 100,num = 15, num1 = 5)
    public static void myMeth() {
        Single single = new Single();
        try {
            // get object Class, then get object Method
            Method meth = single.getClass().getMethod("myMeth");

            // get annotations from the method
            SingleAnno singleAnno = meth.getAnnotation(SingleAnno.class);

            // display annotation value
            System.out.println("Single annotation value : " + singleAnno.value()
                    + "\nDefault val 1: " + singleAnno.num() + "\nDefault val 2: " + singleAnno.num1());

        } catch (NoSuchMethodException ex) {
            System.out.println("No Such Method");
        }
    }

    public static void main(String args[]) {
        myMeth();
    }
}
