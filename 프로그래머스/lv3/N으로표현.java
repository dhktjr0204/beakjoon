package lv3;
import java.util.*;

public class N으로표현 {
    public int solution(int N, int number) {
        if(N==number){
            return 1;
        }

        List<Set<Integer>> dp=new ArrayList<>();

        for(int i=0; i<=8; i++) {
            dp.add(new HashSet<>());
        }

        dp.get(1).add(N);

        for(int i=2; i<=8; i++){
            Set<Integer> countSet=dp.get(i);

            for(int j=1; j<=i; j++){
                Set<Integer> preSet= dp.get(j);
                Set<Integer> postSet= dp.get(i-j);

                for(int preNum: preSet){
                    for(int postNum: postSet){
                        countSet.add(preNum+postNum);
                        countSet.add(preNum-postNum);
                        countSet.add(preNum*postNum);
                        if(preNum!=0 && postNum!=0){
                            countSet.add(preNum/postNum);
                        }
                    }
                }
            }
            countSet.add(Integer.parseInt(String.valueOf(N).repeat(i)));
        }

        for(Set<Integer> sub: dp){
            if(sub.contains(number)){
                return dp.indexOf(sub);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        N으로표현 problem = new N으로표현();
        System.out.println(problem.solution(5,12));
    }
}
