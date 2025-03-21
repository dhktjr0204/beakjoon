package lv0;

import java.util.*;

public class 배열만들기5 {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();

        for(String str: intStrs) {
            int newInt = Integer.parseInt(str.substring(s, s+l));
            if(newInt > k) {
                answer.add(newInt);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
