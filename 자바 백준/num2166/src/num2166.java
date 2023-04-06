import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num2166 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n,x[],y[];
        n=Integer.parseInt(br.readLine());

        x=new int[n+1];
        y=new int[n+1];

        int sum_a=0,sum_b=0;

        for(int i=0;i<n;i++) {
            StringTokenizer st=new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i]= Integer.parseInt(st.nextToken());
        }
        x[n]=x[0];
        x[n]=x[0];

        for(int i=0;i<n;i++){
            sum_a+=x[i]*y[i+1];
            sum_b+=x[i+1]*y[i];
        }
        String area= String.format("%.1f",Math.abs(sum_a-sum_b)/2.0);
        sb.append(area);
        System.out.println(sb);
        br.close();
    }
}
