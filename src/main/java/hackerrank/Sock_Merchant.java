package hackerrank;
import java.io.*;
import java.util.*;
/**
 *
 * @author Bohdan Skrypnyk
 */
public class Sock_Merchant {
     // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
         int result = 0;
         Arrays.sort(ar);
          for(int c = 0; c<n-1;c++){
             if (ar[c] == (ar[c+1])){
                 result++;
                 c++;
           }
          }
         return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
