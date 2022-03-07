import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num1305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String str= br.readLine();

        int lastPi=getLastPi(str);
        System.out.println(n-lastPi);
    }
    static int getLastPi(String str){
        int len=str.length();
        int j=0, max=0;
        int[] pi=new int[len];

        for(int i=0;i<len;i++){
            while (j>0&&str.charAt(j)!=str.charAt(i)){
                j=pi[j-1];
            }
            if(str.charAt(j)==str.charAt(i)){
                pi[i]=j++;
                max=Math.max(max,pi[i]);
            }
        }
        return pi[len-1];
    }
}
