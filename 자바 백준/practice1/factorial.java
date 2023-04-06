package practice1;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        if(num<0 || num>12){
            System.out.println(" 다시입력해주십시오");
            num=sc.nextInt();
        }
        int result=fac(num);
        System.out.println(result);
    }
    public static int fac(int n){
        if(n<=1)
            return 1;
        return fac(n-1)*n;
    }

}

