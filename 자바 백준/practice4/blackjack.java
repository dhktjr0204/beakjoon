package practice4;

import java.util.Scanner;

public class blackjack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int result = search(arr, N, M);
    }

    static int search(int[] arr, int N, int M) {
        int result = 0;
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int z = j = 1; z < N; z++) {
                    int temp = arr[i] + arr[j] + arr[z];

                    if (M == temp)
                        return temp;
                    if (result < temp && temp < M) {
                        result = temp;
                    }
                }
            }
        }
        return result;
    }
}
