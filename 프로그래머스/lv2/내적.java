public class 내적 {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i=0;i<a.length;i++){
            answer+=a[i]*b[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        내적 inner = new 내적();
        System.out.println(inner.solution(new int[]{1, 2, 3, 4},new int[]{-3,-1,0,2}));
    }
}
