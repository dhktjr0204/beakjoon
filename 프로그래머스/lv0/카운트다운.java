package lv0;
import java.util.*;


public class 카운트다운 {
    public int[] solution(int start_num, int end_num) {
        List<Integer> answer = new ArrayList<>();
        for(int i=start_num; i>=end_num; i--) {
            answer.add(i);
        }


        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
