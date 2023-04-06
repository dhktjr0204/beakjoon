import java.io.*;
import java.util.StringTokenizer;

public class num17404 {
    static int n, pmax, ans;
    static int[][] arr,dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n=Integer.parseInt(br.readLine());
        arr=new int[n][3];
        dp=new int[n][3];//비용 저장

        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<3;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        pmax=1000*n+1;
        ans=1000001;
        for(int k=0;k<3;k++){//0번째 집을 색칠할 색깔 정함
            for(int i=0;i<3;i++){
                if(i==k) dp[0][i]=arr[0][i];//색깔 칠함
                else dp[0][i]=pmax;//다른 색 칠할때 초기값 넣어줌
            }
            for(int i=1;i<n;i++){
                dp[i][0]=Math.min(dp[i-1][1],dp[i-1][2])+arr[i][0];
                dp[i][1]=Math.min(dp[i-1][0],dp[i-1][2])+arr[i][1];
                dp[i][2]=Math.min(dp[i-1][1],dp[i-1][0])+arr[i][2];
            }
            for(int i=0;i<3;i++){
                if(i==k) continue;
                ans=Math.min(ans,dp[n-1][i]);
            }
        }
        System.out.println(ans);
    }
}
