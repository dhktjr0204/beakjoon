import java.util.Scanner;

public class num2805 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        int M=sc.nextInt();
        int arr[]=new int[N];
        int max=0;
        int min=0;
        for(int i=0;i<N;i++){
            arr[i]= sc.nextInt();

            if(max<arr[i]){
                max=arr[i];
            }
        }

        while(min<max) {
            int mid=(max+min)/2;
            int sum=0;
            for(int i=0;i<N;i++) {
                if(arr[i]-mid>0){
                    sum+=arr[i]-mid;
                }
            }
            if(sum<M){
                max=mid;
            }else{
                min=mid+1;
            }
        }
        System.out.println(min-1);
    }
}
