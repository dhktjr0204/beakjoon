import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class num9372 {
    static ArrayList<Integer> list[];
    static int cnt;
    static boolean[] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;

        int T=Integer.parseInt(br.readLine());
        while(T-->0){
            st=new StringTokenizer(br.readLine());
            int N=Integer.parseInt(st.nextToken());
            int M=Integer.parseInt(st.nextToken());

            list=new ArrayList[N+1];
            visit=new boolean[N+1];
            for(int i=0;i<=N;i++){
                list[i]=new ArrayList<>();
            }
            for(int i=0;i<N;i++){
                st=new StringTokenizer(br.readLine());
                int a=Integer.parseInt(br.readLine());
                int b=Integer.parseInt(br.readLine());

                list[a].add(b);
                list[b].add(a);
            }
            sb.append(bfs()+"\n");
        }
        System.out.println(sb.toString());
    }
    public static int bfs(){
        Queue<Integer> q=new LinkedList<Integer>();
        q.add(1);
        visit[1]=true;
        if(!q.isEmpty()){
            int node=q.poll();
            for (Integer i : list[node]) {
                if(!visit[i]){
                    q.add(i);
                    visit[i]=true;
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
