package hackerrank;
import java.io.*;
import java.util.*;
/**
 *
 * @author Bohdan Skrypnyk
 */
public class Strings {
     public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int a = A.length() + B.length();
        System.out.println(a);
        int var1 = A.compareTo( B );
        int var2 = B.compareTo( A );
        if(var1 > var2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        System.out.println(A.substring(0,1).toUpperCase()+ A.substring(1)+" "+B.substring(0,1).toUpperCase()+ B.substring(1));
    }
}
