package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class num1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        LinkedList<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        int cnt = 0;
        for (int i = 0; i < m; i++) {
            int t = Integer.parseInt(st.nextToken());
            int idx = q.indexOf(t);
            if (idx == 0) {
                q.poll();
            } else if (idx <= q.size() / 2) {
                while(q.peekFirst() != t) {
                    q.addLast(q.pollFirst());
                    cnt++;
                }
                q.pollFirst();
            } else {
                while (q.peekFirst() != t) {
                    q.addFirst(q.pollLast());
                    cnt++;
                }
                q.pollFirst();
            }
        }
        System.out.println(cnt);
    }
}
