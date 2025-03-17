package lv0;

public class 부분문자열이어붙이기 {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        for(int i=0; i<my_strings.length; i++) {
            String s = my_strings[i].substring(parts[i][0], parts[i][1]+1);
            answer+=s;
        }

        return answer;
    }
}
