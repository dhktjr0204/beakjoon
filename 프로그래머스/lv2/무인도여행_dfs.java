package lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 무인도여행_dfs {
    public static int[] dx = new int[]{0, -1, 0, 1};
    public static int[] dy = new int[]{-1, 0, 1, 0};
    public static boolean[][] visited;

    public int[] solution(String[] maps) {

        visited = new boolean[maps.length][maps[0].length()];

        ArrayList<Integer> days = new ArrayList<>();

        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[0].length(); j++) {
                if (!visited[i][j] && maps[i].charAt(j) != 'X') {
                    int day = dfs(maps, visited, i, j);
                    days.add(day);
                }
            }
        }

        Collections.sort(days);
        return days.stream().mapToInt(Integer::intValue).toArray();
    }

    public int dfs(String[] maps, boolean[][] visited, int x, int y) {
        if ( x < 0 || x >= maps.length || y < 0 || y >= maps[0].length() ||
                visited[x][y] || maps[x].charAt(y) == 'X') {
            return 0;
        }

        visited[x][y] = true;
        int day = maps[x].charAt(y)-'0';

        for (int i = 0; i < 4; i++) {
            day += dfs(maps, visited, x + dx[i], y + dy[i]);
        }

        return day;
    }

    public static void main(String[] args) {
        무인도여행_dfs problem = new 무인도여행_dfs();
        System.out.println(Arrays.toString(problem.solution(new String[]{"X591X", "X1X5X", "X231X", "1XXX1"})));
    }
}
