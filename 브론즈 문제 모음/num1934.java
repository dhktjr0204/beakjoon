package bronze.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());

            int gcd=makeGcd(a,b);

            System.out.println(a*b/gcd);
        }
    }

    public static int makeGcd(int a,int b){
        int tmp;
        while (a!=0){
            tmp=a;
            a=b%a;
            b=tmp;
        }
        return b;
    }
}
