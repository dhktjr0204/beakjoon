package lv1;

import java.util.Arrays;
import java.util.HashMap;

public class 추억점수 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            hashMap.put(name[i], yearning[i]);
        }
        for (int i = 0; i < photo.length; i++) {
            String[] photos = photo[i];
            for (String photoName : photos) {
                if (hashMap.containsKey(photoName)) {
                    answer[i] += hashMap.get(photoName);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        추억점수 score = new 추억점수();
        System.out.println(Arrays.toString(score.solution(new String[]{"may", "kein", "kain", "radi"},
                new int[]{5, 10, 1, 3},
                new String[][]{{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}})));
    }
}
