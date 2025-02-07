package lv1;

import java.util.*;

public class 선분길이 {
    public int solution(int[][] lines) {
        int answer = 0;

        int[] dpl=new int[201];

        for(int[] line: lines){
            int x=line[0];
            int y=line[1];

            for(int i=x+1; i<=y; i++){
                dpl[i+100]++;
            }
        }


        for(int i=0;i<201;i++){
            if(dpl[i]>1){
                answer++;
            }
        }

        return answer;
    }
}
