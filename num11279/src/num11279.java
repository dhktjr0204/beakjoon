import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class num11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int N=Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue=new PriorityQueue<>(((o1, o2) ->o2- o1 ));
        for(int i=0;i<N;i++){
            int n=Integer.parseInt(br.readLine());
            if(n==0){
                if(queue.isEmpty()){
                    System.out.println(0);
                }
                else{
                    System.out.println(queue.poll());
                }
            }else{
                queue.offer(n);
            }
        }
    }
}
