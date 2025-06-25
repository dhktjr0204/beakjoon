package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class num1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] lan = new int[n];
        for (int i = 0; i < n; i++) {
            lan[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(lan);
        long start = 1;
        long end = lan[lan.length - 1];

        long result = 0;
        while (start <= end) {
            long mid = (start + end) / 2;
            long count = 0;
            for (int i = 0; i < n; i++) {
                count += lan[i] / mid;
            }

            if (count >= m) {
                start = mid + 1;
                result = mid;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(result);
    }
}