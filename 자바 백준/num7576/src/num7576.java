import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class num7576 {
    public static int[][] box;
    public static boolean[][] visited;
    public static int N;
    public static int M;

    public static int[] dx={-1,0,1,0};
    public static int[] dy={0,-1,0,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());

        for(int i=0;i<N;i++){
            String s= br.readLine();
            for(int j=0;j<N;j++){
                box[i][j]=s.charAt(j)-'0';
                visited[i][j]=false;
            }
        }
        visited[0][0]=true;
        System.out.println(BFS(0,0));
    }
    public static int BFS(int x,int y){
        Queue<int []>q=new LinkedList<>();

        q.add(new int[] {x,y});
        if(!q.isEmpty()){
            int[] now=q.poll();
            int nowx=now[0];
            int nowy=now[1];

            for(int i=0;i<4;i++){
                int nextx=nowx+dx[i];
                int nexty=nowy+dy[i];

                if(nextx<N&&nexty<M&&nexty>=0&&nextx>=0){
                    if(box[nextx][nexty]==0){
                        q.add(new int[] {nextx,nexty});

                        box[nextx][nexty]=box[nowx][nowy]+1;
                    }
                }
            }
        }
        int result=Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(box[i][j]==0)
                    return -1;
                result= Math.max(result,box[i][j]);
            }
        }
        if(result==1){
            return 0;
        }
        else
            return result-1;
    }
}
