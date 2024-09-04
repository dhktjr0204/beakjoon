package silver;

import java.util.Scanner;

public class num17103 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int cnt=0;

            for(int j=2;j<=n/2;j++){
                if(isPrime(j) && isPrime(n-j)){
                    cnt++;
                }
            }

            System.out.println(cnt);
        }
    }

    public static boolean isPrime(int a){
        if(a==0 || a==1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}
