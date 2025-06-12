package lv2;

public class 방문길이 {
    static int[] dx = {-1,0,1,0};
    static int[] dy= {0, -1, 0, 1};
    public int solution(String dirs) {
        int answer = 0;
        boolean[][][] visited = new boolean[11][11][4];
        int d=0;
        int x=5;
        int y=5;
        for(char c: dirs.toCharArray()){
            if(c == 'U'){
                d =3;
            }else if(c=='D') {
                d=1;
            }else if(c=='L') {
                d=0;
            }else{
                d=2;
            }

            int nx = x + dx[d];
            int ny = y +dy[d];
            if(0<=nx && nx<11 && 0<=ny && ny<11) {
                if(!visited[ny][nx][d]) {
                    visited[ny][nx][d] = true;
                    d = (d%2)==0 ? 2-d : 4-d;
                    visited[y][x][d] = true;
                    answer++;
                }
                x=nx;
                y=ny;
            }
        }
        return answer;
    }
}
