package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class num12865 {
    static class Bag {
        int weight;
        int value;

        Bag(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int maxWeight = Integer.parseInt(st.nextToken());


        List<Bag> bagList = new ArrayList<>();
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            bagList.add(new Bag(w, v));
        }

        int[][] dp = new int[n+1][maxWeight+1];

        for(int i=1; i<=n; i++) {
            for(int j=1; j<maxWeight; j++) {
                int weight = bagList.get(i).weight;
                int value = bagList.get(i).value;

                if(j<weight) {
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = Math.max(value+dp[i-1][j-weight], dp[i-1][j]);
                }
            }
        }

        System.out.println(dp[n][maxWeight]);
    }
}
