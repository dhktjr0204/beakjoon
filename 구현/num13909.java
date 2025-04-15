package gold;

import java.util.Scanner;

public class num13909 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int cnt = 0;
        while(Math.pow(i, 2)<=n) {
            i++;
            cnt++;
        }

        System.out.println(cnt);
    }
}
