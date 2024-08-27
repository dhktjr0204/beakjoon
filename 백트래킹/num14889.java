package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num14889 {
    static int n;
    static int[][] map;
    static int Min = Integer.MAX_VALUE;
    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        visit = new boolean[n];
        map = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; st.hasMoreTokens(); j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(0, 0);
        System.out.println(Min);
    }

    public static void dfs(int depth, int idx) {
        if (depth == n / 2) {
            diff();
            return;
        }

        for (int i = idx; i < n; i++) {
            if(!visit[i]){
                visit[i] = true;
                dfs(depth + 1, i + 1);
                visit[i] = false;
            }
        }
    }

    public static void diff() {
        int startScore = 0;
        int linkScore = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (visit[i] && visit[j]) {
                    startScore += map[i][j]+ map[j][i];
                } else if (!visit[i] && !visit[j]) {
                    linkScore += map[i][j]+map[j][i];
                }
            }
        }
        int result = Math.abs(startScore - linkScore);

        if (result == 0) {
            System.out.println(result);
            System.exit(0);
        }

        Min = Math.min(Min, result);
    }
}
