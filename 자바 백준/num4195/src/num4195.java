import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class num4195 {
    static int[] parent;
    static int[] level;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        int T=Integer.parseInt(br.readLine());

        while(T-->0){
            int F=Integer.parseInt(br.readLine());

            parent=new int[F*2];
            level=new int[F*2];

            for(int i=0;i<F;i++){
                parent[i]=i;
                level[i]=1;
            }
            int idx=0;
            Map<String,Integer> map=new HashMap<>();
            for(int i=0;i<F;i++) {
                st = new StringTokenizer(br.readLine());
                String a = st.nextToken();
                String b = st.nextToken();
                if(!map.containsKey(a)){
                    map.put(a,idx++);
                }
                if(!map.containsKey(b)){
                    map.put(b,idx++);
                }
                sb.append(union(map.get(a),map.get(b))+"\n");
            }
            bw.write(sb.toString());
            bw.flush();
            bw.close();
            br.close();
    }
    }
    public static int find(int x){
        if(x==parent[x]){
            return x;
        }
        return parent[x]=find(parent[x]);
    }

    public static int union(int a,int b){
        a=find(a);
        b=find(b);

        if(a!=b){
            parent[b]=a;
            level[a]+=level[b];

            level[b]=1;
        }
        return level[a];

        }
}
