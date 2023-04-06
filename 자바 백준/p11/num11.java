package p11;

import java.util.Scanner;

public class num11 {
    public static int[] dp=new int[101];

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        dp[3]=1;
        for(int i=3;i<dp.length;i++){
            dp[i]=-1;
        }

        int num=sc.nextInt();
        while(num-->0){
            int N=sc.nextInt();
            System.out.println(Triangle(N));
        }
    }
    public static int Triangle(int N){
        if(dp[N]==-1){
            dp[N]=Triangle(N-2)+Triangle(N-3);
        }
        return dp[N];
    }
}
