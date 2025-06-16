package silver;

import java.io.*;
import java.util.Scanner;

public class num1992 {
    static StringBuffer result = new StringBuffer();
    static String[] matrix;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        matrix = new String[n];

        for (int i = 0; i < n; i++) {
            matrix[i] = sc.next();
        }

        dfs(0, 0, n);

        System.out.println(result.toString());
    }

    public static void dfs(int xStart, int yStart, int count) {
        char startNum = matrix[yStart].charAt(xStart);

        boolean isAllSame = true;
        for (int i = yStart; i < yStart + count; i++) {
            for (int j = xStart; j < xStart + count; j++) {
                if (startNum != matrix[i].charAt(j)) {
                    isAllSame = false;
                    break;
                }
            }
        }

        if (isAllSame) {
            result.append(startNum);
            return;
        }

        result.append('(');

        int newCount = count / 2;
        dfs(xStart, yStart, newCount);
        dfs(xStart + newCount, yStart, newCount);
        dfs(xStart, yStart + newCount, newCount);
        dfs(xStart + newCount, yStart + newCount, newCount);

        result.append(')');
    }
}
