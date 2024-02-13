public class 카펫 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        for (int i=1; i<=Math.sqrt(yellow)+1; i++) {
            if (yellow%i==0){
                int a=yellow/i;
                int b=i;
                if ((a+b)*2+4==brown){
                    answer[0]=a+2;
                    answer[1]=b+2;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        카펫 carpet = new 카펫();
        int[] answer=carpet.solution(8,1);
        System.out.println(answer[0]+" "+answer[1]);
    }
}
