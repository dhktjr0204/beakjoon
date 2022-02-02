import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class dot{
    int x;
    int y;

    public dot(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Edge implements Comparable<Edge>{
    int s;
    int e;
    int v;

    public Edge(int s, int e, int v) {
        this.s = s;
        this.e = e;
        this.v = v;
    }

    @Override
    public int compareTo(Edge o) {
        return o.v>-v?-1:1;
    }
}
public class num17472 {
    static int[] dx={0,0,1,-1};
    static int[] dy={1,-1,0,0};
    static int n,m;
    static int [][]map;
    static boolean [][]visit;
    static int parent[];
    static int island=0;
    static int result=0;
    static ArrayList<Edge> edgeList;
    static int bridge_count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;


        n=Integer.parseInt(br.readLine());
        m=Integer.parseInt(br.readLine());

        map=new int[n][m];
        visit=new boolean[n][m];

        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                map[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(map[i][j]==1 && !visit[i][j]){
                    island++;
                    bfs(new dot(i,j));
                }
            }
        }

        visit=new boolean[n][m];
        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                if(map[i][j]!=0)
                    makeBridge(new dot(i,j),map[i][j]);
            }
        }
        parent=new int[island+1];

        for(int i=0;i<parent.length;i++){
            parent[i]=i;
        }
        for(int i=0;i<edgeList.size();i++){
            Edge edge=edgeList.get(i);
            if(find(edge.s)!=find(edge.e)){
                result+=edge.v;
                union(edge.s,edge.e);
                bridge_count++;
            }
        }
        if(result==0||bridge_count!=island-1) {
            System.out.println(-1);
        }else{
            System.out.println(result);
        }


    }
    static void bfs(dot d){
        Queue<dot> q=new LinkedList<dot>();
        visit[d.x][d.y]=true;
        map[d.x][d.y]=island;
        q.add(d);
        if(!q.isEmpty()){
            dot t=q.poll();
            int x=t.x;
            int y=t.y;

            for(int i=0;i<4;i++){
                int newx=x+dx[i];
                int newy=y+dy[i];

                if(newx>=0 && newx<n &&newy<m && newy>0){
                    if(map[newx][newy]==1 && !visit[newx][newy]){
                        q.add(new dot(newx,newy));
                        map[newx][newy]=island;
                        visit[newx][newy]=true;
                    }
                }
            }
        }
    }


    public static void  makeBridge(dot d,int num){
        int x2=d.x;
        int y2=d.y;
        int length=0;

        for(int i=0;i<4;i++){
            while(true){
                x2+=dx[i];
                y2+=dy[i];

                if(x2>=0 && x2<n && y2>=0 && y2<m){
                    if(map[x2][y2]==num){
                        length=0;
                        x2=d.x;
                        y2=d.y;
                        break;
                    }else if(map[x2][y2]==0){
                        length++;
                    }else{
                        if(length>1){
                            edgeList.add(new Edge(num,map[x2][y2],length));
                        }
                        length = 0;
                        x2 = d.x;
                        y2 = d.y;
                        break;
                    }
                } else {
                    length = 0;
                    x2 = d.x;
                    y2 = d.y;
                    break;
                }
            }
        }

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
