package lv2;

import java.io.IOException;

public class n2타일링 {
    public int solution(int n) {
        int dp[] = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 2] + dp[i - 1])%1000000007;
        }
        return dp[n];
    }

    public static void main(String[] args) throws IOException {
        n2타일링 practice = new n2타일링();
        System.out.println(practice.solution(4));
    }
}
