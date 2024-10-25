package lv2;

import java.io.IOException;
import java.util.PriorityQueue;

public class 더맵게 {

    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int n : scoville) {
            priorityQueue.add(n);
        }
        int cnt = 0;
        while (priorityQueue.size() > 1 && priorityQueue.peek() < K) {
            int min = priorityQueue.poll();
            int secontMin = priorityQueue.poll();
            priorityQueue.add(min + (secontMin * 2));
            cnt++;

        }

        if(priorityQueue.size()<=1 && priorityQueue.peek()<K){
            cnt=-1;
        }

        return cnt;
    }

    public static void main(String[] args) throws IOException {
        더맵게 practice = new 더맵게();
        System.out.println(practice.solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
    }
}