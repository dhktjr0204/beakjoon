package pcce;

import java.util.Arrays;

public class 이웃한칸 {
    public static int[] dx=new int[]{1,0,-1,0};
    public static int[] dy=new int[]{0,1,0,-1};

    public int solution(String[][] board, int h, int w) {
        int answer = 0;

        for(int i=0;i<4;i++){
            int nx=h+dx[i];
            int ny=w+dy[i];

            if((nx>=0 && ny>=0) && (nx<board.length && ny<board[0].length)){
                if(board[nx][ny].equals(board[h][w])){
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        이웃한칸 problem = new 이웃한칸();
        System.out.println(problem.solution(new String[][]{{"blue", "red", "orange", "red"},
                {"red", "red", "blue", "orange"},
                {"blue", "orange", "red", "red"},
                {"orange", "orange", "red", "blue"}}, 1, 1));
    }
}

