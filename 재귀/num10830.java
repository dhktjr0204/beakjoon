package gold;
import java.util.*;
import java.io.*;
public class num10830 {
    static long[][] matrix;
    static int n;
    static long m;
    static int num = 1000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Long.parseLong(st.nextToken());

        matrix = new long[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Long.parseLong(st.nextToken());
            }
        }

        long[][] result = dfs(m);
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(result[i][j] +" ");
            }
            System.out.println();
        }
    }

    public static long[][] dfs(long count) {
        if (count == 0) {
            long[][] identity = new long[n][n];
            for (int i = 0; i < n; i++) {
                identity[i][i] = 1;
            }
            return identity;
        }
        if (count == 1) {
            long[][] base = new long[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    base[i][j] = matrix[i][j] % num;
                }
            }
            return base;
        }
        if (count == 2) {
            return calculate(matrix, matrix);
        }

        long[][] temp = dfs(count / 2);
        if (count % 2 == 0) {
            return calculate(temp, temp);
        } else {
            return calculate(calculate(temp, temp), matrix);
        }
    }

    public static long[][] calculate(long[][] tempMatrix1, long[][] tempMatrix2) {
        long[][] resultSet = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                long result = 0;
                for (int k = 0; k < n; k++) {
                    result += (tempMatrix1[i][k] * tempMatrix2[k][j]) % num;
                }
                resultSet[i][j] = result % num;
            }
        }
        return resultSet;
    }
}