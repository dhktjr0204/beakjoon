package silver;

import java.util.Scanner;

public class num4134 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        for(int i=0;i<t;i++){
            long a=sc.nextLong();
            while (!isPrime(a)) {
                a++;
            }
            System.out.println(a);
        }
    }
    public static boolean isPrime(long a){
        if(a==1 || a==0){
            return false;
        }
        for(long i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}
