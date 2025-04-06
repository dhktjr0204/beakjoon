package lv0;

public class 글자지우기 {
    public String solution(String my_string, int[] indices) {
        String answer = "";

        String[] split = my_string.split("");

        for(int i: indices) {
            split[i] = "";
        }

        for(String s: split) {
            answer+=s;
        }

        return answer;
    }
}
