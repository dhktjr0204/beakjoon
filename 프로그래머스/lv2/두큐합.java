package lv2;

import java.util.*;

class 두큐합 {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        long sum1 = 0, sum2 = 0;

        for (int i = 0; i < queue1.length; i++) {
            q1.add(queue1[i]);
            sum1 += queue1[i];
            q2.add(queue2[i]);
            sum2 += queue2[i];
        }

        long total = sum1 + sum2;
        if (total % 2 != 0) return -1;

        long target = total / 2;
        int count = 0;
        int limit = queue1.length * 3; // 시간 제한 방지용

        while (count <= limit) {
            if (sum1 == target) return count;

            if (sum1 > target) {
                int num = q1.poll();
                sum1 -= num;
                q2.add(num);
                sum2 += num;
            } else {
                int num = q2.poll();
                sum2 -= num;
                q1.add(num);
                sum1 += num;
            }
            count++;
        }

        return -1;
    }
}