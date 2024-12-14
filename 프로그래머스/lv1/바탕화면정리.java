package lv1;

import java.util.*;

public class 바탕화면정리 {
    public int[] solution(String[] wallpaper) {
        int[] answer = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                char c = wallpaper[i].charAt(j);
                if (c == '#') {
                    answer[0]=Math.min(answer[0], i);
                    answer[1]=Math.min(answer[1], j);
                    answer[2]=Math.max(answer[2], i+1);
                    answer[3]=Math.max(answer[3], j+1);
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        바탕화면정리 problem = new 바탕화면정리();
        System.out.println(Arrays.toString(problem.solution(new String[]{".#...", "..#..", "...#."})));
    }
}
