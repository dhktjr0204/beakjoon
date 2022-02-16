import java.io.*;
import java.util.Arrays;

public class num1086 {
    static int n,k;
    static char[][] set;
    static long p,q;

    static long[] fibo;
    static int[][] dpMod;
    static long[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        n=Integer.parseInt(br.readLine());
        set=new char[n][];
        for(int i=0;i<n;i++){
            set[i]=br.readLine().toCharArray();
        }
        k=Integer.parseInt(br.readLine());

        fibo=new long[n+1];
        fibo[1]=1L;
        for(int i=2;i<=n;i++){
            fibo[i]=(long) i*fibo[i-1];
        }

        dp=new long[k][1<<n];
        dpMod=new int[k][n];
        for(int i=0;i<k;i++){
            Arrays.fill(dp[i],-1);
            Arrays.fill(dpMod[i],-1);
        }

        p=memoization(0,0,0);
        q=fibo[n];
        if(p==0){
            q=1;
        }else{
            long gcd=GCD(p,q);
            p/=gcd;
            q/=gcd;
        }
        bw.write(p+"/"+q+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
    public static long GCD(long a, long b){
        if(a>b){
            long tmp=a;
            a=b;
            b=tmp;
        }
        while (a%b!=0){
            long tmp=a%b;
            a=b;
            b=tmp;
        }
        return b;
    }

    public static int getMod(int mod,int n){
        if(dpMod[mod][n]!=-1){
            return dpMod[mod][n];
        }

        int now=mod;
        for(int j=0;j<set[n].length;j++){
            now=now*10;
            now=(now+set[n][j]-'0')%k;
        }
        return dpMod[mod][n]=now;
    }
    public static long memoization(int mod,int cnt,int flag) {
        if (dp[mod][flag] != -1)
            return dp[mod][flag];

        if(cnt==n)
            return dp[mod][flag]=mod==0 ?1L:0;

        long sum=0;
        for(int i=0;i<n;i++){
            if((flag &(1<<i))!=(1<<i))
                sum+=memoization(getMod(mod,i),cnt+1,flag|(1<<i));
        }
        return dp[mod][flag]=sum;
    }
}
