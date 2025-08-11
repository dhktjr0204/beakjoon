package lv2;

import java.util.*;
public class 오픈채팅방 {
    public String[] solution(String[] record) {
        List<String> result = new ArrayList<>();
        Map<String, String> map = new HashMap<>();

        for(String s: record) {
            String[] split = s.split(" ");
            if(split[0].equals("Enter") || split[0].equals("Change")) {
                map.put(split[1], split[2]);
            }
            if(split[0].equals("Enter")) {
                result.add(split[1] + ";님이 들어왔습니다.");
            } else if(split[0].equals("Leave")) {
                result.add(split[1] + ";님이 나갔습니다.");
            }
        }

        String[] answer = new String[result.size()];
        for(int i=0; i<result.size(); i++) {
            String[] id = result.get(i).split(";");
            answer[i] = map.get(id[0]) + id[1];
        }

        return answer;
    }
}