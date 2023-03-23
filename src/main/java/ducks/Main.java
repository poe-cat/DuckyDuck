package ducks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        input.useDelimiter("\\s");

        int n = input.nextInt(); // number of ducks
        int m = input.nextInt(); // maximum width of a row

        int[][] ducks = new int[n][2]; // array storing the height and width of the ducks

        for (int i = 0; i < n; i++) {
            ducks[i][0] = input.nextInt(); // height of duck i
            ducks[i][1] = input.nextInt(); // width of duck i
        }

        int[][] dp = new int[n][m+1]; // array storing the maximum sum of heights for each row width

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= m; j++) {
                if (j >= ducks[i][1]) { //  if duck i fits in a row with width j
                    if (i == 0) {
                        dp[i][j] = ducks[i][0]; // first duck
                    } else {
                        dp[i][j] = Math.max(dp[i-1][j], ducks[i][0] + dp[i-1][j-ducks[i][1]]);

                        /* we choose the greater value between two options:
                        1) we don't use duck i and use the result from the previous row with width j,
                        2) we use duck i and add its height to the result from the previous row
                        with width j-ducks[i][1]
                        */
                    }
                } else {
                    if (i == 0) {
                        dp[i][j] = 0; // the first duck doesn't fit in a row with width j
                    } else {
                        dp[i][j] = dp[i-1][j]; // we don't use duck i
                    }
                }
            }
        }

        System.out.println(dp[n-1][m]); // the result is the maximum sum of heights for the maximum row width
    }
}
