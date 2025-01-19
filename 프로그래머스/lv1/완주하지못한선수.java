package lv1;

import java.util.*;
public class 완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map=new HashMap<>();

        for(String s: participant){
            map.put(s, map.getOrDefault(s, 0)+1);
        }

        for(String s: completion){
            map.put(s, map.get(s)-1);
        }

        for(String key: map.keySet()){
            if(map.get(key)!=0){
                return key;
            }
        }
        return "";
    }
}