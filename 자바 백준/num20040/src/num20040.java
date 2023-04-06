import java.io.*;
import java.util.StringTokenizer;

public class num20040 {
    static int parent[];
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        int n=Integer.parseInt(br.readLine());
        int m=Integer.parseInt(br.readLine());
        int res;
        parent=new int[n+1];

        for(int i=1;i<=n;i++){
            parent[i]=i;
        }

        for(int i=1;i<=m;i++){
            st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());

            if(!union(a,b)){
                res=i;
                break;
            }
        }

    }
    public static int find(int x){
        if(x==parent[x])
            return x;
        return parent[x]=find(parent[x]);
    }

    public static boolean union(int a,int b){
        a=find(a);
        b=find(b);

        if(a==b)
            return false;
        parent[b]=a;
        return true;
    }
}
