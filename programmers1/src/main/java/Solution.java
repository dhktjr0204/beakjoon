class Solution {
    public static void main(String[] args) {
        boolean []signs = new boolean[1000];
        int[] absolutes ={4,-7,12};
        for (int i = 0; i < absolutes.length; i++) {
            if (absolutes[i] >= 0) {
                signs[i] = true;
            } else
                signs[i] = false;

        }
        System.out.print("absolutes=");
        for(int i=0;i<absolutes.length;i++){
            System.out.print(absolutes[i]+" ");
        }
        System.out.println();
        System.out.print("Signs=");
        for(int i=0;i<absolutes.length;i++){
            System.out.print(signs[i]+" ");
        }
        System.out.println();

        System.out.println("result=" + solution(absolutes, signs));
    }
    public static int solution(int[] absolutes, boolean[] signs){
        int answer = 0;
        for(int i=0;i<absolutes.length;i++){
            answer+=absolutes[i];
        }
        return answer;
    }
}