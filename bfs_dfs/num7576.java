package gold;

import java.util.*;
import java.io.*;
public class num7576 {
    static boolean[][] visited;
    static int[][] matrix;
    static int n, m;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int count = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        matrix = new int[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bfs();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(matrix[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                count = Math.max(count, matrix[i][j]);
            }
        }

        System.out.println(count - 1);
    }

    public static void bfs() {
        Queue<Integer[]> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 1) {
                    q.add(new Integer[]{i, j});
                    visited[i][j] = true;
                }
            }
        }

        while (!q.isEmpty()) {
            Integer[] nq = q.poll();
            int yq = nq[0];
            int xq = nq[1];

            for (int i = 0; i < 4; i++) {
                int nx = xq + dx[i];
                int ny = yq + dy[i];
                if (0 <= nx && nx < m && 0 <= ny && ny < n) {
                    if (!visited[ny][nx] && matrix[ny][nx] != -1) {
                        visited[ny][nx] = true;
                        matrix[ny][nx] += matrix[yq][xq] + 1;
                        q.add(new Integer[]{ny, nx});
                    }
                }

            }
        }
    }


}