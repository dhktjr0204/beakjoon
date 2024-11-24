package lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class 무인도여행 {
    public static int[] dx = {0,-1,0,1};
    public static int[] dy = {-1,0,1,0};
    public static boolean[][] visited;

    public int[] solution(String[] maps) {
        int[] answer = {};

        visited=new boolean[maps.length][maps[0].length()];

        ArrayList<Integer> days=new ArrayList<>();

        for(int i=0; i<maps.length; i++){
            for(int j=0; j<maps[0].length(); j++){
                if(maps[i].charAt(j)!='X' && !visited[i][j]){
                    int day = bfs(maps, i, j);
                    days.add(day);
                }
            }
        }
        if(days.isEmpty()){
            return new int[]{-1};
        }

        Collections.sort(days);

        answer=new int[days.size()];

        for(int i=0; i<days.size(); i++){
            answer[i]=days.get(i);
        }

        return answer;
    }

    public int bfs(String[] maps, int x, int y){
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{x,y});

        int day=maps[x].charAt(y)-'0';
        visited[x][y]=true;

        while(!q.isEmpty()){
            int[] currentLocation=q.poll();
            int qx=currentLocation[0];
            int qy=currentLocation[1];

            for(int i=0; i<4; i++){
                int nx=qx+dx[i];
                int ny=qy+dy[i];

                if(nx>=0 && nx<maps.length && ny>=0 && ny<maps[0].length()){
                    if(maps[nx].charAt(ny)!='X' && !visited[nx][ny]){
                        visited[nx][ny]=true;
                        day += maps[nx].charAt(ny)-'0';
                        q.add(new int[]{nx,ny});
                    }
                }
            }
        }

        return day;
    }

    public static void main(String[] args) {
        무인도여행 problem = new 무인도여행();
        System.out.println(Arrays.toString(problem.solution(new String[]{"X591X", "X1X5X", "X231X", "1XXX1"})));
    }
}
