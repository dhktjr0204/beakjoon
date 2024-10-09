package lv1;

import java.util.Arrays;
import java.util.HashMap;

public class 대충만든자판 {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                char c = keymap[i].charAt(j);
                if (map.containsKey(c)) {
                    map.put(c, Math.min(map.get(c), j+1));
                }else{
                    map.put(c, j+1);
                }
            }
        }

        for(int i=0; i< targets.length; i++){
            int cnt=0;
            for(char c: targets[i].toCharArray()){
                if(!map.containsKey(c)){
                    cnt=-1;
                    break;
                }
                cnt+=map.get(c);
            }
            answer[i]=cnt;
        }

        return answer;
    }

    public static void main(String[] args) {
        대충만든자판 problem = new 대충만든자판();
        System.out.println(Arrays.toString(problem.solution(new String[]{"AA"},
                new String[]{"B"})));
    }
}
