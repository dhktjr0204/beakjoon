import java.io.*;
import java.util.StringTokenizer;

public class num2618 {
    private static int [][] dp=new int[1002][1002];
    private static int [][] list=new int[1002][2];
    private static int N,T;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        N=Integer.parseInt(br.readLine());
        T=Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            list[i][0]=Integer.parseInt(st.nextToken());
            list[i][1]=Integer.parseInt(st.nextToken());
        }

        bw.write(String.valueOf(police(1,0,0))+"\n");

        int index_one=0;
        int index_two=0;

        for(int i=1;i<T;i++){
            int one_remain=distance(1,index_one,i);
            if(dp[index_one][index_two]-one_remain==dp[i][index_two]) {
                index_one = i;
                bw.write("1\n");
            }else{
                index_two=i;
                bw.write("2\n");
            }

        }
    }
    //dp[1][0]은 첫번째 경찰차가 첫번째 사건을 맡는 경우
    //dp[0][0]에는 모든 사건을 해결 하고 나서의 최소값이 저장되어있음
    public static int police(int index,int one,int two){
        if(index>T)
            return 0;
        if(dp[one][two]!=0)
            return dp[one][two];

        int one_move=police(index+1,index,two)+distance(1,one,index);
        int two_move=police(index+1,one,index)+distance(2,two,index);
        dp[one][two]=Math.min(one_move,two_move);
        return dp[one][two];
    }
    public static int distance(int sep,int start,int end){
        int x_start=list[start][0],y_start=list[start][1];//x,y좌표찍음
        int x_end=list[end][0],y_end=list[end][1];

        if(start==0){
            if(sep==1){
                x_start=y_start=1;
            }
            else{
                x_start=y_start=N;
            }
        }
        return Math.abs(x_start-x_end)+Math.abs(y_start-y_end);
    }
}

