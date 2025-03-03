package softeer;

import java.io.*;
import java.util.*;

public class 우물안개구리 {

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());

        int[] people= new int[n];
        int[] mind= new int[n];

        st=new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++){
            people[i]=Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<m; i++){
            st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken())-1;
            int b=Integer.parseInt(st.nextToken())-1;
            if(people[a]<people[b]){
                mind[a]=-1;
            }else if(people[a]>people[b]){
                mind[b]=-1;
            }else{
                mind[a]=-1;
                mind[b]=-1;
            }
        }

        int cnt=0;

        for(int i=0;i<n;i++){
            if(mind[i]==0){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
