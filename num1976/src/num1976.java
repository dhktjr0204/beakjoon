import java.io.*;
import java.util.StringTokenizer;

public class num1976 {
    static int[] parent;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N=Integer.parseInt(br.readLine());
        int M=Integer.parseInt(br.readLine());

        parent=new int[N+1];
        for(int i=1;i<=N;i++){
            parent[i]=i;
        }
        for(int i=1;i<=N;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<=N;i++){
                int a=Integer.parseInt(st.nextToken());
                if(a==1)
                    union(i,j);
            }
        }
        st=new StringTokenizer(br.readLine());
        int start=find(Integer.parseInt(st.nextToken()));
        for(int i=1;i<M;i++){
            int now=Integer.parseInt(st.nextToken());

            if(start!=find(now)){
                bw.write("NO\n");
                bw.flush();
                bw.close();
                br.close();
                return;
            }
            bw.write("YES\n");
        }

    }
    public static int find(int x){
        if(x==parent[x]){
            return x;
        }
        return parent[x]=find(parent[x]);
    }
    public static void union(int x,int y){
        x=find(x);
        y=find(y);

        if(x!=y){
            if(x<y){
                parent[y]=x;
            }else
                parent[x]=y;
        }
    }
}
