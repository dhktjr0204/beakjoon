package gold;

import java.util.*;
import java.io.*;

public class num2110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long[] wifi = new long[n];
        for (int i = 0; i < n; i++) {
            wifi[i] = Long.parseLong(br.readLine());
        }
        Arrays.sort(wifi);

        long start = 1;
        long end = wifi[wifi.length - 1] - wifi[0];
        long answer = 0;

        while (start <= end) {
            long mid = (start + end) / 2;
            long count = 1;
            long current = wifi[0];

            for (int i = 1; i < wifi.length; i++) {
                if (wifi[i] >= current + mid) {
                    count++;
                    current = wifi[i];
                }
            }

            if (count >= m) {
                start = mid + 1;
                answer = mid;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(answer);

    }
}