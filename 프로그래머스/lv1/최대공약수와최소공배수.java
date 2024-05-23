import java.util.Arrays;

public class 최대공약수와최소공배수 {
    public int[] solution(int n, int m) {
        int[] answer = {};
        int gcd=gcd(n,m);
        answer= new int[]{gcd, n * m / gcd};
        return answer;
    }
    public int gcd(int a,int b){
        while(a!=0){
            int tmp=a;
            a=b%a;
            b=tmp;
        }
        return b;
    }
    public static void main(String[] args) {
        최대공약수와최소공배수 gcdLcm = new 최대공약수와최소공배수();
        System.out.println(Arrays.toString(gcdLcm.solution(3, 12)));
    }
}
