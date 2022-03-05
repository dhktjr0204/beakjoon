package p45;

import java.util.Scanner;

public class num45 {
    public static int min=0;
    public static int zero=0;
    public static int plus=0;
    public static int[][] board;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        board=new int[N][N];

        for(int i=0;i<N;i++){
            String str=sc.next();
            for(int j=0;j<N;j++){
                board[i][j]=str.charAt(j)-'0';
            }
        }
        partition(0,0,N);
        System.out.println(min);
        System.out.println(zero);
        System.out.println(plus);
    }
    public static void partition(int row,int col,int size){
        if(colorCheck(row,col,size)){
            if(board[row][col]==-1){
                min++;
            }
            else if(board[row][col]==0){
                zero++;
            }
            else if(board[row][col]==1){
                plus++;
            }
            return;
        }
        int newSize = size / 3;

        partition(row, col, newSize);								// 왼쪽 위
        partition(row, col + newSize, newSize);						// 중앙 위
        partition(row, col + 2 * newSize, newSize);					// 오른쪽 위

        partition(row + newSize, col, newSize);						// 왼쪽 중간
        partition(row + newSize, col + newSize, newSize);			// 중앙 중간
        partition(row + newSize, col + 2 * newSize, newSize);		// 오른쪽 중간

        partition(row + 2 * newSize, col, newSize);					// 왼쪽 아래
        partition(row + 2 * newSize, col + newSize, newSize);		// 중앙 아래
        partition(row + 2 * newSize, col + 2 * newSize, newSize);

    }
    public static boolean colorCheck(int row,int col,int size){
        int color=board[row][col];
        for(int i=row;i<row+size;i++){
            for(int j=col;j<col+size;j++){
                if(board[i][j]!=color){
                    return false;
                }
            }
        }
        return true;
    }
}
