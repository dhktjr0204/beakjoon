package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class num5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < t; i++) {
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(), "[],");
            LinkedList<Integer> q = new LinkedList<>();

            for (int j = 0; j < n; j++) {
                q.add(Integer.parseInt(st.nextToken()));
            }

            boolean isRight = true;
            boolean flag = false;
            for (char c : p.toCharArray()) {
                if (c == 'R') {
                    isRight = !isRight;
                } else {
                    if (q.size() == 0) {
                        flag = true;
                        break;
                    } else {
                        if (isRight) {
                            q.pollFirst();
                        } else {
                            q.pollLast();
                        }
                    }
                }
            }

            if (flag) {
                result.append("error\n");
            } else {
                result.append("[");
                while (!q.isEmpty()) {
                    result.append(isRight ? q.pollFirst() : q.pollLast());
                    if (!q.isEmpty()) {
                        result.append(",");
                    }
                }
                result.append("]\n");
            }
        }
        System.out.println(result);
    }
}
