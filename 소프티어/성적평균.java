package softeer;

import java.io.*;
import java.util.*;

public class 성적평균 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());

        st=new StringTokenizer(br.readLine());
        int[] score=new int[N];

        for(int i=0;i<N;i++){
            score[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<K;i++){
            st=new StringTokenizer(br.readLine());

            int sum=0;
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());

            for(int j=x-1; j<y;j++){
                sum+=score[j];
            }

            System.out.println(String.format("%.2f", ((double) sum /(y-x+1))));
        }
    }
}
