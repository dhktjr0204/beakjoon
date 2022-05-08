package p16;

import java.util.Scanner;

public class num16 {
    public static int arr[];
    public static Integer dp[];

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();

        arr=new int[N];
        dp=new Integer[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        dp[0]=arr[0];
        dp[1]=arr[0]+arr[1];

        System.out.println(find(N));
    }

    static int find(int N) {
        if (dp[N] == null) {
            dp[N]=Math.max(Math.max(find(N-2),find(N-3)+arr[N-1])+arr[N],find(N-1));
        }
        return dp[N];
    }
}
