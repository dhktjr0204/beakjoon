package lv2;

import java.util.Arrays;

public class 숫자변환하기 {

    public int solution(int x, int y, int n) {
        int[] dp = new int[y + 1];

        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[x] = 0;

        for (int i = x; i <= y; i++) {

            if(dp[i]==Integer.MAX_VALUE) continue;

            if(i*2<=y){
                dp[i*2]=Math.min(dp[i]+1, dp[i*2]);
            }
            if(i*3<=y){
                dp[i*3]=Math.min(dp[i]+1, dp[i*3]);
            }
            if(i+n<=y){
                dp[i+n]=Math.min(dp[i]+1, dp[i+n]);
            }
        }

        if(dp[y]==Integer.MAX_VALUE){
            return -1;
        }

        return dp[y];
    }

    public static void main(String[] args) {
        숫자변환하기 problem = new 숫자변환하기();
        System.out.println(problem.solution(10, 40, 5));
    }
}
