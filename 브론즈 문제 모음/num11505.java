package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num11505 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());


        System.out.println(factorial(n)/(factorial(m)*factorial(n-m)));
    }

    public static int factorial(int n) {
        if(n==0 || n==1) {
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
}
