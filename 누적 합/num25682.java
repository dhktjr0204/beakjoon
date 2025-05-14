package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num25682 {
    static int n, m,k;
    static String[] chess;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        chess = new String[n];

        for (int i = 0; i < n; i++) {
            chess[i] = br.readLine();
        }

        System.out.println(Math.min(minimalBoard('B'), minimalBoard('W')));
    }

    public static int minimalBoard(char color) {
        int[][] sumChess = new int[n+1][m+1];
        int cnt = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
            int value = 0;
            for(int j=0; j<m; j++){
                if((i+j)%2 ==0) {
                    // 색이 같아야됨 (첫번째로 시작하는 색깔)
                    value = chess[i].charAt(j) == color ? 0 : 1;
                }else{
                    // 색이 달라야됨(두번째는 다른색)
                    value = chess[i].charAt(j) == color ? 1 : 0;
                }

                sumChess[i+1][j+1] = sumChess[i][j+1] + sumChess[i+1][j] - sumChess[i][j] + value;
            }
        }

        for(int i=1; i<=n-k+1; i++) {
            for(int j=1; j<=m-k+1; j++) {
                cnt = Math.min(cnt, sumChess[i+k-1][j+k-1] - sumChess[i-1][j+k-1] - sumChess[i+k-1][j-1] + sumChess[i-1][j-1]);
            }
        }
        return cnt;
    }
}
