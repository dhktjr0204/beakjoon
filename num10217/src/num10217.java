import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
class AirPlane implements Comparable<AirPlane>{
    int end, money, time;

    public AirPlane(int end, int money, int time) {
        this.end = end;
        this.money = money;
        this.time = time;
    }

    @Override
    public int compareTo(AirPlane o) {
        //시간순으로(시간이 같으면 비용순으로)
        if(this.time==o.time){
            return money-o.money;
        }else{
            return this.time-o.time;
        }
    }
}

public class num10217 {
    static int N,M,K;
    static ArrayList<AirPlane>[] list;
    static long[][] dp;
    static PriorityQueue<AirPlane> pq;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        for (int i = 0; i < T; i++) {
            long answer=Integer.MAX_VALUE;
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            //걸리는 시간 저장하는 dp
            //M은 비용
            dp = new long[N + 1][M + 1];
            list = new ArrayList[N + 1];
            for (int j = 1; j <= N; j++) {
                list[j] = new ArrayList<AirPlane>();
                Arrays.fill(dp[j], Integer.MAX_VALUE);
            }
            for (int j = 0; j < K; j++) {
                st=new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                int d = Integer.parseInt(st.nextToken());

                list[u].add(new AirPlane(v, c, d));
            }

            pq=new PriorityQueue<AirPlane>();
            dp[1][0]=0;
            //시작노드 1
            pq.add(new AirPlane(1,0,0));

            while(!pq.isEmpty()){
                AirPlane cur=pq.poll();
                //목표노드 진입 시 종료
                if(cur.end==N){
                    answer=Math.min(answer,cur.time);
                    break;
                }

                for(AirPlane next: list[cur.end]){
                    int sumCost=cur.money+next.money;
                    if(sumCost>M){
                        continue;
                    }
                    int sumTime=cur.time+next.time;
                    if(dp[next.end][sumCost]>sumTime){
                        dp[next.end][sumCost]=sumTime;
                        pq.offer(new AirPlane(next.end,next.money,next.time));
                    }
                }
            }
            if(answer==Integer.MAX_VALUE){
                bw.write("Poor KCM\n");
            }else{
                bw.write(String.valueOf(answer)+"\n");
            }
            bw.flush();
            bw.close();
            br.close();
        }
    }

}
