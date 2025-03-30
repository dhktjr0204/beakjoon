package lv0;

public class 문자열뒤집기 {
    public String solution(String my_string, int s, int e) {
        String answer = my_string.substring(0, s)
                + new StringBuilder(my_string.substring(s,e+1)).reverse().toString()
                + my_string.substring(e+1);

        return answer;
    }
}
