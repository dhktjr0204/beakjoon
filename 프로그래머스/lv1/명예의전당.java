package lv1;

import java.util.*;

public class 명예의전당 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> rank = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            rank.add(score[i]);
            if (rank.size() > k) {
                rank.remove(Collections.min(rank));
            }

            answer[i] = Collections.min(rank);
        }
        return answer;
    }

    public static void main(String[] args) {
        명예의전당 function = new 명예의전당();
        System.out.println(Arrays.toString(function.solution(3, new int[]{10, 100, 20, 150, 1, 100, 200})));
    }
}
