import java.util.*;

public class 프로세스 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i: priorities){
            pq.add(i);
        }
        while(!pq.isEmpty()) {
            for (int i=0; i<priorities.length;i++){
                if (pq.peek()==priorities[i]){
                    pq.poll();
                    answer++;
                    if (location==i){
                        return answer;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        프로세스 process = new 프로세스();
        System.out.println(process.solution(new int[]{2, 1, 3, 2}, 2));
    }
}
