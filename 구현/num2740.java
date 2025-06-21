package silver;

import java.util.*;
import java.io.*;

public class num2740 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] matrix1 = new int[n][m];
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++) {
                matrix1[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(br.readLine());
        int m2 = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] matrix2 = new int[m2][k];

        for(int i=0; i<m2; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j =0; j<k; j++) {
                matrix2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] matrix3 = new int[n][k];
        for(int i=0; i<n; i++) {
            for(int j=0; j<k; j++) {
                int result = 0;
                for(int z=0; z<m; z++) {
                    result += matrix1[i][z] * matrix2[z][j];
                }
                matrix3[i][j] += result;
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<k; j++) {
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }
    }
}