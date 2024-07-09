package bronze._if;

import java.io.*;
import java.util.StringTokenizer;

public class num2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int A=Integer.parseInt(st.nextToken());
        int B=Integer.parseInt(st.nextToken());
        int C=Integer.parseInt(br.readLine());
        B+=C;
        if (B>59){
            A+=B/60;
            B=B%60;
            if(A>23){
                A%=24;
            }
        }
        System.out.println(A+" "+B);
    }
}
