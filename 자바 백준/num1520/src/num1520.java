import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num1520 {
    private static int[][] map;
    private static int[][] dp;
    private static int m,n;

    private static int[] dx={-1,0,1,0};
    private static int[] dy={0,1,0,-1};
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(br.readLine());

        m=Integer.parseInt(st.nextToken());
        n=Integer.parseInt(st.nextToken());

        map=new int[m+1][n+1];
        dp=new int[m+1][n+1];

        for(int i=1;i<=m;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=1;j<=n;j++){
                map[i][j]=Integer.parseInt(st.nextToken());
                dp[i][j]=-1;
            }
        }
        System.out.println(dfs(1,1));
    }
    public static int dfs(int x,int y){
        if(x==m&&y==n){
            return 1;
        }

        if(dp[x][y]!=-1){
            return dp[x][y];
        }else{
            dp[x][y]=0;
            for(int i=0;i<dx.length;i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                //위로 이동 아래로 이동 오른쪽으로 이동 왼쪽으로 이동
                if (nx < 1 || ny < 1 || nx > m || ny > n)
                    continue;
                //만약에 범위에 해당 안될시 다른 쪽으로 이동해야됨
                //이전에 방문했는지를 체크해줄 필요가 없다
                //내리막길로 이동한 순간 다시 오르막으로 올 일이 없기 때문에(내림차순이라)
                if(map[x][y]>map[nx][ny]){//만약 현재의 위치의 숫자가 다음 이동할 곳의 숫자보다 크다면
                    dp[x][y]+=dfs(nx,ny);//위치 이동 및 위치 저장
                    //원래 계산했던 것을 기억해두고 이전에 했던 계산을 다시 꺼내주는 역할을 한다.
                }
            }
        }
        return dp[x][y];
        //이미 와봤던 경로라면 계산된 경로의 수를 return
    }
}
