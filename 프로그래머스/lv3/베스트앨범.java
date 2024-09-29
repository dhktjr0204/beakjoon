package lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class 베스트앨범 {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }

        List<String> keySet = new ArrayList<>(map.keySet());
        keySet.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return map.get(o2).compareTo(map.get(o1));
            }
        });


        ArrayList<Integer> answer =new ArrayList<>();

        for (int i = 0; i < keySet.size(); i++) {
            HashMap<Integer, Integer> playMap = new HashMap();

            for (int j = 0; j < genres.length; j++) {
                if (genres[j].equals(keySet.get(i))) {
                    playMap.put(j, plays[j]);
                }
            }

            ArrayList<Integer> playKeySet = new ArrayList<>(playMap.keySet());
            Collections.sort(playKeySet, (a,b) -> playMap.get(a).equals(playMap.get(b)) ? a - b : playMap.get(b) - playMap.get(a));

            answer.add(playKeySet.get(0));

            if (playKeySet.size() >= 2) {
                answer.add(playKeySet.get(1));
            }
        }

        int[] result=new int[answer.size()];

        for(int i=0 ; i<answer.size();i++){
            result[i]=answer.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        베스트앨범 problem = new 베스트앨범();
        System.out.println(Arrays.toString(problem.solution(new String[]{"classic", "pop", "classic", "classic"},
                new int[]{800,600,150,800})));
    }
}
