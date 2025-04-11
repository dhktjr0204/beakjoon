package lv2;

import java.util.*;

public class 카페확장 {
    public int solution(int[] menu, int[] order, int k) {
        Queue<Integer> q = new LinkedList<>();
        int time = 0;
        int index = 0;
        int answer = 0;

        int currentOrderTime = 0;
        while(index < order.length || !q.isEmpty() || currentOrderTime > 0) {
            if(index < order.length && time == index * k) {
                q.add(order[index]);
                index++;
            }

            if(currentOrderTime <= 0 && !q.isEmpty()) {
                int nextOrder = q.poll();
                currentOrderTime = menu[nextOrder];
            }

            currentOrderTime--;

            int people = q.size() + (currentOrderTime >= 0 ? 1: 0);
            answer = Math.max(answer, people);

            time++;
        }

        return answer;
    }
}