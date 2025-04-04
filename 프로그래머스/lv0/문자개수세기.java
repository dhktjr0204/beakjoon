package lv0;

public class 문자개수세기 {
    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for(char c: my_string.toCharArray()) {
            int n = (int) c;
            if(n >= 'a') {
                answer[n - 'a' + 26]++;
            }else{
                answer[n - 'A']++;
            }
        }

        return answer;
    }
}
