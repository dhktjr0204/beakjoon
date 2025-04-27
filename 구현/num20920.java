package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class num20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.length() >= m) {
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }

        List<String> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> {
            if (!map.get(o1).equals(map.get(o2))) {
                return map.get(o2) - map.get(o1);
            } else if (o1.length() != o2.length()) {
                return o2.length() - o1.length();
            } else {
                return o1.compareTo(o2);
            }
        });

        StringBuilder sb = new StringBuilder();
        for(String str: list) {
            sb.append(str + "\n");
        }
        System.out.println(sb);
    }
}
