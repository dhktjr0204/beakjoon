import java.util.*;
public class 문자열내림차순 {
    public String solution(String s) {
        String answer="";
        String[] str=s.split("");
        Arrays.sort(str,Collections.reverseOrder());
        for (String i: str){
            answer+=i;
        }
        return answer;
    }

    public static void main(String[] args) {
        문자열내림차순 string = new 문자열내림차순();
        System.out.println(string.solution("Zbcdefg"));
    }
}
