import java.util.Arrays;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int worst=0;
        int best=0;
        for(int i=0;i<win_nums.length;i++) {
            int finalI = i;
            if(Arrays.stream(lottos).anyMatch(j -> j == win_nums[finalI]))
                worst++;
            if(lottos[i]==0)
                best++;
        }
        int[] answer = {rank(worst), rank(worst + best)};
        return answer;
    }
    public int rank(int count){
        switch (count){
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
        }
    }
}