public class 약수의개수와덧셈 {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left;i<right+1;i++){
           if (i%Math.sqrt(i)==0){
               answer-=i;
           }else{
               answer+=i;
           }
        }
        return answer;
    }

    public static void main(String[] args) {
        약수의개수와덧셈 numbering = new 약수의개수와덧셈();
        System.out.println(numbering.solution(13,17));
    }
}
