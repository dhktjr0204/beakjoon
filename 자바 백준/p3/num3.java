package p3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class num3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        int num=sc.nextInt();
        while(num!=0){
            arr[num%10]++;
            num/=10;
        }
        for(int i=9;i>=0;i--){
            while(arr[i]-->0){
                System.out.print(i);
            }
        }

    }
}
