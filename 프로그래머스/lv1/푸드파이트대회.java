package lv1;


public class 푸드파이트대회 {
    public String solution(int[] food) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        for(int i=1;i<food.length;i++){
            int cnt=food[i]/2;
            sb.append(String.valueOf(i).repeat(cnt));
        }
        answer+=sb.toString();
        answer+=0;
        answer+=sb.reverse().toString();
        return answer;
    }

    public static void main(String[] args) {
        푸드파이트대회 meeting = new 푸드파이트대회();
        System.out.println(meeting.solution(new int[]{1, 3, 4, 6}));
    }
}
