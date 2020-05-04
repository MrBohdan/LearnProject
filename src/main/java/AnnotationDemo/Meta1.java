package AnnotationDemo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/**
 * There are three types of 'Retention' annotation SOURCE/CLASS/RUNTIME. They
 * change the life-cycle of annotations when the system is run. Class Annotation
 * is super-interface for all annotations of interface
 *
 * @author Bohdan Skrypnyk
 */
//type of annotation
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno1 {

    String str() default "Test default";

    int num() default 14;
}

public class Meta1 {

    @MyAnno1()
    public static void myMeth() {
        Meta1 meta1 = new Meta1();
        try {
            // the first step of the 'Reflection' - get object Class
            Class<?> c = meta1.getClass();

            // the second step of the 'Reflection' - get object Method
            Method meth = c.getMethod("myMeth");
            
            // get annotations from the method
            MyAnno1 myAnno1 = meth.getAnnotation(MyAnno1.class);
            
            // display values of annotations 
            System.out.println(myAnno1.num() + " " + myAnno1.str());
            
        } catch (NoSuchMethodException ex) {
            System.out.println("No Such Method ");
        }
    }

    public static void main(String args[]) {
        myMeth();
    }
}
