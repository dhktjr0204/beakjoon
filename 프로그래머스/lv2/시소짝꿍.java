package lv2;

import java.util.Arrays;
import java.util.HashMap;

public class 시소짝꿍 {
    public long solution(int[] weights) {
        long answer = 0;

        Arrays.sort(weights);

        HashMap<Double, Integer> map=new HashMap<>();
        for(int weight: weights){
            double a= weight*1.0;
            double b= weight*1.0/2.0;
            double c= weight*2.0/3.0;
            double d= weight*3.0/4.0;

            if(map.containsKey(a)) answer+=map.get(a);
            if(map.containsKey(b)) answer+=map.get(b);
            if(map.containsKey(c)) answer+=map.get(c);
            if(map.containsKey(d)) answer+=map.get(d);

            map.put((weight*1.0), map.getOrDefault(weight*1.0,0)+1);
        }
        return answer;
    }

    public static void main(String[] args) {
        시소짝꿍 problem = new 시소짝꿍();
        System.out.println(problem.solution(new int[]{100,180,360,100,270}));
    }
}
