package lv2;


public class k진수에서소수개수구하기 {
    public int solution(int n, int k) {
        int answer = 0;

        String changeNum = Integer.toUnsignedString(n, k);

        String[] split = changeNum.split("0");

        for(String s: split){
            if(!s.isEmpty() && isPrime(Long.parseLong(s))){
                answer++;
            }
        }

        return answer;
    }

    public boolean isPrime(long n){
        if(n==1 || n==0){
            return false;
        }

        if(n==2){
            return true;
        }

        for(int i=2; i<Math.sqrt(n)+1; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        k진수에서소수개수구하기 problem = new k진수에서소수개수구하기();
        System.out.println(problem.solution(110011,10));
    }
}
