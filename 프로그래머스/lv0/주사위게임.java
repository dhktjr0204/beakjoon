package lv1;

import java.util.*;

public class 주사위게임 {
    public int solution(int a, int b, int c, int d) {
        HashMap<Integer, Integer> map=new HashMap<>();

        map.put(a, map.getOrDefault(a, 0)+1);
        map.put(b, map.getOrDefault(b, 0)+1);
        map.put(c, map.getOrDefault(c, 0)+1);
        map.put(d, map.getOrDefault(d, 0)+1);

        ArrayList<Integer> arr=new ArrayList<>(map.keySet());

        Collections.sort(arr, (i,j)-> map.get(j)==map.get(i) ? i - j : map.get(j)-map.get(i));

        if(arr.size()==1){
            return 1111*arr.get(0);
        }else if(arr.size()==2){
            int p1=arr.get(0);
            int p2=arr.get(1);

            int cnt1=map.get(p1);
            int cnt2=map.get(p2);

            if(cnt1==cnt2){
                return (p1+p2) * Math.abs(p1-p2);
            }else{
                return (int)Math.pow(10*p1+p2,2);
            }
        }else if(arr.size()==3){
            int q=arr.get(1);
            int r=arr.get(2);

            return q*r;
        }else{
            return arr.get(0);
        }
    }
}