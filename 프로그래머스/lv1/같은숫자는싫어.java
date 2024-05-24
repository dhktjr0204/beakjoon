package lv1;

import java.util.ArrayList;
import java.util.Arrays;

public class 같은숫자는싫어 {
    public int[] solution(int []arr) {
        ArrayList<Integer> result=new ArrayList<>();
        int a=-1;
        for(int i=0;i<arr.length;i++){
            if(a!=arr[i]){
                result.add(arr[i]);
            }
            a=arr[i];
        }
        int[] answer=new int[result.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=result.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        같은숫자는싫어 noSameNum = new 같은숫자는싫어();
        System.out.println(Arrays.toString
                (noSameNum.solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
    }
}
