package lv1;

public class 옹알이 {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] originBabbling={ "aya", "ye", "woo", "ma"};
        String[] doubleBabbling={ "ayaaya", "yeye", "woowoo", "mama"};
        for(String s:babbling){
            //연속된 옹알이면 1로 대체
            for(int i=0;i<doubleBabbling.length;i++){
                s=s.replace(doubleBabbling[i],"1");
            }
            //연속되지 않은 옹알이는 빈칸으로 바꾼다.
            for(int i=0;i<originBabbling.length;i++){
                s = s.replace(originBabbling[i], " ");
            }
            s=s.replace(" ","");
            if(s.isEmpty()){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        옹알이 sound = new 옹알이();
        System.out.println(sound.solution(new String[]{ "yeyema"}));
    }
}
