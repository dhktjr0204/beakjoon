import java.io.*;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class num12852 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());
        StringBuilder sb=new StringBuilder();
        int INF=100000;
        int N=Integer.parseInt(st.nextToken());
        int dp[]=new int[N+1];
        Arrays.fill(dp,INF);
        dp[N]=0;
        for(int i=N;i>=1;i--){
            int minValue=dp[i]+1;
            if(i%3==0)
                dp[i/3]=Math.min(dp[i/3],minValue);
            if(i%2==0)
                dp[i/2]=Math.min(dp[i/2],minValue);
            dp[i-1]=Math.min(dp[i-1],minValue);
        }
        sb.append(dp[1]+"\n");

        int minValue=dp[1];
        Stack<Integer> stack=new Stack<>();

        for(int i=1;i<=N;i++){
            if(minValue==dp[i]){
                stack.push(i);

                if(i*3<=N&&dp[i*3]==minValue-1)
                    i=i*3-1;
                else if(i*2<=N && dp[i*2]==minValue-1){
                    i=i*2-1;
                }else if(i+1<=N && dp[i+1]==minValue-1){
                    i=i+1;
                }
                minValue--;
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        bw.write(sb.toString());
        bw.close();
        br.close();

    }
}
