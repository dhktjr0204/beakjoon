public class 예상대진표 {
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        while (true){
            System.out.println(a+" "+b);
            if (a!=b) answer++;
            else break;
            a= (a+1)/2;
            b= (b+1)/2;
        }
        return answer;
    }

    public static void main(String[] args) {
        예상대진표 expectTeam = new 예상대진표();
        System.out.println(expectTeam.solution(8,2,1));
    }
}
