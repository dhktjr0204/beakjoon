package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] oilPrice = new int[n];
        int[] road = new int[n-1];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n-1; i++) {
            road[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            oilPrice[i] = Integer.parseInt(st.nextToken());
        }

        int distance = 0;
        int money = oilPrice[0];
        int totalPrice = road[0] * oilPrice[0];
        for(int i=1; i<n-1; i++) {
            if(oilPrice[i] < money) {
                totalPrice += distance*money;
                distance = road[i];
                money = oilPrice[i];
            }else{
                distance += road[i];
            }

            if(i == n-2) {
                totalPrice += distance*money;
            }
        }

        System.out.println(totalPrice);
    }
}
