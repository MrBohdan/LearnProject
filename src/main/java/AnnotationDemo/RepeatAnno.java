package AnnotationDemo;

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/**
 * @Repeatable allow repeat annotation in one place. The method must contain
 * massive with field 'value'.
 *
 * Annotations have few limitations. (1) one annotation cannot inherit another
 * one; (2) all methods which are declared in annotation must not have
 * parameters; (3) they should return anything, such as (String, int...), except
 * Generic types
 *
 * @author Bohdan Skrypnyk
 */
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatableAnno.class) // make annotaton @MyAnno2 repeatable
@interface MyAnno2 {

    String str();

    int num() default 15;
}

//All repeating annotations are stored in 'container anotations', such as below
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatableAnno {

    MyAnno2[] value();
}

public class RepeatAnno {

    //repeat annotations '@MyAnno2' in 'myMeth' method 
    @MyAnno2(str = "First annotation", num = 25)
    @MyAnno2(str = "Second annotation")
    @MyAnno2(str = "Third annotation", num = -1)
    public static void myMeth(int i) {
        RepeatAnno obj = new RepeatAnno();
        try {

            //get object Class, than get method
            Method meth = obj.getClass().getMethod("myMeth", int.class);

            //get container anotations from MyRepeatableAnno class 
            Annotation annn = meth.getAnnotation(MyRepeatableAnno.class);

            //display annotations
            //all repeated annotations returned as single line, but they devidet by ','
            System.out.println(annn);

            //another way to get all repeated annotations from '@MyAnno2'
            Annotation annn1[] = meth.getAnnotationsByType(MyAnno2.class);

            for (Annotation ann : annn1) {
                System.out.println(ann);
            }

        } catch (NoSuchMethodException ex) {
            System.out.println("No Such Method ");
        }
    }

    public static void main(String args[]) {
        myMeth(25);
    }
}
