import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


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


public class num1753 {
    private static  int v,e,k;
    private static ArrayList<Node>[] list;
    private static int[] dist;
    private static int INF=Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        v=sc.nextInt();
        e=sc.nextInt();
        k=sc.nextInt();
        list=new ArrayList[v+1];
        dist=new int[v+1];

        Arrays.fill(dist,INF);//dist 배열 INF로 채우기
        dist[k]=0;
        for(int i=0;i<e;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            int w=sc.nextInt();
            list[u].add(new Node(v,w));
        }
        dijkstra();
        for(int i=1;i<=v;i++){
            if(dist[i]==INF){
                System.out.println("INF");
            }else{
                System.out.println(dist[i]);
            }
        }
    }

    public static void dijkstra(){
        PriorityQueue<Node> queue=new PriorityQueue<>();
        queue.add(new Node(k,0));
        while(!queue.isEmpty()){
            Node node=queue.poll();
            int end=node.end;
            int weight=node.weight;
            if(dist[end]<weight){
                continue;
            }
            for(int i=0;i<list[end].size();i++){
                int nextend=list[end].get(i).end;
                int nextweigth=list[end].get(i).weight+weight;
                if(dist[nextend]>nextweigth){
                    dist[nextend]=nextweigth;
                    queue.add(new Node(nextend,nextweigth));
                }
            }
        }
    }


}
