import java.util.ArrayList;
import java.util.Collections;

public class 최댓값과최솟값 {
    public String solution(String s) {
        String answer = "";
        ArrayList<Integer> arr = new ArrayList<>();
        String[] str = s.split(" ");
        for(int i=0;i<str.length;i++){
            arr.add(Integer.parseInt(str[i]));
        }
        answer= Collections.min(arr)+" "+Collections.max(arr);
        return answer;
    }

    public static void main(String[] args) {
        최댓값과최솟값 minAndMax = new 최댓값과최솟값();
        System.out.println(minAndMax.solution("1 2 3 4"));
    }
}
