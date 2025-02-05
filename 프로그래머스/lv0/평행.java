package lv1;

import java.util.*;

public class 평행 {
    public int solution(int[][] dots) {
        int answer = 0;

        double m12 = (dots[1][1] - dots[0][1])/(double)(dots[1][0] - dots[0][0]);
        double m13 = (dots[2][1] - dots[0][1])/(double)(dots[2][0] - dots[0][0]);
        double m14 = (dots[3][1] - dots[0][1])/(double)(dots[3][0] - dots[0][0]);
        double m23 = (dots[2][1] - dots[1][1])/(double)(dots[2][0] - dots[1][0]);
        double m24 = (dots[3][1] - dots[1][1])/(double)(dots[3][0] - dots[1][0]);
        double m34 = (dots[3][1] - dots[2][1])/(double)(dots[3][0] - dots[2][0]);

        if(m12 == m34) return 1;
        if(m13 == m24) return 1;
        if(m14 == m23) return 1;

        return answer;
    }
}