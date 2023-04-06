import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class num1655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int N=Integer.parseInt(br.readLine());

        StringBuilder sb=new StringBuilder();

        PriorityQueue<Integer> minHeap=new PriorityQueue<>(((o1, o2) -> o1-o2));
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(((o1, o2) -> o2-o1));

        for(int i=0;i<N;i++){
            int n=Integer.parseInt(br.readLine());

            if(minHeap.size()==maxHeap.size())
                maxHeap.offer(n);
            else
                minHeap.offer(n);

            if(!minHeap.isEmpty() && !maxHeap.isEmpty()){
                if(minHeap.peek()<maxHeap.peek()){
                    if(maxHeap.peek()>minHeap.peek()){
                        int temp=maxHeap.poll();
                        maxHeap.offer(minHeap.poll());
                        minHeap.offer(temp);
                    }
                }
                sb.append(maxHeap.peek()).append(("\n"));
            }
        }System.out.println(sb);
    }
}
