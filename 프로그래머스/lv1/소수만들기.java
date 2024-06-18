package lv1;

public class 소수만들기 {
    public int solution(int[] nums) {
        int answer = 0;
        for(int i=0;i<=nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    int n = nums[i] + nums[j] + nums[k];
                    if (isPrime(n)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
    static boolean isPrime(int n){
        if(n==1 || n==0){
            return false;
        }
        for(int i=2;i<(int)Math.sqrt(n)+1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        소수만들기 makePrime = new 소수만들기();
        System.out.println(makePrime.solution(new int[]{1,2,3,4}));
    }
}
