package silver;
import java.io.*;
import java.util.*;
public class num1927 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a == 0) {
                System.out.println(pq.isEmpty() ? 0 : pq.poll());
            } else {
                pq.add(a);
            }
        }
    }
}