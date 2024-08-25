package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class num15650 {
    static int n, m;
    static Stack<Integer> arr = new Stack<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        dfs(1);
    }

    public static void dfs(int depth) {
        if(arr.size()==m){
            for(int a: arr){
                System.out.print(a+" ");
            }
            System.out.println();
            return;
        }

        for (int i = depth; i <= n; i++) {
            if (!arr.contains(i)) {
                arr.add(i);
                dfs(i+1);
                arr.pop();
            }
        }
    }
}
