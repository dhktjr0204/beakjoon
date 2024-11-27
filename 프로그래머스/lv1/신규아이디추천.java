package lv1;

public class 신규아이디추천 {
    public String solution(String new_id) {
        String answer = "";

        answer = new_id.toLowerCase();
        answer = answer.replaceAll("[^0-9a-z-_.]", "");
        answer = answer.replaceAll("[.]{2,}",".");
        answer = answer.replaceAll("^[.]|[.]$","");

        if(answer.isEmpty()){
            answer="a";
        }

        if(answer.length()>15){
            answer=answer.substring(0,15);
        }

        answer = answer.replaceAll("[.]$","");

        while(answer.length()<3){
            answer += answer.charAt(answer.length()-1);
        }

        return answer;
    }

    public static void main(String[] args) {
        신규아이디추천 problem = new 신규아이디추천();
        System.out.println(problem.solution("...!@BaT#*..y.abcdefghijklm"));
    }
}
