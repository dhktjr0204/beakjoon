public class 점프와순간이동 {
    public int solution(int n) {
        int ans = 0;
        while (n!=0){
            if (n%2!=0) ans++;
            n=n/2;
        }
        return ans;
    }

    public static void main(String[] args) {
        점프와순간이동 jumpOrTele = new 점프와순간이동();
        System.out.println(jumpOrTele.solution(5));
    }
}
