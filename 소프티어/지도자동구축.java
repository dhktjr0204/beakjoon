package softeer;
import java.io.*;
import java.util.*;

public class 지도자동구축 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        if(N==1){
            System.out.println(9);
        }else{
            System.out.println((int)Math.pow(2*N+1,2));
        }
    }
}
