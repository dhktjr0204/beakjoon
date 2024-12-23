package lv3;
import java.util.*;

public class 야근지수 {
    public long solution(int n, int[] works) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int w : works) {
            pq.add(w);
        }

        while (n > 0) {
            if (pq.peek() != 0) {
                pq.add(pq.poll() - 1);
            }
            n--;
        }
        long answer = 0;

        while (!pq.isEmpty()) {
            answer += Math.pow(pq.poll(), 2);
        }

        return answer;
    }
}