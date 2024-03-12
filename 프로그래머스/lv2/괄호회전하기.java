import java.util.Stack;

public class 괄호회전하기 {
    public int solution(String s) {
        int answer = 0;
        for (int i=0;i<s.length();i++){
            Stack<Character> stack = new Stack<>();
            String str=s.substring(i,s.length())+s.substring(0,i);
            for (char c: str.toCharArray()){
                if (stack.isEmpty()) stack.push(c);
                else if (c==')' && stack.peek()=='(') stack.pop();
                else if (c==']' && stack.peek()=='[') stack.pop();
                else if (c=='}' && stack.peek()=='{') stack.pop();
                else stack.push(c);
            }
            if (stack.isEmpty()){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        괄호회전하기 ss = new 괄호회전하기();
        System.out.println(ss.solution("[](){}"));
    }
}
