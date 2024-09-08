package lv2;

import java.util.Arrays;
import java.util.Stack;

public class 뒤에있는큰수찾기 {

    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Arrays.fill(answer,-1);

        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<numbers.length;i++){
            while(!stack.empty() && numbers[stack.peek()]<numbers[i]){
                answer[stack.pop()]=numbers[i];
            }

            stack.push(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        뒤에있는큰수찾기 problem = new 뒤에있는큰수찾기();
        System.out.println(Arrays.toString(problem.solution(new int[]{9, 1, 5, 3, 6, 2})));
    }
}
