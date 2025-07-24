package silver;

import java.util.*;
import java.io.*;
public class num1012 {
    static boolean[][] visited;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static int n,m;
    static int[][] matrix;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++) {
            st = new StringTokenizer(br.readLine());
            n =Integer.parseInt(st.nextToken());
            m =Integer.parseInt(st.nextToken());
            int k =Integer.parseInt(st.nextToken());

            matrix = new int[n][m];
            visited = new boolean[n][m];
            for(int j=0; j<k; j++) {
                st = new StringTokenizer(br.readLine());
                int y = Integer.parseInt(st.nextToken());
                int x = Integer.parseInt(st.nextToken());

                matrix[y][x] = 1;
            }

            int count = 0;
            for(int a = 0; a<n; a++) {
                for(int b=0;b<m; b++) {
                    if(!visited[a][b] && matrix[a][b] == 1) {
                        bfs(a, b);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }

    public static void bfs(int y, int x) {
        Queue<Integer[]> q = new LinkedList<>();
        q.add(new Integer[]{y, x});

        while(!q.isEmpty()) {
            Integer[] nq = q.poll();
            int yq = nq[0];
            int xq = nq[1];

            for(int i=0; i<4; i++) {
                int nx = xq + dx[i];
                int ny = yq + dy[i];

                if(0 <= nx && nx < m && 0 <= ny && ny < n) {
                    if(!visited[ny][nx] && matrix[ny][nx] == 1) {
                        visited[ny][nx] = true;
                        q.add(new Integer[]{ny, nx});
                    }
                }
            }
        }
    }
}