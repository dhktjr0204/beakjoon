package lv1;

import java.util.Arrays;

public class k번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0;i<commands.length;i++){
            int[] newArr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1] );
            Arrays.sort(newArr);
            answer[i]=newArr[commands[i][2]-1];
        }
        return answer;
    }

    public static void main(String[] args) {
        k번째수 kNum = new k번째수();
        System.out.println(Arrays.toString(kNum.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})));
    }
}
