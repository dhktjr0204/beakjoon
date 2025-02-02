package lv1;

public class 옹알이1 {
    public int solution(String[] babbling) {
        int answer = 0;

        String[] baby={"aya", "ye", "woo", "ma"};

        for(String s: babbling){
            for(String sound: baby){
                s=s.replaceAll(sound, " ");
            }

            s=s.replaceAll(" ","");

            if(s.isEmpty()){
                answer++;
            }
        }

        return answer;
    }
}