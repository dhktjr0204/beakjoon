public class 다음큰숫자 {
    public int solution(int n) {
        int answer = 0;
        int num=n+1;
        int original_cnt=countChar(Integer.toBinaryString(n));
        while (true){
            int cnt= countChar(Integer.toBinaryString(num));
            if (cnt==original_cnt){
                answer=num;
                break;
            }
            num++;
        }
        return answer;
    }
    public int countChar(String ch){
        int cnt=0;
        for (int i=0; i<ch.length(); i++){
            if (ch.charAt(i)=='1'){
             cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        다음큰숫자 nextNum = new 다음큰숫자();
        System.out.println(nextNum.solution(78));
    }
}
