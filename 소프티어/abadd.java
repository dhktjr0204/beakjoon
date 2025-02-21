package softeer;

import java.util.Scanner;
import java.util.StringTokenizer;

public class abadd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StringTokenizer st;
        int t= sc.nextInt();

        for(int i=0; i<t; i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            System.out.println("Case #"+(i+1)+": "+(x+y));
        }
    }
}
