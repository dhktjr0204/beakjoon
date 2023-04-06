import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class num2293 {
    public static int coin[];
    public static int dp[];
    public static int n,k;
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();
        int k= sc.nextInt();

        int[] coin=new int[n+1];
        for(int i=1;i<=n;i++){
            coin[i]= sc.nextInt();
        }

        int[] dp=new int[k+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            for(int j=coin[i];j<=k;j++){
                dp[j]=dp[j]+dp[j-coin[i]];
            }
        }
        System.out.println(dp[k]);
    }
}
