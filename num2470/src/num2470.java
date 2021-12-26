import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;

public class num2470 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int [] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        int start=0;
        int end=N-1;
        int gap=Integer.MAX_VALUE;
        int temp;
        int sum;
        int ans1=0,ans2=0;
        while(start<end){
            sum=arr[start]+arr[end];
            temp=Math.abs(sum);
            if(temp<gap){
                gap=temp;
                ans1=arr[start];
                ans2=arr[end];
            }
            if(sum>0)
                end--;
            else
                start++;
        }
        System.out.println(ans1+" "+ans2);
    }
}
