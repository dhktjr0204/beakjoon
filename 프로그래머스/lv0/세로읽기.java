package lv0;

public class 세로읽기 {
    public String solution(String my_string, int m, int c) {
        String answer = "";

        for(int i=0; i<my_string.length(); i+=m) {
            answer += my_string.charAt(i+c-1);
        }

        return answer;
    }
}
