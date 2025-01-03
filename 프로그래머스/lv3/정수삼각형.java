package lv3;

public class 정수삼각형 {
    public static void main(String[] args) {
        정수삼각형 problem = new 정수삼각형();
        System.out.println(problem.solution(new int[][]{{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}}));
    }

    public int solution(int[][] triangle) {
        int answer = 0;

        int[][] dp= new int[triangle.length][triangle[triangle.length-1].length];

        dp[0][0]=triangle[0][0];

        for(int i=1; i<triangle.length; i++){
            for(int j=0;j<triangle[i].length; j++){
                if(j==0){
                    dp[i][j]=dp[i-1][j]+triangle[i][j];
                }else if(j==triangle[i].length-1){
                    dp[i][j]=dp[i-1][j-1]+triangle[i][j];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j-1], dp[i-1][j])+triangle[i][j];
                }
            }
        }

        int[] arr=dp[triangle.length-1];

        int max=-1;

        for(int i=0;i<arr.length;i++){
            if(max<=arr[i]){
                max=arr[i];
            }
        }

        return max;
    }
}
