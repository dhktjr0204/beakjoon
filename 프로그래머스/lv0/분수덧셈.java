package lv1;

public class 분수덧셈 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        int num=denom1*denom2;

        int numerResult=numer1*(num/denom1)+numer2*(num/denom2);
        int denomResult=num;

        int gcd2=calGcd(numerResult, denomResult);

        answer[0]=numerResult/gcd2;
        answer[1]=denomResult/gcd2;

        return answer;
    }

    public static int calGcd(int a, int b){
        while(a!=0){
            int tmp=a;
            a=b%a;
            b=tmp;
        }

        return b;
    }
}