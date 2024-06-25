package lv1;

import java.util.StringTokenizer;

public class 다트게임 {
    public int solution(String dartResult) {
        int[] score=new int[3];
        String num="";
        int n=0, idx=0;
        for(int i=0;i<dartResult.length();i++) {
            char c = dartResult.charAt(i);
            if (c >= '0' && c <= '9') {
                num += String.valueOf(c);
            } else if (c == 'S' || c == 'D' || c == 'T') {
                n = Integer.parseInt(num);
                if (c == 'S') {
                    score[idx++] = (int) Math.pow(n, 1);
                } else if (c == 'D') {
                    score[idx++] = (int) Math.pow(n, 2);
                } else {
                    score[idx++] = (int) Math.pow(n, 3);
                }
                num = "";
            } else {
                if (c == '*') {
                    score[idx - 1] *= 2;
                    if (idx - 2 >= 0) {
                        score[idx - 2] *= 2;
                    }
                } else {
                    score[idx - 1] *= -1;
                }
            }
        }
        return score[0]+score[1]+score[2];
    }

    public static void main(String[] args) {
        다트게임 game = new 다트게임();
        System.out.println(game.solution("1S2D*3T"));
    }
}
