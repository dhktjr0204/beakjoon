package lv1;

import java.util.Arrays;

public class 예산 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int money:d){
            budget-=money;
            if(budget<0){
                break;
            }
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        예산 price = new 예산();
        System.out.println(price.solution(new int[]{1,3,2,5,4},9));
    }
}
