package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class num15651 {
    static int n, m;
    static Stack<Integer> arr = new Stack<>();
    static StringBuilder sb=new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        dfs();
    }

    public static void dfs(){
        if(arr.size()==m){
            for(int a: arr){
                sb.append(a).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=1;i<=n;i++){
            arr.add(i);
            dfs();
            arr.pop();
        }
    }
}
