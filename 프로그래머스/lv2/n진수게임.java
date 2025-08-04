package lv2;

import java.util.*;
class n진수게임 {
    public String solution(int n, int t, int m, int p) {
        StringBuffer answer = new StringBuffer();
        StringBuffer stringNum = new StringBuffer();

        for(int i=0; stringNum.length()<=t*m; i++) {
            stringNum.append(Integer.toString(i, n));
        }

        for(int i=p-1; answer.length() < t; i+=m) {
            answer.append(stringNum.toString().charAt(i));
        }

        return answer.toString().toUpperCase();
    }
}