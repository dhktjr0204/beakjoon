package softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class xmarks {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n=Integer.parseInt(br.readLine());

        StringBuilder sb=new StringBuilder();

        for(int i=0; i<n; i++){
            st=new StringTokenizer(br.readLine());
            String s=st.nextToken();
            String t=st.nextToken();
            t=t.toUpperCase();

            int idx=0;

            for(int j=0; j<s.length(); j++){
                if(s.charAt(j)=='x' || s.charAt(j)=='X'){
                    idx=j;
                    break;
                }
            }

            sb.append(t.charAt(idx));

        }
        System.out.println(sb.toString());
    }
}
