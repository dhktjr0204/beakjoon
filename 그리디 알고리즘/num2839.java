package silver;

import java.util.Scanner;

public class num2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = 0;
        while (n > 0) {
            if (n % 5 == 0) {
                result += n / 5;
                n%=5;
                break;
            }
            result += 1;
            n -= 3;
        }

        if(n==0){
            System.out.println(result);
        }else{
            System.out.println(-1);
        }
    }
}
