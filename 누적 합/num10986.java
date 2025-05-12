package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long[] count = new long[m]; // 나머지 개수 저장용
        long sum = 0;
        long answer = 0;

        count[0] = 1;  // sum % m == 0 인 경우도 카운팅

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            sum += num;
            int mod = (int)(sum % m);
            if (mod < 0) mod += m;
            answer += count[mod];  // 이전에 같은 나머지 나온 횟수만큼 정답 증가
            count[mod]++;
        }

        System.out.println(answer);
    }
}
