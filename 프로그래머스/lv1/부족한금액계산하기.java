public class 부족한금액계산하기 {
    public long solution(int price, int money, int count) {
        long answer;
        long total=0;
        for(int i=1;i<count+1;i++){
            total+=price*i;
        }
        if (total>money){
            answer=total-money;
        }else{
            answer=0;
        }

        return answer;
    }

    public static void main(String[] args) {
        부족한금액계산하기 calculation = new 부족한금액계산하기();
        System.out.println(calculation.solution(3,20,4));
    }
    
}
