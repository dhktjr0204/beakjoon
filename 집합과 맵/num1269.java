package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class num1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());

        st=new StringTokenizer(br.readLine());
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(Integer.parseInt(st.nextToken()),1);
        }

        int cnt=0;

        st=new StringTokenizer(br.readLine());

        for(int i=0;i<m;i++){
            int num=Integer.parseInt(st.nextToken());
            if (map.containsKey(num)) {
                cnt++;
            }
        }

        System.out.println(n+m-2*cnt);
    }
}
