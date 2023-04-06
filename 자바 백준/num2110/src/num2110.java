import java.util.Arrays;
import java.util.Scanner;

public class num2110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int arr[] = new int[N];
        int answer=0;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int left=1;
        int right=arr[N-1]-arr[0];
        while(left<=right){
            int mid=(left+right)/2;
            int prev=arr[0];
            int count=1;
            for(int i=0;i<N;i++){
                int dis=arr[i]-prev;
                if(dis>=mid){
                    count++;
                    prev=arr[i];
                }
;            }
            if(count>=M){
                left=mid+1;
                answer=mid;
            }else{
                right=mid-1;
            }
        }
        System.out.println(answer);
    }

}
