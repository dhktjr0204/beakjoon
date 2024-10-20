package lv2;

public class n3타일링 {
    public int solution(int n) {
        long dp[] = new long[n + 1];
        int mod = 1000000007;

        dp[0] = 1;
        dp[2] = 3;

        for (int i = 4; i <= n; i += 2) {
            dp[i] = dp[i - 2] * 3;
            for (int j = i - 4; j >= 0; j -= 2) {
                dp[i] += dp[j] * 2;
            }
            dp[i] = dp[i] % mod;
        }
        return (int)dp[n];
    }

    public static void main(String[] args) {
        n3타일링 problem = new n3타일링();
        System.out.println(problem.solution(8));
    }
}
