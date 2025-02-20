package softeer;

import java.io.*;
import java.util.*;

public class 강의실배정 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n=Integer.parseInt(br.readLine());

        int[][] classes=new int[n][2];

        for(int i=0; i<n; i++){
            st=new StringTokenizer(br.readLine());

            int s=Integer.parseInt(st.nextToken());
            int f=Integer.parseInt(st.nextToken());

            classes[i][0]=s;
            classes[i][1]=f;
        }
        Arrays.sort(classes, (a,b) -> a[1]==b[1] ? a[0]-b[0] : a[1]-b[1]);

        int endTime=classes[0][1];
        int cnt=1;
        for(int i=1;i<classes.length;i++){
            if(endTime<=classes[i][0]){
                cnt++;
                endTime=classes[i][1];
            }
        }


        System.out.println(cnt);
    }
}
