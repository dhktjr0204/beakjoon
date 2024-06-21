package lv1;

import java.util.HashSet;

public class 폰켓몬 {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> hashSet=new HashSet<>();
        for(int num:nums){
            hashSet.add(num);
        }
        answer=Math.min(nums.length/2, hashSet.size());
        return answer;
    }

    public static void main(String[] args) {
        폰켓몬 poketmon = new 폰켓몬();
        System.out.println(poketmon.solution(new int[]{3,1,2,3}));
    }
}
