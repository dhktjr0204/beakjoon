package bronze.반복문;

import java.io.*;
import java.util.StringTokenizer;

public class num25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int x=Integer.parseInt(br.readLine());
        int n=Integer.parseInt(br.readLine());
        int total=0;
        for (int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            total+=a*b;
        }
        if (total==x){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
