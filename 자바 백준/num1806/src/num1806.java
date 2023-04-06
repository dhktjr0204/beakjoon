import java.util.Arrays;
import java.util.Scanner;

public class num1806 {
    private static int left=0;
    private static int right=0;
    private static int answer=100001;
    private static int sum=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        int S=sc.nextInt();

        int arr[]=new int[N];

        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }

        while(true){
            if(sum>=S) {
                sum -= arr[left];
                answer = Math.min(answer, (right - left));
                left++;
            }else if(right==N){
                break;
            }else{
                sum+=arr[right++];
            }
        }
        if(answer==100001){
            System.out.println(0);
        }
        else{
            System.out.println(answer);
        }
    }
}
