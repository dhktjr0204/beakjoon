package p20;

import java.util.Scanner;

public class num20 {
    static int arr[];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();
        int won=sc.nextInt();
        arr=new int[N];

        int count=0;

        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=N-1;i>=0;i--){
            if(arr[i]<=won) {
                count+=(won/arr[i]);
                won=won%arr[i];
            }
        }
        System.out.println(count);
    }
}
