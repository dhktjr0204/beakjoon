package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class num9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            String s = br.readLine();
            Stack<Character> stack = new Stack<>();
            boolean flag = false;
            for(char c: s.toCharArray()) {
                if (c == '(') {
                    stack.push(c);
                }else if (c == ')'){
                    if(stack.isEmpty()) {
                        flag = true;
                        break;
                    }else{
                        stack.pop();
                    }
                }
            }

            if(!stack.isEmpty() || flag){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
