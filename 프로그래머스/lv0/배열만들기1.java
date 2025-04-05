package lv0;

public class 배열만들기1 {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];

        for(int i=k; i<=n; i+=k) {
            answer[i/k -1] = i;
        }

        return answer;
    }
}
