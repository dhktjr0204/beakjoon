package p41;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class num41 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        LinkedList<Integer> deque=new LinkedList<>();

        int count=0;

        int N=sc.nextInt();
        int M=sc.nextInt();

        for(int i=1;i<=N;i++){
            deque.offer(i);
        }
        int[] seq=new int[M];

        for(int i=0;i<M;i++){
            seq[i]=sc.nextInt();
        }

        for(int i=0;i<M;i++){
            int target=deque.indexOf(seq[i]);
            int half;

            if(deque.size()%2==0){
                half=deque.size()/2 -1;
            }else{
                half=deque.size()/2;
            }

            if(target<half){
                for(int j=0;j<target;j++){
                    int temp=deque.pollFirst();
                    deque.offerLast(temp);
                    count++;
                }
            }else{
                for(int j=0;j<target;j++){
                    int temp=deque.pollLast();
                    deque.offerFirst(temp);
                    count++;
                }
            }
            deque.pollFirst();
        }
        System.out.println(count);
    }
}
