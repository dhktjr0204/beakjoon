package silver;

import java.util.Scanner;

public class num14916 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coin = sc.nextInt();
        int result=0;
        while (coin>0){
            if (coin%5==0){
                result+=coin/5;
                coin%=5;
            }else{
                coin-=2;
                result+=1;
            }
        }
        if (coin==0){
            System.out.println(result);
        }else{
            System.out.println(-1);
        }
    }
}
