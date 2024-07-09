package bronze._if;

import java.io.*;
import java.util.StringTokenizer;

public class num2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int h=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken())-45;
        if(m<0){
            m+=60;
            h-=1;
            if (h<0){
                h+=24;
            }
        }
        System.out.println(h+" "+m);
    }
}
