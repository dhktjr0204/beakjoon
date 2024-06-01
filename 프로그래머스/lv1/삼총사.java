package lv1;

import java.util.HashSet;

public class 삼총사 {
    public int solution(int[] number) {
        int answer = 0;
        HashSet<Integer> sum = new HashSet<>();
        for(int i=0;i<number.length-2;i++){
            for(int j=i+1;j<number.length-1;j++){
                for(int k=j+1;k<number.length;k++){
                    if(number[i]+number[j]+number[k]==0){
                        answer+=1;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        삼총사 people = new 삼총사();
        System.out.println(people.solution(new int[]{-2,3,0,2,-5}));
    }
}
