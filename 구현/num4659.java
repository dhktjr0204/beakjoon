package silver;

import java.util.*;
import java.io.*;

public class num4659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuffer sb = new StringBuffer();
        while (true) {
            String str = sc.next();
            if (str.equals("end")) {
                break;
            }
            sb.append("<" + str + "> is ");

            if (validateString(str)) {
                sb.append("acceptable.\n");
            } else {
                sb.append("not acceptable.\n");
            }

        }

        System.out.println(sb.toString());
    }

    public static boolean validateString(String str) {
        Map<Character, Integer> map = Map.of('a', 1, 'e', 1, 'i', 1, 'o', 1, 'u', 1);

        int moCount = 0;
        int straightMoCount = 0;
        int straightJaCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (i > 0) {
                char previousC = str.charAt(i - 1);
                if (previousC == c && (previousC != 'e' && previousC != 'o')) {
                    return false;
                }
            }

            if (map.get(c) != null) {
                moCount++;
                straightMoCount++;
                straightJaCount = 0;
            } else {
                straightJaCount++;
                straightMoCount = 0;
            }

            if (straightJaCount >= 3 || straightMoCount >= 3) {
                return false;
            }
        }


        if (moCount <= 0) {
            return false;
        }
        return true;
    }
}