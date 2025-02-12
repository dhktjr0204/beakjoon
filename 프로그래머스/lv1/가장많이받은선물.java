package lv1;
import java.util.*;

public class 가장많이받은선물 {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        ArrayList<String> arr=new ArrayList<>(List.of(friends));

        int N=friends.length;

        int[][] graph= new int[N][N];

        for(int i=0;i<gifts.length; i++){
            String[] trade = gifts[i].split(" ");
            int a=arr.indexOf(trade[0]);
            int b=arr.indexOf(trade[1]);

            graph[a][b]+=1;
        }

        int[][] result=new int[N][3];

        for(int i=0;i<N;i++){
            int sendCnt=0;
            int receiveCnt=0;
            for(int j=0; j<N; j++){
                sendCnt+=graph[i][j];
                receiveCnt+=graph[j][i];
            }

            result[i][0]=sendCnt;
            result[i][1]=receiveCnt;
        }

        for(int i=0;i<N;i++){
            result[i][2]=result[i][0]-result[i][1];
        }

        for(int i=0; i<N; i++){
            int cnt=0;
            for(int j=0; j<N; j++){
                if(i==j){
                    continue;
                }

                if(graph[i][j]>graph[j][i]){
                    cnt++;
                }else if(graph[i][j]==graph[j][i]){
                    if(result[i][2]>result[j][2]){
                        cnt++;
                    }
                }
            }
            answer = Math.max(cnt, answer);

        }

        return answer;
    }


    public static void main(String[] args) {
        가장많이받은선물 problem = new 가장많이받은선물();
        System.out.println(problem.solution(new String[]{"muzi", "ryan", "frodo", "neo"},
                new String[]{"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"}));
    }
}
