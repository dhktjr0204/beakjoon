package p29;

import java.util.Scanner;

public class num29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();

        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]= sc.nextInt();
        }
        int a;
        for(int i=1;i<N;i++){
            a=arr[0]/arr[i];
            if(a==0){
                int b=arr[i]/arr[0];
                System.out.println("1/"+b);
            }else{
                System.out.println(a+"/1");
            }
        }
    }
}
