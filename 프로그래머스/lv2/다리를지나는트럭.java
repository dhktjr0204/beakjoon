package lv2;

import java.util.*;
public class 다리를지나는트럭 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> q=new LinkedList<>();
        int sum=0;
        for(int t: truck_weights){
            while(true){
                if(q.isEmpty()){
                    q.add(t);
                    sum+=t;
                    answer++;
                    break;
                }
                else if(q.size()==bridge_length){
                    sum-=q.poll();
                }else{
                    //다음 트럭이 최대 무게 초과
                    if(sum+t>weight){
                        q.add(0);
                        answer++;
                    }else{
                        q.add(t);
                        sum+=t;
                        answer++;
                        break;
                    }
                }
            }
        }

        return answer+bridge_length;
    }
}
