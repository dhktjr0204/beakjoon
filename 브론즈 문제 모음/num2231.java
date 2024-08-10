package bronze.브루트포스;

import java.util.Scanner;

public class num2231 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        for(int i=0; i<n; i++){
            int total=i;
            for(char s: String.valueOf(total).toCharArray()){
                total+=Integer.parseInt(String.valueOf(s));
            }
            if(total==n){
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
