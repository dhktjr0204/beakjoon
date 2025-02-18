package softeer;
import java.io.*;
import java.util.*;

public class 징검다리 {

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n=Integer.parseInt(br.readLine());

        int[] stone=new int[n];
        int[] dp=new int[n];
        dp[0]=1;

        st=new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            stone[i]=Integer.parseInt(st.nextToken());
        }

        for(int i=1;i<n;i++){
            for(int j=0; j<i;j++){
                if(stone[j]<stone[i] && dp[j]>=dp[i]){
                    dp[i]=dp[j];
                }
            }
            dp[i]+=1;
        }

        int answer=0;

        for(int i=0; i<n; i++){
            answer=Math.max(answer, dp[i]);
        }

        System.out.println(answer);
    }
}
