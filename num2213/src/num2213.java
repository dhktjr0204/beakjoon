import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class num2213 {
    static int n;
    static int[] arr,dp,selected;
    static ArrayList<ArrayList<Integer>> list=new ArrayList<>();
    static ArrayList<ArrayList<Integer>> tree=new ArrayList<>();
    static PriorityQueue<Integer> pq=new PriorityQueue<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        n=Integer.parseInt(br.readLine());
        arr=new int[n+1];
        dp=new int[n+1];
        selected=new int[n+1];

        for(int i=0;i<=n;i++){
            list.add(new ArrayList<>());
            tree.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            list.get(a).add(b);
            list.get(b).add(a);
        }
        buildTree(1,-1);
        int t1=dp(1,0);
        int t2=dp(1,1);
        if(t1<t2){
            selected[1]=1;
        }else{
            selected[1]=0;
        }
    }
    static void buildTree(int cur,int parent){
        for(int child:list.get(cur)){
            if(child!=parent){
                tree.get(cur).add(child);
                buildTree(child,cur);
            }
        }
    }

    static int dp(int cur,int include){
        int ans=0;

        if(include==1){
            for(int next:tree.get(cur)){
                ans+=dp(next,0);
            }
            return ans+arr[cur];
        }
        else{
            for(int next:tree.get(cur)){
                int t1=dp(next,0);
                int t2=dp(next,1);

                if(t1<t2){
                    selected[next]=1;
                }else{
                    selected[next]=0;
                }
                ans+=Math.max(t1,t2);
            }
            return ans;
        }
    }
    static void trace(int cur,int include){
        if(include==1){
            pq.offer(cur);
            for(int next:tree.get(cur)){
                trace(next,0);
            }
        }else if(include==0){
            for(int next:tree.get(cur)){
                trace(next,selected[next]);
            }
        }
    }
}
