package lv1;

public class 문자열나누기 {
    public int solution(String s) {
        int answer = 0;

        int first_cnt=0;
        int second_cnt=0;
        char current_char=s.charAt(0);
        for(char c: s.toCharArray()){
            if(first_cnt==0 && second_cnt==0){
                current_char=c;
            }

            if(current_char==c) {
                first_cnt++;
            }else{
                second_cnt++;
            }

            if(first_cnt==second_cnt){
                first_cnt=0;
                second_cnt=0;
                answer++;
            }
        }

        if(first_cnt!=0 || second_cnt!=0){
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        문자열나누기 problem = new 문자열나누기();
        System.out.println(problem.solution("abracadabra"));
    }
}
