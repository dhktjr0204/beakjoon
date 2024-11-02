package lv1;

import java.util.Stack;

public class 인형뽑기 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack=new Stack<>();

        for(int m: moves){
            for(int i=0;i<board.length;i++){
                if(board[i][m-1]!=0){

                    int currentDoll=board[i][m-1];
                    board[i][m-1]=0;
                    if(!stack.isEmpty() && stack.peek()==currentDoll){
                        stack.pop();
                        answer+=2;
                    }else{
                        stack.push(currentDoll);
                    }
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        인형뽑기 problem = new 인형뽑기();
        System.out.println(problem.solution(new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}},
                new int[]{1,5,3,5,1,2,1,4}));
    }
}
