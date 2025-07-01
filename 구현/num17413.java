package silver;

import java.util.*;

public class num17413 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();


        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '<') {
                sb.append(sb1.reverse());
                sb1.delete(0, sb.length());
                while (true) {
                    sb.append(str.charAt(i));
                    if (str.charAt(i) == '>') {
                        break;
                    }
                    i++;
                }
            } else {
                if (str.charAt(i) == ' ') {
                    sb.append(sb1.reverse()).append(" ");
                    sb1.delete(0, sb.length());
                } else {
                    sb1.append(str.charAt(i));
                }
            }
        }
        sb.append(sb1.reverse());
        System.out.println(sb);
    }

}
