package lv1;

public class 기사단원무기 {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i=1;i<=number;i++){
            int cnt=countDivisor(i);
            if(cnt>limit){
                cnt=power;
            }
            answer+=cnt;
        }
        return answer;
    }
    static int countDivisor(int n){
        int cnt=0;
        for(int i=1;i*i<=n;i++){
            if(i*i==n){
                cnt++;
            }else if(n%i==0){
                cnt+=2;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        기사단원무기 weapon = new 기사단원무기();
        System.out.println(weapon.solution(5,3,2));
    }
}
