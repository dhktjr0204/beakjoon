package gold;

import java.util.Scanner;

public class num9251 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String m = sc.next();

        int[][] dp = new int[n.length()+1][m.length()+1];

        for (int i = 1; i <= n.length(); i++) {
            for (int j = 1; j <= m.length(); j++) {
                if(n.charAt(i-1) == m.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        System.out.println(dp[n.length()][m.length()]);
    }
}
