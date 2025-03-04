package softeer;

import java.io.*;
import java.util.*;

public class 나무조경 {
    static boolean[][] visited;
    static int[] dx={0,1};
    static int[] dy={1,0};
    static int answer=-1;

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[][] matrix=new int[n][n];
        visited=new boolean[n][n];

        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());

            for(int j=0; j<n; j++){
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int maxDepth=4;
        if(n==2){
            maxDepth=2;
        }

        dfs(0,0,matrix,maxDepth);

        System.out.println(answer);
    }

    public static void dfs(int depth, int result, int[][] matrix, int maxDepth){
        if(depth==maxDepth){
            answer=Math.max(answer,result);
            return;
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0; j<matrix.length; j++){
                if(visited[i][j]) continue;

                for(int k=0;k<2;k++){
                    int nx=i+dx[k];
                    int ny=j+dy[k];

                    if(nx>=0 && nx<matrix.length && ny>=0 && ny<matrix.length && !visited[nx][ny]){
                        visited[i][j]=true;
                        visited[nx][ny]=true;
                        dfs(depth+1, result+matrix[i][j]+matrix[nx][ny], matrix, maxDepth);
                        visited[i][j]=false;
                        visited[nx][ny]=false;
                    }
                }
            }
        }
    }
}