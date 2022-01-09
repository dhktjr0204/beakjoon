import java.util.ArrayList;

public class num1644 {
    static boolean prime[]=new boolean[4000001];
    static ArrayList<Integer>arr=new ArrayList<>();
    public static void main(String[] args) {
        int N=4000000;

        prime[0]=prime[1]=true;

        for(int i=2;i<=N;i++){
            if(!prime[i]){
                for(int j=i*i;j<=N;j+=i){
                    prime[j]=true;
                }
            }
        }

        for(int i=1;i<=N;i++){
            if(!prime[i])
                arr.add(i);
        }

        int start=0, end=0, sum=0, count=0;

        while(true){
            if(sum>=N)
                sum-=arr.get(start++);
            else if(end==arr.size())
                break;
            else
                sum+=arr.get(end++);
            if(N==sum)
                count++;
        }
        System.out.println(count);

    }
}
