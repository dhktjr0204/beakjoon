package lv1;
public class 콜라문제 {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (true){
            if (n<a){
                break;
            }
            answer+=n/a*b;
            n=(n/a)*b+n%a;
        }
        return answer;
    }

    public static void main(String[] args) {
        콜라문제 coke = new 콜라문제();
        System.out.println(coke.solution(3,1,20));
    }
}
