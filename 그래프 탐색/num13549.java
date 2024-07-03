package gold;

import java.io.*;
import java.util.*;

public class num13549 {
    static int MAX=100001;
    static int k;
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        k=Integer.parseInt(st.nextToken());
        dp=new int[MAX];
        Arrays.fill(dp,-1);

        bfs(n);
    }
    static void bfs(int v){
        Queue<Integer> q = new LinkedList<>();
        dp[v]=0;
        q.add(v);
        while(!q.isEmpty()){
            System.out.println(q);
            int x=q.poll();
            if (x==k){
                System.out.println(dp[x]);
                break;
            }
            if (x*2<MAX && dp[x*2]==-1){
                q.add(x*2);
                dp[x*2]=dp[x];
            }
            if (x-1>=0 && dp[x-1]==-1){
                q.add(x-1);
                dp[x-1]=dp[x]+1;
            }
            if (x+1<MAX && dp[x+1]==-1){
                q.add(x+1);
                dp[x+1]=dp[x]+1;
            }
        }
    }
}
