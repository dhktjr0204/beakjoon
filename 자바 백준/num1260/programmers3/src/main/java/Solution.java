class Solution {
    public int solution(int[] numbers) {
        int sum=0;
        for(int i=0;i<10;i++){
            for(int j=0;j<=numbers.length;j++){
                if(numbers[j]==i)
                    break;
                if(j==numbers.length)
                    sum+=i;
            }
        }
        return sum;
    }
}