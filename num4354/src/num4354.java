import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num4354 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str;
        StringBuilder sb=new StringBuilder();

        while(!(str=br.readLine()).equals(".")){
            int len=str.length();
            int max=0;
            max=getMaxKMP(str);
            sb.append(max).append("\n");
        }
        System.out.println(sb.toString());
    }

    static int getMaxKMP(String str){
        int j=0;
        int max=0;
        int len=str.length();
        int []pi=new int[len];

        for(int i=1;i<len;i++){
            while(j>0 && str.charAt(i)!=str.charAt(j)){
                j=pi[j-1];
            }
            if(str.charAt(i)==str.charAt(j)){
                pi[i]=++j;
            }
        }
        return len%(len-pi[len-1])!=0?1:len/(len-pi[len-1]);
    }
}
