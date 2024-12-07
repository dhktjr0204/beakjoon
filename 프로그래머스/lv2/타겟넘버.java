package lv2;

public class 타겟넘버 {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, 0, 0, target);
    }

    public int dfs(int[] numbers, int i, int sum, int target){

        if(i==numbers.length){
            if(sum==target){
                return 1;
            }
            return 0;
        }

        return dfs(numbers, i+1, sum+numbers[i], target)
                +dfs(numbers, i+1, sum-numbers[i], target);
    }
}