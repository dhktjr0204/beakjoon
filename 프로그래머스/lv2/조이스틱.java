package lv2;

import java.util.*;

public class 조이스틱 {
    public int solution(String name) {
        int answer = 0;
        int length = name.length();

        int move = length - 1;
        for(int i=0; i<length; i++) {
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) +1);

            int index = i + 1;
            while(index < length && name.charAt(index) == 'A') {
                index++;
            }

            move = Math.min(move, i*2 + (length - index));
            move = Math.min(move, (length-index)*2 + i);
        }
        return answer + move;
    }
}
