package lv1;

import java.util.Arrays;
import java.util.HashMap;

public class 가장가까운같은글자 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(hashMap.containsKey(s.charAt(i))){
                answer[i]=i-hashMap.get(s.charAt(i));
                hashMap.put(s.charAt(i),i);
            }else{
                answer[i]=-1;
                hashMap.put(s.charAt(i),i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        가장가까운같은글자 sameStr = new 가장가까운같은글자();
        System.out.println(sameStr.solution("banana"));
    }
}
