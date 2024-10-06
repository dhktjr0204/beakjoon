package pcce;

import java.util.PriorityQueue;

public class 신입사원교육 {
    public int solution(int[] ability, int number) {
        int answer = 0;

        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();

        for(int i=0;i<ability.length;i++){
            priorityQueue.add(ability[i]);
        }

        for(int i=0;i<number;i++){
            int a= priorityQueue.poll();
            int b= priorityQueue.poll();

            priorityQueue.add(a+b);
            priorityQueue.add(a+b);
        }
        for(int i: priorityQueue){
            answer+=i;
        }

        return answer;
    }

    public static void main(String[] args) {
        신입사원교육 problem = new 신입사원교육();
        System.out.println(problem.solution(new int[]{10, 3, 7, 2}, 2));
    }
}
