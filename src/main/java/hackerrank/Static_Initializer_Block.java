package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * @author Bohdan Skrypnyk
 */

public class Static_Initializer_Block {

        public static int B;  
        public static int H;
        static boolean flag;
        public static Scanner scan = new Scanner(System.in);
        static {
           B =  scan.nextInt();
           H =  scan.nextInt();
           flag=true;
           if(B <=0 || H <= 0){
            System.out.print("java.lang.Exception: Breadth and height must be positive");
             flag=false;
           }
        }
        public static void main(String[] args){
                       if(flag){
                               int area=B*H;
                               System.out.print(area);
                       }

               }//end of main
}
