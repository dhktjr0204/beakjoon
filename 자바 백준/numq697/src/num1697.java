import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class num1697 {
    static int N;
    static int K;
    static int[] check=new int[10001];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        K=sc.nextInt();

        if(N==K){
            System.out.println(0);
        }else{
            BFS(N);
        }
    }
    public static void BFS(int n){
        Queue<Integer> q=new LinkedList<>();
        q.add(n);
        check[n]=1;
        while(!q.isEmpty()){
            int temp=q.poll();

            for(int i=0;i<3;i++){
                int next;
                if(i==0){
                    next=temp+1;
                }else if(i==1){
                    next=temp-1;
                }else
                    next=temp*2;

                if(next==K){
                    System.out.println(check[temp]);
                    return;
                }
                if(next>=0 && next < check.length &&check[next]==0){
                    q.add(next);
                    check[next]=check[temp]+1;
                }
            }
        }
    }
}
