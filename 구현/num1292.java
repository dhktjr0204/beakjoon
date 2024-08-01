package bronze.구현;

import java.io.*;
import java.util.*;

public class num1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        List<Integer> arr=new ArrayList<>();
        for(int i=1;i<m+1;i++){
            for(int j=0;j<i;j++){
                arr.add(i);
            }
        }
        int answer=0;
        for(int i=n-1;i<m;i++){
            answer+=arr.get(i);
        }
        System.out.println(answer);
    }
}
