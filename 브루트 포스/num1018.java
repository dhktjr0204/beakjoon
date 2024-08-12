package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());

        String[] chess=new String[n];
        for(int i=0;i<n;i++){
            chess[i]=br.readLine();
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n-7;i++){
            for(int j=0;j<m-7;j++){
                //첫번째가 W일 경우 다시 칠해야되는 되는 갯수
                int w_cnt=0;
                //첫번째가 B일 경우 다시 칠해야되는 되는 갯수
                int b_cnt=0;
                for(int a=i;a<i+8;a++){
                    for(int b=j;b<j+8;b++){
                        if((a+b)%2==0){
                            if(chess[a].charAt(b)=='W'){
                                b_cnt++;
                            }else{
                                w_cnt++;
                            }
                        }else{
                            if(chess[a].charAt(b)=='B'){
                                b_cnt++;
                            }else{
                                w_cnt++;
                            }
                        }
                    }
                }
                min = Math.min(min, Math.min(w_cnt, b_cnt));
            }
        }
        System.out.println(min);
    }
}
