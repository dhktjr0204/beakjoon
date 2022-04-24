package p22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class num22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        int prev[]=new int[N];
        int sum=0;

        for(int i=0;i<N;i++){
            sum+=prev[i]+arr[i];
            prev[i]=+arr[i];
        }
        System.out.println(sum);
    }
}
