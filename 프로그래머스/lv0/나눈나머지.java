package lv0;

public class 나눈나머지 {
    public int solution(String number) {
        int answer = 0;
        for(char n : number.toCharArray()) {
            int a = n - '0';
            answer+=a;
        }
        answer%=9;
        return answer;
    }
}
