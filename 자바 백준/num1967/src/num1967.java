import java.util.ArrayList;
import java.util.Scanner;

public class num1967 {
    public static class Node{
        int e;
        int cost;

        public Node(int e, int cost) {
            this.e = e;
            this.cost = cost;
        }
    }

    static ArrayList<Node>[] list;
    static boolean visited[];
    static int max=0;
    static int node=0;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        list=new ArrayList[n+1];
        for(int i=1;i<=n;i++){
            list[i]=new ArrayList<>();
        }

        for(int i=1;i<n;i++){
            int s=sc.nextInt();
            int e=sc.nextInt();
            int cost=sc.nextInt();
            list[s].add(new Node(e,cost));
            list[e].add(new Node(s,cost));
        }
        visited=new boolean[n+1];
        visited[1]=true;
        dfs(1,0);

        visited=new boolean[n+1];
        visited[node]=true;
        dfs(node,0);

        System.out.println(max);
    }
    public static void dfs(int x,int len){
        if(len>max){
            max=len;
            node=x;
        }
        for(int i=0;i<list[x].size();i++){
            Node n=list[x].get(i);
            if(!visited[n.e]){
                visited[n.e]=true;
                dfs(n.e,n.cost+len);
            }
        }
    }
}
