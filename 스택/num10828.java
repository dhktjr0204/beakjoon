package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class num10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String s1 = st.nextToken();
            switch (s1) {
                case "push":
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "top":
                    if (stack.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack.peek());
                    }
                    break;
                case "empty":
                    System.out.println(stack.isEmpty() ? 1: 0);
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "pop":
                    if (stack.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack.pop());
                    }
                    break;
            }
        }
    }
}
