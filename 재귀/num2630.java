package silver;


import java.io.*;
import java.util.StringTokenizer;

public class num2630 {
    static int zeroCount = 0;
    static int oneCount = 0;
    static int[][] matrix;
    static int n;

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
        fold(0, 0, n);

        System.out.println(zeroCount);
        System.out.println(oneCount);
    }

    public static void fold(int xStart, int yStart, int depth) {
        if(xStart+depth > n || yStart+depth > n) {
            return;
        }

        int start = matrix[yStart][xStart];
        boolean complete = true;
        for (int i = yStart; i < yStart + depth; i++) {
            for (int j = xStart; j < xStart + depth; j++) {
                if (start != matrix[i][j]) {
                    complete = false;
                }
            }
        }
        if (complete) {
            if(start == 0) {
                zeroCount++;
            }else{
                oneCount++;
            }
            return;
        }

        int nextDepth = depth/2;
        fold(xStart, yStart, nextDepth);
        fold(xStart + nextDepth, yStart, nextDepth);
        fold(xStart, yStart + nextDepth, nextDepth);
        fold(xStart + nextDepth, yStart + nextDepth, nextDepth);
    }
}
