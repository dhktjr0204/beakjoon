import java.util.ArrayList;
import java.util.Scanner;

public class num2606 {
    public static int n,m;
    public static boolean virus[];
    public static ArrayList<Integer> []arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        arr = new ArrayList[n + 1];
        virus = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            arr[u].add(v);
        }
        dfs(1);
        int count=0;
        for (int i = 1; i <=n; i++) {
            if (virus[i])
                count++;
        }

        System.out.println(count-1);
    }
    public static void dfs(int x){
        if(virus[x])
            return;
        virus[x]=true;
        for(int y:arr[x]){
            if(!virus[y])
                dfs(y);
        }
    }

}
