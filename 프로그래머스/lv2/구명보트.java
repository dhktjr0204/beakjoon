package lv2;

import java.util.Arrays;
public class 구명보트 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int index=0;
        for (int i=people.length-1;i>=index;i--){
            if(people[i]+people[index]<=limit){
                index++;
                answer++;
            }
            else answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        구명보트 boat = new 구명보트();
        System.out.println(boat.solution(new int[]{70, 50, 80, 50},100));
    }
}