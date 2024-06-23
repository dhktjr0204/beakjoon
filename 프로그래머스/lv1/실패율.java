package lv1;

import java.util.*;

public class 실패율 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] success=new int[N+2];
        int[] fail=new int[N+2];
        for(int stage:stages){
            for(int i=1;i<=stage;i++){
                success[i]++;
            }
            fail[stage]++;
        }
        System.out.println(Arrays.toString(success));
        System.out.println(Arrays.toString(fail));
        HashMap<Integer,Double> map=new HashMap<>();
        for(int i=1;i<=N;i++){
            if(success[i]==0 || fail[i]==0){
                map.put(i, 0.0);
            }else {
                map.put(i, (double) fail[i] / success[i]);
            }
        }

        ArrayList<Integer> list=new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)-> Double.compare(map.get(b),map.get(a)));

        for(int i=0;i<N;i++){
            answer[i]=list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        실패율 fail = new 실패율();
        System.out.println(Arrays.toString(fail.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3})));
    }
}
