package hackerrank;

public class Two_D_Massive {

    public static void main(String[] args) {
        int twoD[][] = new int[4][5];
        int i, j, k = 1;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
            }
        }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("twoD");
        int twoDR[][] = {{1 * 1, 4 * 4, 1 * 1, 1 * 1, 1 * 1},
        {2 * 2, 5 * 5, 1 * 1, 1 * 1, 1 * 1},
        {3 * 3, 6 * 1, 1 * 1, 1 * 1, 30 * 2}};
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(twoDR[i][j] + " ");
            }
            System.out.println();
        }
    }
}
