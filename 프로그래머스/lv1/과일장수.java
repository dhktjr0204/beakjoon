package lv1;

import java.util.*;

public class 과일장수 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        for(int i=score.length-m;i>=0;i-=m){
            answer+=score[i]*m;
        }
        return answer;
    }

    public static void main(String[] args) {
        과일장수 fruit = new 과일장수();
        System.out.println(fruit.solution(3,4,new int[]{1, 2, 3, 1, 2, 3, 1}));
    }
}
