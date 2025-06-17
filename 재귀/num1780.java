package silver;

import java.io.*;
import java.util.*;
public class num1780 {
    static int[][] matrix;
    static int n;
    static int[] result = new int[3];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0, n);
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
    }

    public static void dfs(int xStart, int yStart, int count) {
        int startNum = matrix[yStart][xStart];

        boolean isAllSame = true;
        for (int i = yStart; i < yStart + count; i++) {
            for (int j = xStart; j < xStart + count; j++) {
                if (startNum != matrix[i][j]) {
                    isAllSame = false;
                    break;
                }
            }
        }

        if (isAllSame) {
            result[startNum + 1]++;
            return;
        }

        int newCount = count / 3;
        dfs(xStart, yStart, newCount);

        dfs(xStart + newCount, yStart, newCount);
        dfs(xStart + newCount*2, yStart, newCount);

        dfs(xStart, yStart + newCount, newCount);
        dfs(xStart, yStart + newCount*2, newCount);

        dfs(xStart + newCount, yStart + newCount, newCount);
        dfs(xStart + newCount, yStart + newCount*2, newCount);
        dfs(xStart + newCount*2, yStart + newCount, newCount);
        dfs(xStart + newCount*2, yStart + newCount*2, newCount);

    }
}