package lv0;

import java.util.*;

public class 배열만들기2 {
    public int[] solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();

        for(int i=l; i<=r; i++) {
            if(checkNum(i)) {
                answer.add(i);
            }
        }

        return answer.size() == 0 ? new int[]{-1} : answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public boolean checkNum(int n) {
        while (n > 0) {
            if(n%5 != 0) {
                return false;
            }
            n/=10;
        }
        return true;
    }
}
