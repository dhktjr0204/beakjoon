package silver;

import java.util.*;
import java.io.*;

public class num2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        long start = 1;
        long end = arr[arr.length - 1];

        long result = 0;
        while (start <= end) {
            long mid = (start+end)/2;
            long sum = 0;
            for(int i =0; i<n; i++) {
                sum += Math.max(arr[i]-mid, 0);
            }

            if(sum < m) {
                end = mid - 1;
            }else {
                start = mid + 1;
                result = mid;
            }

        }

        System.out.println(result);

    }
}