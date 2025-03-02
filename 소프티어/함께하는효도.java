package softeer;

import java.io.*;
import java.util.*;


public class 함께하는효도 {
    static int[] dx={1,0,-1,0};
    static int[] dy={0,1,0,-1};

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());

        int[][] matrix=new int[n][n];

        for(int i=0; i<n; i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0; st.hasMoreTokens();j++){
                matrix[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(Arrays.deepToString(matrix));
        int[][] workerList=new int[m][2];

        for(int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());

            workerList[i]=new int[]{x-1,y-1};
        }

        System.out.println(Arrays.deepToString(workerList));
        int[] answer=new int[1];

        dfs(0,0, workerList[0][0], workerList[0][1], m, 0, workerList, matrix, answer);

        System.out.println(answer[0]);
    }

    static void dfs(int worker, int work, int x, int y, int m ,int sum, int[][] workerList, int[][] matrix, int[] answer){
        answer[0] = Math.max(answer[0], sum);

        if(work==3){
            if(worker+1<m){
                dfs(worker+1, 0, workerList[worker+1][0], workerList[worker+1][1], m, sum, workerList, matrix, answer);
            }
        }else{
            for(int i=0; i<4; i++){
                int nx=x+dx[i];
                int ny=y+dy[i];

                if(nx>=0 && nx<matrix.length && ny>=0 && ny<matrix.length){
                    int value= matrix[nx][ny];
                    matrix[nx][ny]=0;
                    dfs(worker, work+1, nx, ny, m, sum+value, workerList, matrix, answer);
                    matrix[nx][ny]=value;
                }
            }
        }
    }
}
