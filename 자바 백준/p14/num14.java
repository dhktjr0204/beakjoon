package p14;

import java.util.Scanner;

public class num14 {
    static int[] arr;
    static Integer[] dp;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        arr=new int[N+1];
        dp=new Integer[N+1];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }

        dp[0]=arr[0];
        dp[1]=arr[1];

        if(N>=2){
            dp[2]=arr[1]+arr[2];
        }
        System.out.println(jump(N));

    }

    static int jump(int N){

        if(dp[N]==null){
            dp[N]=Math.max(jump(N-2),jump(N-3)+arr[N-1])+arr[N];
        }
        return dp[N];
    }
}
