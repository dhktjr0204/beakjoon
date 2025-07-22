package gold;

import java.util.Scanner;

public class num10026 {
    static boolean[][] visited;
    static String[] arr;
    static int n;
    static int count = 0;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1,};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        int countResult = printCount(false);
        int weakCountResult = printCount(true);
        System.out.println(countResult + " " + weakCountResult);
    }

    public static int printCount(boolean isColorWeakness) {
        visited = new boolean[n][n];
        count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    visited[i][j] = true;
                    count++;
                    dfs(j, i, arr[i].charAt(j), isColorWeakness);
                }
            }
        }
        return count;
    }

    public static void dfs(int x, int y, char color, boolean isColorWeakness) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (0 <= nx && nx < n && 0 <= ny && ny < n) {
                if (!visited[ny][nx] && validateColor(color, arr[ny].charAt(nx), isColorWeakness)) {
                    visited[ny][nx] = true;
                    dfs(nx, ny, color, isColorWeakness);
                }
            }
        }
    }

    public static boolean validateColor(char color, char validateColor, boolean isColorWeakness) {
        if (!isColorWeakness) {
            return color == validateColor;
        } else {
            if (color == 'B') {
                return color == validateColor;
            } else {
                return validateColor != 'B';
            }
        }
    }
}