import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class num1786 {
    static List<Integer> list;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String st=br.readLine();
        String pattern=br.readLine();
        list=new ArrayList<Integer>();
        StringBuilder sb=new StringBuilder();

        int[] pi=getPi(pattern);
        kmp(pi,st,pattern);

        for(int ele : list) {
            sb.append(ele).append(" ");
        }

        System.out.println(list.size());
        System.out.println(sb.toString());
    }
    static void kmp(int[] pi,String str,String pattern){
        int j=0;
        int strLen=str.length();
        int patternLen=pattern.length();

        for(int i=0;i<strLen;i++){
            while(j>0 && str.charAt(i)!=pattern.charAt(j)){
                j=pi[j-1];
            }
            if (str.charAt(i) == pattern.charAt(j)) {
                if (j + 1 == patternLen) {
                    list.add(i - patternLen + 2);
                    j = pi[j];
                } else {
                    j++;
                }
            }
        }
    }
    static int[] getPi(String str){
        int j=0;
        int n=str.length();
        int pi[]=new int[n];

        for(int i = 1; i < n; i++) {
            while(j > 0 && str.charAt(j) != str.charAt(i)) {
                j = pi[j - 1];
            }

            if(str.charAt(j) == str.charAt(i)) {
                pi[i] = ++j;
            }
        }

        return pi;
    }
}