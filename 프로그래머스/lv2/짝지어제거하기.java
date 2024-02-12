import java.util.Stack;

public class 짝지어제거하기 {
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<s.length(); i++){
            if (stack.size()==0) stack.push(s.charAt(i));
            else if (stack.peek()==s.charAt(i)) stack.pop();
            else stack.push(s.charAt(i));
        }
        if (stack.size()==0) return 1;
        else return 0;
    }

    public static void main(String[] args) {
        짝지어제거하기 removePair = new 짝지어제거하기();
        System.out.println(removePair.solution("baabaa"));
    }
}
