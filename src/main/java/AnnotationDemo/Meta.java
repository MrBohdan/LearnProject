package AnnotationDemo;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/**
 * There are three types of annotations Retention SOURCE/CLASS/RUNTIME. They
 * change life-cycle of annotations when system is run. Class Annotation is
 * super-interface for all annotations of interface
 *
 * @author Bohdan Skrypnyk
 */
//type of annotation
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {

    String str();

    int num();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What {

    String desc();

}

@What(desc = "Class annotations")
@MyAnno(str = "Meta", num = 25)
public class Meta {

    //Method annotations
    @What(desc = "Method annotations")
    @MyAnno(str = "myMeth", num = 45)
    public static void myMeth(String str, int i) {

        Meta meta = new Meta();
        try {
            // Get object Class
            Class<?> c = meta.getClass();

            // Get object Method
            // If method has parameters, we must add parameterTypes.class
            Method meth = c.getMethod("myMeth", String.class, int.class);

            //Get Annotations for this class
            MyAnno myanno = meth.getAnnotation(MyAnno.class);

            //Display values of annotations 
            System.out.println(myanno.str() + " " + myanno.num());

            // another example of getting annotations
            System.out.println(Meta.class.getMethod("myMeth", String.class, int.class).getAnnotation(MyAnno.class).str());

            System.out.println(str + " " + i);

            // Get all annotations
            Annotation anno[] = meta.getClass().getAnnotations();

            for (Annotation a : anno) {
                System.out.println(a);
            }

            System.out.println();

            anno = meth.getAnnotations();
            for (Annotation a : anno) {
                System.out.println(a);
            }
        } catch (NoSuchMethodException ex) {
            System.out.println("No Such Method ");
        }
    }

    public static void main(String args[]) {
        myMeth("Test", 25);
    }
}
