package ducks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useDelimiter("\\s");

        int n = input.nextInt();
        int m = input.nextInt();

        int[][] ducks = new int[n][2];
        for (int i = 0; i < n; i++) {
            ducks[i][0] = input.nextInt();
            ducks[i][1] = input.nextInt();
        }

        int[][] dp = new int[n][m+1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= m; j++) {
                if (j >= ducks[i][1]) {
                    if (i == 0) {
                        dp[i][j] = ducks[i][0];
                    } else {
                        dp[i][j] = Math.max(dp[i-1][j], ducks[i][0] + dp[i-1][j-ducks[i][1]]);
                    }
                } else {
                    if (i == 0) {
                        dp[i][j] = 0;
                    } else {
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
        }
        System.out.println(dp[n-1][m]);
    }

    public static int[][] readInput(Scanner input, int n) {

        int[][] ducks = new int[n][2];

        for (int i = 0; i < n; i++) {
            ducks[i][0] = input.nextInt();
            ducks[i][1] = input.nextInt();
        }
        return ducks;
    }

    public static int[][] calculateDp(int[][] ducks, int n, int m) {

        int[][] dp = new int[n][m+1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= m; j++) {
                if (j >= ducks[i][1]) {
                    if (i == 0) {
                        dp[i][j] = ducks[i][0];
                    } else {
                        dp[i][j] = Math.max(dp[i-1][j], ducks[i][0] + dp[i-1][j-ducks[i][1]]);
                    }
                } else {
                    if (i == 0) {
                        dp[i][j] = 0;
                    } else {
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
        }
        return dp;
    }
}
