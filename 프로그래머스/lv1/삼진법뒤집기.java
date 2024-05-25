package lv1;


import java.util.Arrays;
import java.util.Collections;

public class 삼진법뒤집기 {
    public int solution(int n) {
        int answer = 0;
        String s=Integer.toString(n,3);
        String newS="";
        for(int i=s.length()-1;i>=0;i--){
            newS+=s.charAt(i);
        }
        answer= Integer.parseInt(newS,3);
        return answer;
    }

    public static void main(String[] args) {
        삼진법뒤집기 reverse = new 삼진법뒤집기();
        System.out.println(reverse.solution(125));
    }
}
