package silver;
import java.io.*;
import java.util.*;
public class num1913 {
    static int num;
    static String location;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        num = sc.nextInt();

        int rowStart = 0;
        int columnStart = 0;
        int rowEnd = n - 1;
        int columnEnd = n - 1;

        int[][] snail = new int[n][n];

        int current = n * n;
        location = "";
        while (current > 0) {
            for (int i = columnStart; i <= columnEnd; i++) {
                validateNum(current, i, rowStart);
                snail[i][rowStart] = current;
                current--;
            }
            rowStart++;

            for (int i = rowStart; i <= rowEnd; i++) {
                validateNum(current, columnEnd, i);
                snail[columnEnd][i] = current;
                current--;
            }
            columnEnd--;

            for (int i = columnEnd; i >= columnStart; i--) {
                validateNum(current, i, rowEnd);
                snail[i][rowEnd] = current;
                current--;
            }
            rowEnd--;

            for (int i = rowEnd; i >= rowStart; i--) {
                validateNum(current, columnStart, i);
                snail[columnStart][i] = current;
                current--;
            }
            columnStart++;
        }

        for (int[] rowList : snail) {
            for (int i : rowList) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println(location);

    }

    public static void validateNum(int current, int row, int column) {
        if (current == num) {
            location = row + 1 + " " + (column + 1);
        }
    }
}
