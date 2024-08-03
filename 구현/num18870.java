package silver;

import java.io.*;
import java.util.*;

public class num18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine());

        Map<Integer,Integer> map=new HashMap<>();
        int[] origin=new int[n];
        int[] sorted=new int[n];
        for(int i=0;i<n;i++){
            int num=Integer.parseInt(st.nextToken());
            origin[i]=num;
            sorted[i]=num;
        }
        Arrays.sort(sorted);

        int rank=0;
        for(int v: sorted){
            if(!map.containsKey(v)){
                map.put(v, rank);
                rank++;
            }
        }


        StringBuilder sb=new StringBuilder();
        for(int v: origin){
            int ranking=map.get(v);
            sb.append(ranking).append(' ');
        }
        System.out.println(sb);
    }
}
