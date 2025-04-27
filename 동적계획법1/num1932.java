package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num1932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] tree = new int[n][n];
        int[][] dp = new int[n][n];

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<=i; j++) {
                tree[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[0][0] = tree[0][0];
        for(int i=1; i<n; i++) {
            for(int j=0; j<=i; j++) {
                if(j==0) {
                    dp[i][j] = tree[i][j] + dp[i-1][j];
                } else if(j==i) {
                    dp[i][j] = tree[i][j] + dp[i-1][j-1];
                }else{
                    dp[i][j] = tree[i][j] + Math.max(dp[i-1][j], dp[i-1][j-1]);
                }
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            max = Math.max(max, dp[n-1][i]);
        }
        System.out.println(max);
    }
}
