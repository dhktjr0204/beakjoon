import java.util.Arrays;

public class 최솟값만들기 {
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for (int i=0; i<A.length; i++){
            answer+=A[i]*B[B.length-1-i];
        }
        return answer;
    }

    public static void main(String[] args) {
        최솟값만들기 makeMin = new 최솟값만들기();
        System.out.println(makeMin.solution(new int[]{1, 4, 2}, new int[]{5, 4, 4}));
    }
}

