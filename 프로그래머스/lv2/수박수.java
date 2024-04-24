public class 수박수 {
    public String solution(int n) {
        String answer = "";
        String subak="수박";
        if (n%2==0){
            answer= subak.repeat(n/2);
        }else{
            answer=subak.repeat(n/2)+"수";
        }
        return answer;
    }

    public static void main(String[] args) {
        수박수 subak = new 수박수();
        System.out.println(subak.solution(4));
    }
}
