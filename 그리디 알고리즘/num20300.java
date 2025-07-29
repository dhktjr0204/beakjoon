package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class num20300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        long[] arr = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);
        long result = 0;
        for (int i = 0; i < n / 2 - 1; i++) {
            result = Math.max(result, arr[i] + arr[(n - i - 1) - (n % 2)]);
        }

        if (n % 2 == 0) {
            System.out.println(result);
        } else {
            System.out.println(Math.max(result, arr[n - 1]));
        }
    }
}