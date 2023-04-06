package p34;

import java.util.Scanner;
import java.util.Stack;

public class num34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        while(true){
            str=sc.nextLine();
            System.out.println(solve(str));
            if(str=="."){
                break;
            }
        }
    }
    public static String solve(String s){
        Stack<Character> stack=new Stack<>();
        Stack<Character> stack1=new Stack<>();
        for(int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            if (c=='('){
                stack.push(c);
            }
            else if(c==')'){
                if(stack.empty()){
                    return "NO";
                }
                stack.pop();
            }
            else if (c=='['){
                stack1.push(c);
            }
            else if(c==']'){
                if(stack1.empty()){
                    return "NO";
                }
                stack1.pop();
            }
        }
        if(stack.empty()&&stack1.empty()){
            return "YES";
        }
        else {
            return "NO";
        }
    }
}
