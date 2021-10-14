import java.util.Scanner;

public class num1300 {
    public static int N;
    public static  int k;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        N=sc.nextInt();
        k=sc.nextInt();
        long result=0;
        long low=1;
        long high=k;

        while(low<high){
            long mid=(low+high)/2;
            long count=Count(mid);
            if(count>=k){
                result=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
    }
    public static long Count(long mid){
        long count=0;
        for(int i=1;i<=N;i++){
            count+=Math.min(mid/i,N);
        }
        return count;
    }

}
