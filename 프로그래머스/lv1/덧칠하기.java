package lv1;

public class 덧칠하기 {
    public int solution(int n, int m, int[] section) {
        int answer=1;
        int start=section[0];
        int end=section[0]+(m-1);
        for(int i: section){
            if(i>=start && i<=end){
                continue;
            }else{
                start=i;
                end=i+(m-1);
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        덧칠하기 paint = new 덧칠하기();
        System.out.println(paint.solution(8,4,new int[]{2,3,6}));
    }
}
