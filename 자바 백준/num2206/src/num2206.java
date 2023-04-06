import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class num2206 {
    public static int dx[]={-1,0,1,0};
    public static int dy[]={0,-1,0,1};

    public static int N,M,ans;
    public static int map[][];
    public static boolean visited[][][];

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());

        map=new int[N][M];
        visited=new boolean[2][N][M];

        for(int i=0;i<N;i++){
            String s=br.readLine();
            for(int j=0;j<M;j++){
                map[i][j]=s.charAt(j)-'0';
            }
        }

        ans=Integer.MAX_VALUE
        BFS();

        if(ans==Integer.MAX_VALUE) System.out.println(-1);
        else System.out.println(ans);

    }
    public static void BFS(){
        Queue<Node> q=new LinkedList<>();

        q.offer(new Node(0,0,1,0));

        while(!q.isEmpty()){
            Node node=q.poll();
            int row = node.row;
            int col = node.col;
            int cnt = node.cnt;
            int jump = node.jump;

            if(row==N-1 && col==M-1){
                ans=Math.min(ans,cnt);
                continue;
            }
            for (int i = 0; i < 4; i++) {
                int nr = row + dx[i];
                int nc = col + dy[i];

                if(isBoundary(nr,nc)){
                    if(jump==1){
                        if(!visited[jump][nr][nc] &&map[nr][nc]==0){
                            visited[jump][nr][nc]=true;
                            q.offer(new Node(nr,nc,cnt+1,jump));
                        }
                    }else{
                        if(map[nr][nc]==1){
                            if(!visited[jump+1][nr][nc]){
                                visited[jump+1][nr][nc]=true;
                                q.offer(new Node(nr,nc,cnt+1,jump+1));
                            }
                        }else if(map[nr][nc]==0){
                            if(!visited[jump][nr][nc]){
                                visited[jump][nr][nc]=true;
                                q.offer(new Node(nr,nc,cnt+1,jump));
                            }
                        }
                    }
                }

            }
        }

    }
    public static boolean isBoundary(int row,int col){
        return (row>=0 && row<N) &&(col>=0 && col<M);
    }

    static class Node{
        int row;
        int col;
        int cnt;
        int jump;

        public Node(int row, int col, int cnt, int jump) {
            super();
            this.row = row;
            this.col = col;
            this.cnt = cnt;
            this.jump = jump;
        }
    }
}
