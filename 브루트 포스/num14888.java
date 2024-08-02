package silver;

import java.io.*;
import java.util.StringTokenizer;

public class num14888 {
    static int[] arr;
    static int n;
    static int max=Integer.MIN_VALUE;
    static int min=Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n=Integer.parseInt(br.readLine());

        arr=new int[n];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        st=new StringTokenizer(br.readLine());
        int plus=Integer.parseInt(st.nextToken());
        int minus=Integer.parseInt(st.nextToken());
        int mult=Integer.parseInt(st.nextToken());
        int div=Integer.parseInt(st.nextToken());

        Calculator(1, plus,minus,mult,div,arr[0]);

        System.out.println(max);
        System.out.println(min);
    }

    public static void Calculator(int depth,int plus, int minus, int mult, int div, int total){
        if(depth==n){
            max=Math.max(max,total);
            min=Math.min(min,total);
        }
        if (plus>0){
            Calculator(depth+1,plus-1,minus,mult,div, total+arr[depth]);
        }
        if (minus>0){
            Calculator(depth+1,plus,minus-1,mult,div, total-arr[depth]);
        }
        if(mult>0){
            Calculator(depth+1,plus,minus,mult-1,div, total*arr[depth]);
        }
        if(div>0){
            Calculator(depth+1,plus,minus,mult,div-1, total/arr[depth]);
        }
    }
}
