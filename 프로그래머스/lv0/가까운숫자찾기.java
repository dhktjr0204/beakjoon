package lv0;

public class 가까운숫자찾기 {
    public int solution(int[] arr, int idx) {
        int answer = -1;

        for(int i=idx; i<arr.length; i++) {
            if(arr[i] == 1) {
                return i;
            }
        }

        return answer;
    }
}
