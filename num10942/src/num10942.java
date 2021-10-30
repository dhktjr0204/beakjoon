import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num10942 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static boolean dp[][];

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        dp = new boolean[n + 1][n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        solve(arr, n);

        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            if (dp[start][end])
                sb.append("1\n");
            else {
                sb.append("0\n");
            }
            System.out.println(sb);
        }
    }

    public static void solve(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            dp[i][i] = true;
        }//원소가 한개면 팰린드롬이니 dp에 true저장
        for (int i = 1; i <= n - 1; i++) {
            if (arr[i] == arr[i + 1])
                dp[i][i + 1] = true;
        }//원소가 두개면 두개의 값이 같아야 팰린 드롬이니 dp에 true저장
        for (int i = 2; i <= n; i++) {//두개 이상의 원소일때
            for (int j = 1; j <= n - i; j++) {//시작점
                if (arr[j] == arr[j + i] && dp[j + 1][j + i - 1])//끝값과 시작값이 같고, 그 사이가 팰린드롬이면 true
                    dp[j][j + i] = true;
            }
        }
    }
}

