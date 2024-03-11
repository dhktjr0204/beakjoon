import java.util.HashSet;

public class 연속부분수열합의개수 {
    public int solution(int[] elements) {
        HashSet<Integer> result = new HashSet<>();
        for(int i=0;i<elements.length;i++){
            int ssum=elements[i];
            result.add(ssum);
            for(int j=i+1;j<i+elements.length;j++){
                ssum+=elements[j%elements.length];
                result.add(ssum);
            }
        }
        return result.size();
    }

    public static void main(String[] args) {
        연속부분수열합의개수 sum_N = new 연속부분수열합의개수();
        System.out.println(sum_N.solution(new int[]{7, 9, 1, 1, 4}));
    }
}
