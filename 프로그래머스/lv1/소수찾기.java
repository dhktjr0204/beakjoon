package lv1;

public class 소수찾기 {
    public int solution(int n) {
        int answer = 0;
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                answer++;
            }
        }
        return answer;
    }
    static boolean isPrime(int n){
        if (n==0 || n==1){
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
        소수찾기 findPrime = new 소수찾기();
        System.out.println(findPrime.solution(10));
    }
}
