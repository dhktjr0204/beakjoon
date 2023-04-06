import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class num1949 {
    static int N;
    static ArrayList<ArrayList<Integer>> list=new ArrayList<>();
    static int [][]dp;
    static int [] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;

        N=Integer.parseInt(br.readLine());
        dp=new int[N+1][2];
        arr=new int[N+1];
        st=new StringTokenizer(br.readLine());
        for(int i=1;i<N+1;i++){
            arr[i]=Integer.parseInt(st.nextToken());

        }
        for(int i=0;i<N+1;i++) {
            list.add(new ArrayList<>());
        }
        for(int i=0;i<N-1;i++){
            st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            list.get(a).add(b);
            list.get(b).add(a);
        }

        dfs(1,0);

        sb.append(String.valueOf(Math.max(dp[1][0],dp[1][1])));
        System.out.println(sb);
    }
    static void dfs(int cur,int parent){
        for(int child:list.get(cur)){
            if(child!=parent){
                dfs(child,cur);
                dp[cur][0]+=Math.max(dp[child][0],dp[child][1]);
                dp[cur][1]+=dp[child][0];
            }
        }
        dp[cur][1]+=arr[cur];
    }
}
