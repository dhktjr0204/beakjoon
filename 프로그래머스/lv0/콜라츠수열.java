package lv0;

import java.util.*;

public class 콜라츠수열 {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        answer.add(n);


        while(n != 1) {
            if(n%2==0) {
                n/=2;
                answer.add(n);
            }else{
                n = 3*n +1;
                answer.add(n);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
