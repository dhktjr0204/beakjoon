import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class num15681 {
    static int n,r,q;
    static int dp[];
    static ArrayList<ArrayList<Integer>> graph;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb=new StringBuilder();
        st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int r=Integer.parseInt(st.nextToken());
        int q=Integer.parseInt(st.nextToken());
        graph=new ArrayList<>();

        dp=new int[n+1];

        for(int i=0;i<=n;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<n-1;i++){
            st=new StringTokenizer(br.readLine());
            int u=Integer.parseInt(st.nextToken());
            int v=Integer.parseInt(st.nextToken());
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        buildTree(r,-1);
        for(int i=0;i<q;i++){
            int u=Integer.parseInt(br.readLine());
            sb.append(dp[u]+"\n");
        }

    }
    static int buildTree(int cur,int parent){
        if(dp[cur]!=0){
            return dp[cur];
        }
        dp[cur]=1;

        for (int child : graph.get(cur)) {
            if(parent!=child){
                dp[cur]+=buildTree(child,cur);
            }
        }
        return dp[cur];
    }
}
