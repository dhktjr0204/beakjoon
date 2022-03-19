package p37;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.LinkedList;

public class num37{

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();

        Deque<Integer> q=new LinkedList<>();

        int N=Integer.parseInt(br.readLine());

        StringTokenizer command;

        while(N-->0){
            command=new StringTokenizer(br.readLine()," ");

            switch (command.nextToken()){
                case "push":
                    q.offer(Integer.parseInt(command.nextToken()));
                    break;
                case "pop":
                    Integer item=q.poll();
                    if(item==null){
                        sb.append(-1).append('\n');
                    }else{
                        sb.append(item).append('\n');
                    }
                    break;
                case "size":
                    sb.append(q.size()).append('\n');
                    break;
                case "empty":
                    if(q.isEmpty()) {
                        sb.append(1).append('\n');
                    }else{
                        sb.append(0).append('\n');
                    }
                    break;
                case "front":
                    Integer it=q.peek();
                    if(it==null) {
                        sb.append(-1).append('\n');
                    }else{
                        sb.append(it).append('\n');

                    }
                    break;
                case "back":
                    Integer ite=q.peekLast();
                    if(ite==null) {
                        sb.append(-1).append('\n');
                    }else{
                        sb.append(ite).append('\n');

                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}