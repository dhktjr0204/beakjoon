package gold;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class num1911 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int l=Integer.parseInt(st.nextToken());

        int[][] water=new int[n][2];
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            water[i][0]=Integer.parseInt(st.nextToken());
            water[i][1]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(water,(a,b)-> a[0]==b[0] ? a[1]-b[1]: a[0]-b[0]);

        int answer=0;
        int range=0;

        for(int[] ints: water){
            if(ints[0]>range){
                range=ints[0];
            }
            if(ints[1]>range){
                while (ints[1]>range){
                    range+=l;
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }

}
