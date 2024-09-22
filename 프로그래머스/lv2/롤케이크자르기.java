package lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.Stack;

public class 롤케이크자르기 {
    public int solution(int[] topping) {
        int answer = 0;

        HashMap<Integer, Integer> map1=new HashMap<>();
        HashMap<Integer, Integer> map2=new HashMap<>();

        for(int n: topping){
            map2.put(n, map2.getOrDefault(n,0)+1);
        }

        for(int i=0; i<topping.length;i++){
            map1.put(topping[i], map1.getOrDefault(topping[i], 0)+1);

            map2.put(topping[i], map2.get(topping[i])-1);
            if(map2.get(topping[i])==0){
                map2.remove(topping[i]);
            }

            if(map1.size()==map2.size()){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        롤케이크자르기 problem = new 롤케이크자르기();
        System.out.println(problem.solution(new int[]{1, 2, 1, 3, 1, 4, 1, 2}));
    }
}
