import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class num14002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(br.readLine());
        int arr[]=new int[n+1];
        int dp[]=new int[n+1];
        int result=0;

        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=1;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j]){
                    dp[i]=Math.min(dp[j]+1,dp[i]);
                    result=Math.max(dp[i],result);
                }
            }
        }
        sb.append(result+"\n");

        int value=result;
        Stack<Integer> stack=new Stack<>();

        for(int i=n;i>=1;i--){
            if(value==dp[i]){
                stack.push(arr[i]);
                value--;
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
    }
}
