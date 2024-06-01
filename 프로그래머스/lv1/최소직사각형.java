package lv1;

public class 최소직사각형 {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxRow=0;
        int maxColumn=0;
        for(int i=0;i<sizes.length;i++){
            if (sizes[i][0]>sizes[i][1]){
                maxRow=Math.max(maxRow,sizes[i][0]);
                maxColumn=Math.max(maxColumn,sizes[i][1]);
            }else{
                maxRow=Math.max(maxRow,sizes[i][1]);
                maxColumn=Math.max(maxColumn,sizes[i][0]);
            }
        }
        answer=maxRow*maxColumn;
        return answer;
    }

    public static void main(String[] args) {
        최소직사각형 rectangular = new 최소직사각형();
        System.out.println(rectangular.solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
    }
}
