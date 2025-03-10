package lv0;

import java.util.*;

public class 홀짝변환 {
    public int solution(int n) {
        int answer = 0;

        if(n % 2 != 0) {
            for(int i=1; i<=n; i+=2) {
                answer += i;
            }
        } else {
            for(int i=2; i<=n; i+=2) {
                answer += Math.pow(i, 2);
            }
        }

        return answer;
    }
}
