package lv0;

public class 수열쿼리4 {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] query: queries) {
            changeArr(query, arr);
        }

        return arr;
    }

    public void changeArr(int[] queries, int[] arr) {
        for(int i=queries[0]; i<=queries[1]; i++) {
            if(i % queries[2] ==0) {
                arr[i]++;
            }
        }
    }
}
