public class 피보나치수 {
    public int solution(int n) {
        int[] fibo = new int[n + 1];
        fibo[0]=0;
        fibo[1]=1;
        fibo[2]=1;
        if (n==2){
            return fibo[n];
        }
        for (int i=3; i<=n; i++){
            fibo[i]=(fibo[i-2]+fibo[i-1])%1234567;
        }
        return fibo[n];
    }

    public static void main(String[] args) {
        피보나치수 fibo = new 피보나치수();
        System.out.println(fibo.solution(5));
    }
}
