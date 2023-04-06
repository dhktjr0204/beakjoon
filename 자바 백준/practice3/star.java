package practice3;

import java.util.Scanner;

public class star {
    static char arr[][];

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        arr=new char[N][N];
        star1(0,0,N,false);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
    static void star1(int x, int y, int N, boolean blank){
        if(blank){
            for (int i=x;i<x+N;i++){
                for(int j=y;j<y+N;j++){
                    arr[i][j]=' ';
                }
            }
            return;
        }

        if(N==1){
            arr[x][y]='*';
            return;
        }

        int size=N/3;//27의 사이즈는 9, 9의 사이즈는 3이라고 생각하니까. 3의 사이즈는 1(정사각형 한개)
        int count=0;
        for(int i=x;i<x+N;i+=size){
            for(int j=y;j<y+N;j+=size){
                count++;
                if(count==5)
                    star1(i,j,size,true);
                else
                    star1(i,j,size,false);
            }
        }
    }
}