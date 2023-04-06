package p28;

import java.util.Arrays;
import java.util.Scanner;

public class num28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int N= sc.nextInt();
        int j=2;
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);

        int gv=arr[1]-arr[0];
        for(int i=2;i<N;i++){
            gv=gcb(gv,arr[i]-arr[i-1]);
        }
        for(int i=2;i<=gv;i++){
            if(gv%i==0){
                System.out.println(i);
            }
        }

    }
    public static int gcb(int a,int b){
        if(b==0)
            return a;
        return gcb(b,a%b);
    }
}
