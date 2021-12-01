import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point{
    int x;
    int y;
    int cnt;

    Point(int x,int y){
        this.x=x;
        this.y=y;
        cnt=0;
    }

    public Point(int x, int y, int cnt) {
        this.x = x;
        this.y = y;
        this.cnt = cnt;
    }
}



public class num7562 {
    public static int[] dx={2,2,-2,-2,1,1,-1,-1};
    public static int[] dy={1,-1,1,-1,2,-2,2,-2};
    public static boolean[][] visited;
    public static int[][] arr;
    public static int I;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<T;i++){
            int I=Integer.parseInt(br.readLine());
            arr=new int[I][I];

            Point[] points=new Point[2];
            for(int j=0;j<2;j++) {
                int N = Integer.parseInt(br.readLine());
                int M = Integer.parseInt(br.readLine());
                points[j]=new Point(N,M);
                }
            sb.append(BFS(arr,points,I));
        }
    }
    public static int BFS(int [][] arr,Point[] points,int N){
        Queue<Point> q=new LinkedList<>();

        q.offer(points[0]);
        visited=new boolean[N][N];
        visited[points[0].x][points[0].y]=true;


        while(!q.isEmpty()){
            Point p=q.poll();

            if(p.x==points[1].x && p.y==points[1].y){
                return p.cnt;
            }
            for(int i=0;i<8;i++){
                int nextx=p.x+dx[i];
                int nexty=p.y+dy[i];

                if(nextx<0 && nexty<0 && nextx>=N && nexty>=N){
                    continue;
                }
                if(!visited[nextx][nexty]){
                    visited[nextx][nexty]=true;
                    q.offer(new Point(nextx,nexty,p.cnt+1));
                }
            }
        }
        return -1;
    }
}
