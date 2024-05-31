package lv1;

public class 크기가작은부분문자열 {
    public int solution(String t, String p) {
        int answer = 0;
        long b=Long.parseLong(p);
        for(int i=0;i<=t.length()-p.length();i++){
            long a=Long.parseLong(t.substring(i,i+p.length()));
            if(a<=b){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        크기가작은부분문자열 smallString = new 크기가작은부분문자열();
        System.out.println(smallString.solution("3141592","271"));
    }
}
