package lv2;

import java.util.*;
public class 귤고르기 {
    public int solution(int k, int[] tangerine) {
        int sum=0;
        int answer = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int n:tangerine){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        ArrayList<Integer> valueList = new ArrayList<>(map.values());
        Collections.sort(valueList,Collections.reverseOrder());
        for (int v: valueList){
            if (sum+v>=k){
                answer++;
                break;
            }else{
                sum+=v;
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        귤고르기 selectTangerine = new 귤고르기();
        System.out.println(selectTangerine.solution(6,new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
    }
}
