package silver;

import java.util.*;
import java.io.*;

public class num1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] arr1 = new int[n];
        st = new StringTokenizer(br.readLine());
        makeArr(arr1, st);

        int m = Integer.parseInt(br.readLine());
        int[] arr2 = new int[m];
        st = new StringTokenizer(br.readLine());
        makeArr(arr2, st);

        Arrays.sort(arr1);

        for (int i = 0; i < m; i++) {
            int start = 0;
            int end = n - 1;
            int result = 0;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (arr2[i] < arr1[mid]) {
                    end = mid - 1;
                } else if (arr2[i] > arr1[mid]) {
                    start = mid + 1;
                } else {
                    result = 1;
                    break;
                }
            }

            System.out.println(result);
        }
    }

    public static void makeArr(int[] arr, StringTokenizer st) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }
}