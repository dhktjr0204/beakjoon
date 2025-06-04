package lv2;

import java.util.*;


public class 압축 {
    public int[] solution(String msg) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i<26; i++) {
            map.put(String.valueOf((char)(i+'A')), i+1);
        }

        int cnt =27;
        for(int i=0; i < msg.length(); ) {
            String cur = "";

            for(int j=i; j<msg.length(); j++) {
                String pre = cur + msg.charAt(j);

                if(map.get(pre) == null) {
                    map.put(pre, cnt++);
                    break;
                }

                i++;
                cur = pre;
            }
            answer.add(map.get(cur));
        }


        return answer.stream().mapToInt(i->i).toArray();
    }
}