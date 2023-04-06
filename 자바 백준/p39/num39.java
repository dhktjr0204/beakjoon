package p39;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class num39 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        int K=sc.nextInt();

        Deque<Integer> q=new LinkedList<>();

        for(int i=1;i<=N;i++){
            q.add(i);
        }

        StringBuilder sb=new StringBuilder();
        sb.append(q.poll()).append('<');
        while(q.size()>1){
            for(int i=0;i<K-1;i++) {
                int val=q.poll();
                q.offer(val);
            }
            sb.append(q.poll()).append(',');
        }
        sb.append(q.poll()).append('>');
        System.out.println(sb);
    }
}
