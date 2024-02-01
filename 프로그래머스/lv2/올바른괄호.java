import java.util.Stack;

public class 올바른괄호 {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<s.length(); i++){
            if (s.charAt(i)=='('){
                stack.push('(');
            }else{
                if (stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        올바른괄호 collect = new 올바른괄호();
        System.out.println(collect.solution("()()"));
    }
}
