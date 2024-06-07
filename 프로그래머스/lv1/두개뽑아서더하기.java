package lv1;

import java.util.*;

public class 두개뽑아서더하기 {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                int total=numbers[i]+numbers[j];
                if(!arr.contains(total)){
                    arr.add(total);
                }
            }
        }
        Collections.sort(arr);
        int[] answer = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            answer[i]=arr.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        두개뽑아서더하기 addDouble = new 두개뽑아서더하기();
        System.out.println(Arrays.toString(addDouble.solution(new int[]{2, 1, 3, 4, 1})));
    }
}
