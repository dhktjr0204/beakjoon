import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class num11404 {
    static int INF=1000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        int [][]arr=new int[N+1][N+1];

        for(int i=0;i<=N;i++){
            for(int j=0;j<=N;j++){
                arr[i][j]=INF;

                if(i==j){
                    arr[i][j]=0;
                }
            }
        }

        for(int i=0;i<M;i++){
            st=new StringTokenizer(br.readLine());
            int A=Integer.parseInt(st.nextToken());
            int B=Integer.parseInt(st.nextToken());
            int C=Integer.parseInt(st.nextToken());

            arr[A][B]=Math.min(arr[A][B],C);
        }

        for(int k=1;k<=N;k++){
            for(int i=1;i<=N;i++){
                for(int j=1;j<=N;j++){
                    if(arr[i][j]>arr[i][k]+arr[k][j]){
                        arr[i][j]=arr[i][k]+arr[k][j];
                    }
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                if(arr[i][j]==INF){
                    arr[i][j]=0;
                }
                sb.append(arr[i][j]+" ");
            }
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
