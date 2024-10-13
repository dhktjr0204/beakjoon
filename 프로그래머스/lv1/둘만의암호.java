package lv1;

import java.util.ArrayList;
import java.util.List;

public class 둘만의암호 {
    public String solution(String s, String skip, int index) {
        String answer = "";
        List<Character> list = new ArrayList<>();

        for(int i=97; i<=122; i++){
            char c = (char) i;
            if (!skip.contains(String.valueOf(c))) {
                list.add(c);
            }
        }

        for(char c: s.toCharArray()){
            int idx= list.indexOf(c);
            char changeAlpha = list.get((idx + index) % list.size());
            answer+=changeAlpha;
        }

        return answer;
    }

    public static void main(String[] args) {
        둘만의암호 problem = new 둘만의암호();
        System.out.println(problem.solution("aukks", "wbqd", 5));
    }
}
