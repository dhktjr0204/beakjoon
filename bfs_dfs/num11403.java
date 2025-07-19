package silver;
import java.io.*;
import java.util.*;
public class num11403 {
    static int[][] matrix;
    static int n;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        matrix = new int[n][n];
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] result = new int[n][n];
        for(int i=0; i<n; i++) {
            visited = new boolean[n];
            dfs(matrix[i], result[i]);
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(result[i][j] +" ");
            }
            System.out.println();
        }
    }

    public static void dfs(int[] list, int[] result) {
        for(int i=0; i<n; i++) {
            if(list[i] == 1 && !visited[i]) {
                visited[i] = true;
                result[i] = 1;
                dfs(matrix[i], result);
            }
        }
    }
}