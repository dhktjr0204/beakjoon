import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class num1967 {
    static ArrayList<Integer[]> tree[];
    static boolean visited[];
    static int max=0;
    static int max_idx;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n=Integer.parseInt(br.readLine());
        if (n==1) {
            System.out.println(0);
            return;
        }

        tree=new ArrayList[n+1];
        for (int i=1; i<n+1; i++){
            tree[i]=new ArrayList<>();
        }

        for (int i=0; i<n-1; i++){
            st=new StringTokenizer(br.readLine());
            int parent=Integer.parseInt(st.nextToken());
            int child=Integer.parseInt(st.nextToken());
            int weight=Integer.parseInt(st.nextToken());
            tree[parent].add(new Integer[]{child, weight});
            tree[child].add(new Integer[]{parent, weight});
        }

        visited=new boolean[n+1];
        dfs(1,0);

        visited=new boolean[n+1];
        dfs(max_idx,0);

        System.out.println(max);

    }

    public static void dfs(int v, int value) {
        visited[v]=true;
        if(max<value){
            max=value;
            max_idx=v;
        }
        for(Integer[] info: tree[v]){
            int next=info[0];
            int weight=info[1];
            if(!visited[next]){
                dfs(next,value+weight);
            }
        }
    }
}
