package lv1;

import java.util.ArrayList;
import java.util.Arrays;

public class 모의고사 {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] person1={1,2,3,4,5};
        int[] person2={2,1,2,3,2,4,2,5};
        int[] person3={3,3,1,1,2,2,4,4,5,5};
        int[] cnt={0,0,0};

        for(int i=0;i<answers.length;i++){
            if(answers[i]==person1[i%5]){
                cnt[0]++;
            }
            if(answers[i]==person2[i%8]){
                cnt[1]++;
            }
            if(answers[i]==person3[i%10]){
                cnt[2]++;
            }
        }
        ArrayList<Integer> result=new ArrayList<>();
        int max=Math.max(Math.max(cnt[0],cnt[1]),cnt[2]);
        for(int i=0;i<3;i++){
            if(max==cnt[i]){
                result.add(i+1);
            }
        }
        answer=new int[result.size()];
        for(int i=0;i<result.size();i++){
            answer[i]=result.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        모의고사 test = new 모의고사();
        System.out.println(Arrays.toString(test.solution(new int[]{1, 2, 3, 4, 5})));
    }
}
