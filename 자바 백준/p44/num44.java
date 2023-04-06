package p44;

import java.util.Scanner;

public class num44 {
    public static int [][] board;
    public static StringBuilder sb=new StringBuilder();

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        board=new int[N][N];

        for (int i=0;i<N;i++){
            String str=sc.next();
            for(int j=0;j<N;j++){
                board[i][j]=str.charAt(j)-'0';
            }
        }

        partition(0,0,N);

        System.out.println(sb);
    }
    public static void partition(int row,int col,int size){
        if(colorCheck(row,col,size)) {
            sb.append(board[row][col]);
            return;
        }
        int newSize=size/2;
        sb.append('(');

        partition(row,col,newSize);
        partition(row+newSize,col,newSize);
        partition(row,col+newSize,newSize);
        partition(row+newSize,col+newSize,newSize);

        sb.append(')');
    }

    public static boolean colorCheck(int row,int col,int size) {
        int color = board[row][col];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (board[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }
}
