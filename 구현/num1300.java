package gold;

import java.util.Scanner;

public class num1300 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int start = 1;
        int end = k;
        int answer = 0;

        while (start <= end) {
            int mid = (start + end) / 2;

            int temp = 0;
            for (int i = 1; i < n + 1; i++) {
                temp += Math.min(mid / i, n);
            }

            // 내가 봐야될 순서보다 뒤에 있으면 -> 숫자가 너무 크다.
            if (temp >= k) {
                end = mid - 1;
                answer = mid;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(answer);
    }
}