package lv1;

import java.util.ArrayList;

public class 햄버거 {
    public int solution(int[] ingredient) {
        int answer = 0;

        ArrayList<Integer> hamburger=new ArrayList<>();

        for(int ing: ingredient){
            hamburger.add(ing);

            while(hamburger.size()>=4){
                int n=hamburger.size();

                if(!(hamburger.get(n-1)==1 && hamburger.get(n-2)==3 && hamburger.get(n-3)==2 && hamburger.get(n-4)==1)){
                    break;
                }

                for(int i=0;i<4;i++){
                    hamburger.remove(hamburger.size()-1);
                }
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        햄버거 problem = new 햄버거();
        System.out.println(problem.solution(new int[]{1, 2, 1, 2, 3, 1, 3, 1}));
    }
}
