package hackerrank;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Coding challenge | Microsoft interview | Part 1
 *
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

    // another example
    public static int solution2(int N) {
        int resEx = 100000000; // set limit

        String strConvert = Integer.toString(N); // convert an integer to the string
        String temp1[] = new String[strConvert.length()]; // temp string
        String temp = ""; // temp string

        for (int i = 0; i <= strConvert.length() - 1; i++) {
            temp += strConvert.charAt(i);
            temp1[i] = temp;
            temp = "";
        }

        // bubble sort 
        for (int i = 0; i < temp1.length; i++) {
            for (int a = 0; a < temp1.length; a++) {

                // compare one strings with each other
                // if caller string longer than next 
                if (temp1[a].compareTo(temp1[i]) < 0) {

                    // add a smaller string to temp.
                    // bc 'arr[a]' more than 'arr[i]'
                    // and need to swap them 
                    temp = temp1[i];

                    // replace/swap 'arr[a]' to position of 'arr[i]'.
                    // A bigger string that was on a lower position
                    // will be placed on a higher position where we're
                    // a smaller string.
                    temp1[i] = temp1[a];

                    // A smaller string that was on a higher position
                    // will be placed on a lower position where we're
                    // a bigger string.
                    temp1[a] = temp;
                }
            }
            temp = "";
        }

        for (String str : temp1) {
            temp += str; // add string one by one to the string
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

        System.out.println(solution2(123)); // should return 321 
        System.out.println(solution2(213)); // should return 321
        System.out.println(solution2(553)); // should return 553
        System.out.println(solution2(1548)); // hould return 8541

        // uncomment to run recursive method
//        int a = 0;
//
//        while (true) {
//            System.out.println(solution(a++));
//        }
    }
}
