import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class num1504 {
    private static int e,n;
    private static ArrayList<Node>[] lists;
    private static int[] dist;
    private static int INF=200000000;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        n=sc.nextInt();//노드 개수
        e=sc.nextInt();//엣지 개수
        lists=new ArrayList[n+1];
        dist=new int[n+1];

        for(int i=1;i<=n;i++){
            lists[i]=new ArrayList<>();
        }

        for(int i=0;i<e;i++){
            int u=sc.nextInt();
            int v= sc.nextInt();
            int w=sc.nextInt();
            lists[u].add(new Node(v,w));
            lists[v].add(new Node(u,w));
        }
        int v1=sc.nextInt();
        int v2= sc.nextInt();

        long answer1=0;
        answer1+=dijkstra(1,v1);
        answer1+=dijkstra(v1,v2);
        answer1+=dijkstra(v2,n);

        long answer2=0;
        answer2=dijkstra(1,v2);
        answer2=dijkstra(v2,v1);
        answer2=dijkstra(v1,n);

        if(Math.min(answer1,answer2)>=INF){
            System.out.println(-1);
            return;
        }
        System.out.println(Math.min(answer1,answer2));

    }
    public static int dijkstra(int s,int e){
        dist=new int[n+1];
        Arrays.fill(dist,INF);
        dist[s]=0;
        PriorityQueue<Node> queue=new PriorityQueue<>();
        queue.add(new Node(s,0));
        while(!queue.isEmpty()){
            Node node=queue.poll();
            int v=node.end;
            int w=node.weight;
            if(dist[v]<w){
                continue;
            }
            for(int i=0;i<lists[v].size();i++){
                int nextv=lists[v].get(i).end;
                int nextw=lists[v].get(i).weight+w;
                if(dist[nextv]>nextw){
                    dist[nextv]=nextw;
                    queue.add(new Node(nextv,nextw));
                }
            }
        }
        return dist[e];
    }

}
class Node implements Comparable<Node>{
    int end,weight;

    public Node(int end, int weight) {
        this.end = end;
        this.weight = weight;
    }

    @Override
    public int compareTo(Node o) {
        return weight-o.weight;
    }
}
