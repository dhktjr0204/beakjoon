import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
class Point{
    int num;
    double x;
    double y;

    public Point(int num, double x, double y) {
        this.num = num;
        this.x = x;
        this.y = y;
    }
}
class Edge implements Comparable<Edge>{
    int start;
    int end;
    double weight;

    public Edge(int start, int end, double weight) {
        this.start = start;
        this.end = end;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge o) {
        if(weight<o.weight){
            return -1;
        }
        return 1;
    }
}


public class num1774 {
    static int parent[];
    static ArrayList<Edge> edgeList;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;

        int N=Integer.parseInt(br.readLine());
        int M=Integer.parseInt(br.readLine());

        Point point[]=new Point[N+1];
        parent=new int[N+1];

        for(int i=1;i<=N;i++){
            st=new StringTokenizer(br.readLine());
            double a=Integer.parseInt(st.nextToken());
            double b=Integer.parseInt(st.nextToken());
            point[i]=new Point(i,a,b);
        }
        for(int i=0;i<M;i++){
            st=new StringTokenizer(br.readLine());
            int start=Integer.parseInt(st.nextToken());
            int end=Integer.parseInt(st.nextToken());
            union(start,end);
        }
        edgeList=new ArrayList<>();
        for(int i=1;i<=N;i++){
            for(int j=i+1;j<N;j++){
                double weight=distance(point[i],point[j]);
                edgeList.add(new Edge(point[i].num,point[j].num,weight));
            }
        }
        Collections.sort(edgeList);
        double ans=0;

        for(int i=0;i<edgeList.size();i++){
            Edge edge=edgeList.get(i);
            if(find(edge.start)!=find(edge.end)){
                ans+=edge.weight;
                union(edge.start,edge.end);
            }
        }
        sb.append(ans+"\n");
        System.out.println(sb);

    }

    public static double distance(Point p1,Point p2){
        return Math.sqrt(Math.pow(p1.x-p2.x,2)+Math.pow(p1.y-p2.y,2));
    }

    public static int find(int x){
        if(x==parent[x])
            return x;
        return parent[x]=find(parent[x]);
    }
    public static void union(int x,int y){
        x=find(x);
        y=find(y);

        if(x!=y){
            parent[y]=x;
        }
    }
}
