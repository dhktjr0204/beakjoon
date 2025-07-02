package silver;
import java.util.*;

public class num1522 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int aCount = 0;
        for(char c: s.toCharArray()) {
            if (c == 'a') {
                aCount++;
            }
        }

        s = s + s;

        int result = Integer.MAX_VALUE;
        for (int i = 0; i < s.length() - aCount; i++) {
            int bCount = 0;
            for (int j = i; j < i + aCount; j++) {
                if(s.charAt(j) == 'b') {
                    bCount++;
                }
            }
            result = Math.min(bCount, result);
        }

        System.out.println(result);
    }
}