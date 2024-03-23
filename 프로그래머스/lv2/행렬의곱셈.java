public class 행렬의곱셈 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        for (int i=0;i<arr1.length;i++){
            for (int j=0; j<arr1[0].length;j++){
                for (int k=0;k<arr2[0].length;k++){
                    answer[i][k]+=arr1[i][j]*arr2[j][k];
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        행렬의곱셈 matrix = new 행렬의곱셈();
        System.out.println(matrix.solution(new int[][] {{1,4},{3,2},{4,1}}
                , new int[][] {{3,3},{3,3}}));
    }
}
