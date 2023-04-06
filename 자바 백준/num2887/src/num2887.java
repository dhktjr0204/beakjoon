import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
class Point{
    int num;
    int a;
    int b;
    int c;

    public Point(int num, int a, int b, int c) {
        this.num = num;
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
class Edge implements Comparable<Edge>{
    int start;
    int end;
    int weight;

    public Edge(int start, int end, int weight) {
        this.start = start;
        this.end = end;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge o) {
        return weight-o.weight;
    }
}

public class num2887 {
    static int parent[];
    static ArrayList<Edge> edgeList;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb=new StringBuilder();

        int N=Integer.parseInt(br.readLine());

        Point point[]=new Point[N];

        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            int a= Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());
            int c= Integer.parseInt(st.nextToken());
            point[i]=new Point(i,a,b,c);
        }
        edgeList=new ArrayList<>();

        Arrays.sort(point,(p1,p2)->p1.a-p2.a);
        for(int i=0;i<N-1;i++){
            int weight=Math.abs(point[i].a-point[i+1].a);
            edgeList.add(new Edge(point[i].num,point[i+1].num,weight));
        }

        Arrays.sort(point,(p1,p2)->p1.b-p2.b);
        for(int i=0;i<N-1;i++){
            int weight=Math.abs(point[i].b-point[i+1].b);
            edgeList.add(new Edge(point[i].num,point[i+1].num,weight));
        }

        Arrays.sort(point,(p1,p2)->p1.c-p2.c);
        for(int i=0;i<N-1;i++){
            int weight=Math.abs(point[i].c-point[i+1].c);
            edgeList.add(new Edge(point[i].num,point[i+1].num,weight));
        }

        parent=new int[N];
        for(int i=0;i<N;i++){
            parent[i]=i;
        }
        Collections.sort(edgeList);

        int ans=0;
        for(int i=0;i<edgeList.size();i++){
            Edge edge=edgeList.get(i);
            if(find(edge.start)!=find(edge.end)){
                ans+=edge.weight;
                union(edge.start, edge.end);
            }
        }
        sb.append(ans+"\n");
        System.out.println(sb);


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
