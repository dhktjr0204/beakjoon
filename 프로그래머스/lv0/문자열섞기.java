package lv0;

public class 문자열섞기 {
    public String solution(String str1, String str2) {
        String answer = "";

        for(int i=0; i< str1.length(); i++) {
            answer += str1.charAt(i) + "" + str2.charAt(i);
        }

        return answer;
    }
}
