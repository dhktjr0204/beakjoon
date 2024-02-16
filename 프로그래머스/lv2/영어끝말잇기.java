import java.util.ArrayList;
import java.util.Arrays;

public class 영어끝말잇기 {
    public int[] solution(int n, String[] words) {
        int[] answer = {};
        ArrayList<String> dic = new ArrayList<>();
        char end_chr=words[0].charAt(words[0].length()-1);
        dic.add(words[0]);
        for (int i=1; i<words.length; i++){
            if (end_chr==words[i].charAt(0) && !dic.contains(words[i])){
                end_chr=words[i].charAt(words[i].length()-1);
                dic.add(words[i]);
            }else{
                answer= new int[]{i % n + 1, (int) i / n +1};
                break;
            }
        }
        return answer.length==0 ? new int[]{0,0} : answer;
    }

    public static void main(String[] args) {
        영어끝말잇기 englishPlay = new 영어끝말잇기();
        System.out.println(Arrays.toString(
                englishPlay.solution(3,new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"})));
    }
}
