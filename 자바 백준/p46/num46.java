package p46;

import java.util.Scanner;

public class num46 {
    public static long C;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        long a= sc.nextLong();
        long b=sc.nextLong();
        C= sc.nextLong();

        System.out.println(pow(a,b));
    }
    public static long pow(long A,long exp){
        if(exp==1){
            return A%C;
        }
        long temp=pow(A,exp/2);

        if(exp%2==1){
            return (temp*temp%C)*A%C;
        }else
            return temp*temp%C;
    }
}
