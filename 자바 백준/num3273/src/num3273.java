import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class num3273 {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        arr=new int[n];

        int start=0;
        int count=0;
        int end=n-1;
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        int x=sc.nextInt();

        while(start<end){
            sum=arr[start]+arr[end];
            if(sum==x){
                count++;
            }
            if(sum<=x){
                start++;
            }
            else{
                end--;
            }
        }
        System.out.println(count);

    }
}
