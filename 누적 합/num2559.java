package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class num2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int[] dp = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            if(i < m) {
               sum += num;
               dp[i] = sum;
            }
        }

        for(int i=m; i<n; i++) {
            dp[i] = dp[i-1] + arr[i] - arr[i-m];
        }
        int max = Integer.MIN_VALUE;
        for (int i = m - 1; i < n; i++) {
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}
