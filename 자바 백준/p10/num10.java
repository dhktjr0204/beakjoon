package p10;

import java.util.Scanner;

public class num10 {
    public static int arr[]=new int[10001];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        arr[0]=0;
        arr[1]=1;
        arr[2]=2;

        int num=sc.nextInt();
        for(int i=3;i<arr.length;i++){
            arr[i]=-1;
        }
        System.out.println(Tile(num));
    }

    public static int Tile(int N){
        if (arr[N]==-1){
            arr[N]=Tile(N-1)+Tile(N-2)%15746;
        }
        return arr[N];
    }
}
