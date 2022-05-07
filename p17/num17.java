package p17;

import java.util.Scanner;

public class num17 {
    public static int arr[];
    public static Integer dp[];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        for(int i=0;i<N;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<N;i++){
            LIS(N);
        }
        int max=dp[0];

        for(int i=0;i<N;i++){
            max=Math.max(max,dp[i]);
        }
        System.out.println(max);

    }
    static int LIS(int N){
        if(dp[N]==null) {
            dp[N] = 1;
            for (int i = N - 1; i >= 0; i--) {
                if (arr[i] < arr[N]) {
                    dp[N] = Math.max(dp[N], LIS(i) + 1);
                }
            }
        }
        return dp[N];
    }
}
