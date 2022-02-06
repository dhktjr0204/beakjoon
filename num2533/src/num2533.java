import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class num2533 {
    static int n;
    static int[][] dp;
    static ArrayList<ArrayList<Integer>> list=new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        n=Integer.parseInt(br.readLine());
        dp=new int[n+1][2];
        for(int i=0;i<=n;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<n-1;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());

            list.get(a).add(b);
            list.get(b).add(a);
        }
        dp(1,-1);

        bw.write(String.valueOf(Math.min(dp[1][0],dp[1][1])));
    }
    static void dp(int cur,int parent){
        dp[cur][0]=0;
        dp[cur][1]=0;

        for(int next:list.get(cur)){
            if(next!=parent){
                dp(next,cur);
                dp[cur][0]+=dp[next][1];
                dp[cur][1]+=Math.min(dp[next][0],dp[next][1]);
            }
        }
    }
}
