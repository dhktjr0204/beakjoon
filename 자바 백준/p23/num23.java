package p23;

import java.util.Scanner;
import java.util.StringTokenizer;

public class num23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=Integer.MAX_VALUE;
        StringTokenizer sub=new StringTokenizer(sc.nextLine(),"-");

        while(sub.hasMoreTokens()){
            int temp=0;
            StringTokenizer add=new StringTokenizer(sub.nextToken(),"+");
            while(add.hasMoreTokens()){
                temp+=Integer.parseInt(add.nextToken());
            }
            if(sum==Integer.MAX_VALUE)
                sum+=temp;
            else{
                sum-=temp;
            }
        }
        System.out.println(sum);
    }
}
