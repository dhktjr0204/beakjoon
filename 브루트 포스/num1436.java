package silver;

import java.util.Scanner;

public class num1436 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=0;
        int movie=665;
        while(n!=cnt){
            movie++;
            if(String.valueOf(movie).contains("666")){
                cnt++;
            }
        }
        System.out.println(movie);
    }
}
