package ducks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useDelimiter("\\s");
        int n = input.nextInt(); // liczba kaczuszek
        int m = input.nextInt(); // maksymalna szerokość rzędu

        int[][] kaczuszki = new int[n][2]; // tablica przechowująca wysokość i szerokość kaczuszek
        for (int i = 0; i < n; i++) {
            kaczuszki[i][0] = input.nextInt(); // wysokość kaczuszki i
            kaczuszki[i][1] = input.nextInt(); // szerokość kaczuszki s
        }

        int[][] dp = new int[n][m+1]; // tablica przechowująca maksymalną sumę wysokości dla każdej szerokości rzędu
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= m; j++) {
                if (j >= kaczuszki[i][1]) { // jeśli kaczuszka i zmieści się w rzędzie o szerokości j
                    if (i == 0) {
                        dp[i][j] = kaczuszki[i][0]; // pierwsza kaczuszka
                    } else {
                        dp[i][j] = Math.max(dp[i-1][j], kaczuszki[i][0] + dp[i-1][j-kaczuszki[i][1]]);
                        // wybieramy większą wartość spośród dwóch możliwości:
                        // 1. nie używamy kaczuszki i oraz korzystamy z wyniku z poprzedniego rzędu o szerokości j
                        // 2. używamy kaczuszki i oraz dodajemy jej wysokość do wyniku z poprzedniego rzędu o szerokości j-kaczuszki[i][1]
                    }
                } else {
                    if (i == 0) {
                        dp[i][j] = 0; // pierwsza kaczuszka nie zmieści się w rzędzie o szerokości j
                    } else {
                        dp[i][j] = dp[i-1][j]; // nie używamy kaczuszki i
                    }
                }
            }
        }

        System.out.println(dp[n-1][m]); // wynik to maksymalna suma wysokości dla maksymalnej szerokości rzędu
    }
}
