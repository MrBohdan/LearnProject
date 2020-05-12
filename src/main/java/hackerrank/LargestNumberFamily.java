package hackerrank;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Two non-negative integers are called siblings if they can be obtained from
 * each other by rearranging the digits of their decimal representations. For
 * example, 123 and 213 are siblings. 535 and 355 are also siblings. A set
 * consisting of a non-negative integer N and all of its siblings is called the
 * family of N. For example, the family of 553 comprises three numbers: 355, 535
 * and 553. Write a function that, given a non-negative integer N, returns the
 * largest number in the family of N. The function should return −1 if the
 * result exceeds 100,000,000. For example, given N = 213 the function should
 * return 321. Given N = 553 the function should return 553.
 *
 * @author Bohdan Skrypnyk
 */
public class LargestNumberFamily {

    public static int solution(int N) {
        int resEx = 100000000; // set limit

        String str = Integer.toString(N); // convert an integer to the string
        String temp = ""; // temp string

        ArrayList<Character> numSet = new ArrayList<>();

        for (int i = 0; i <= str.length() - 1; i++) {
            numSet.add(str.charAt(i));
        }

        // Bc we need to find just the largest possible sibling,
        // the numbers can be stored from smallest to the largest
        Collections.sort(numSet); // sort arraylist 

        // After arrayList will be reversed,
        // to store numbers from largest to the smallest 
        Collections.reverse(numSet); // reverse arrayList

        for (Character ch : numSet) {
            temp += ch; // add char one by one to the string
        }

        N = Integer.valueOf(temp); // convert string to the integer

        if (N >= resEx) { // if 'N' is more than 100000000, will return -1
            return -1;
        }

        return N;
    }

    public static void main(String args[]) {
        System.out.println(solution(123)); // should return 321 
        System.out.println(solution(213)); // should return 321
        System.out.println(solution(553)); // should return 553
        System.out.println(solution(1548)); // hould return 8541

        // uncomment to run recursive method
//        int a = 0;
//
//        while (true) {
//            System.out.println(solution(a++));
//        }
    }
}
