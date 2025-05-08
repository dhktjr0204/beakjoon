package silver;

import java.util.Scanner;

public class num1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        String[] calBundle = st.split("-");

        int[] sum = new int[calBundle.length];
        for(int i=0; i< calBundle.length; i++) {
            String[] plusString = calBundle[i].split("\\+");

            for(int j=0; j< plusString.length; j++) {
                sum[i] += Integer.parseInt(plusString[j]);
            }
        }

        int answer = sum[0];
        for(int i=1; i<calBundle.length; i++) {
            answer -= sum[i];
        }

        System.out.println(answer);
    }
}
