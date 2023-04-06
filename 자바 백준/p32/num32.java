package p32;

import java.util.Scanner;
import java.util.Stack;

public class num32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack=new Stack<Integer>();

        int N = sc.nextInt();

        for(int i=0;i<N;i++){
            int num=sc.nextInt();

            if(num==0){
                stack.pop();
            }
            else{
                stack.push(num);
            }
        }
        int sum=0;
        for (int i : stack) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
