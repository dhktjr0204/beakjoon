package p27;

import java.util.Scanner;

public class num27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int d=gcb(num1,num2);
        System.out.println(d);
        System.out.println(num1*num2/d);

    }
    public static int gcb(int a,int b){
        if(b==0)
            return a;
        return gcb(b,a%b);
    }
}
