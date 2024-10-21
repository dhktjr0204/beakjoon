package lv1;

import java.util.Arrays;

public class 체육복 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for(int i=0;i<lost.length;i++){
            for(int j=0;j<reserve.length;j++){
                if(reserve[j]==lost[i]){
                    reserve[j]=-1;
                    lost[i]=-1;
                    answer++;
                    break;
                }
            }
        }

        for(int i=0;i<lost.length;i++){
            if(lost[i]==-1){
                continue;
            }

            int min=lost[i]-1;
            int max=lost[i]+1;

            for(int j=0;j<reserve.length;j++){
                if(min==reserve[j] || max==reserve[j]){
                    reserve[j]=-1;
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        체육복 problem = new 체육복();
        System.out.println(problem.solution(5, new int[]{4,5}, new int[]{3,4}));
    }
}
