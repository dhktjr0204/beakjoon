public class 숫자의표현 {
    public int solution(int n) {
        int answer = 0;
        for (int i=1;i<=n;i++){
            int sum=0;
            for (int j=i; j<=n;j++){
                sum+=j;
                if (sum==n){
                    answer+=1;
                    break;
                }else if (sum>n) break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        숫자의표현 numbering = new 숫자의표현();
        System.out.println(numbering.solution(15));
    }
}
