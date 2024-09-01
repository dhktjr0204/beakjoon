package silver;

import java.util.Arrays;
import java.util.Scanner;

public class num2485 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int[] tree=new int[n];

        for(int i=0;i<n;i++){
            tree[i]=sc.nextInt();
        }
        int[] between=new int[n-1];
        for(int i=0;i<between.length;i++){
            between[i]=tree[i+1]-tree[i];
        }

        int gcd=between[0];
        for(int i=1;i<between.length;i++){
            gcd = makeGcd(gcd, between[i]);
        }

        int result=0;
        for(int width : between){
            result+=width/gcd-1;
        }

        System.out.println(result);

    }
    public static int makeGcd(int a, int b){
        int tmp;
        while(a!=0){
            tmp=a;
            a=b%a;
            b=tmp;
        }
        return b;
    }
}
