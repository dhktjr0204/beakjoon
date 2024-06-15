package lv1;

public class _2016년 {
    public String solution(int a, int b) {
        String answer = "";
        String[] week={"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int[] month={0,31,29,31,30,31,30,31,31,30,31,30,31};
        int cnt=0;
        for(int i=0;i<a;i++){
            cnt+=month[i];
        }
        cnt+=b;
        answer=week[cnt%7];
        return answer;
    }

    public static void main(String[] args) {
        _2016년 year = new _2016년();
        System.out.println(year.solution(5,24));
    }
}
