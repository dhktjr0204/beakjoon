package gold;

import java.util.Scanner;

public class num9663 {
    static int[] row;
    static int n;
    static int cnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        row = new int[n];

        dfs(0);
        System.out.println(cnt);
    }

    public static boolean isPromised(int x) {
        for (int i = 0; i < x; i++) {
            //같은 열에 있거나 대각선에 위치하면 안된다.
            if (row[i]==row[x] || Math.abs(row[x]-row[i])== Math.abs(x-i)){
                return false;
            }
        }
        return true;
    }

    public static void dfs(int idx) {
        if (idx == n) {
            cnt++;
            return;
        }
        for (int i = 0; i < n; i++) {
            row[idx] = i;
            if(isPromised(idx)){
                dfs(idx+1);
            }
        }
    }
}
