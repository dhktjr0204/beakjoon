package p47;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class num47 {
    public static int[] histogram;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb=new StringBuilder();

        int N;
        while(true){
            st=new StringTokenizer(br.readLine(),"");

            N=Integer.parseInt(st.nextToken());

            if(N==0){
                break;
            }

            histogram=new int[N];

            for(int i=0;i<N;i++){
                histogram[i]=Integer.parseInt(st.nextToken());
            }
            sb.append(getArea(0,N-1)).append('\n');
            histogram=null;
        }
        System.out.println(sb);
    }
    public static long getArea(int lo,int hi){
        if(lo==hi){
            return histogram[lo];
        }
        int mid=(lo+hi)/2;

        long leftArea=getArea(lo,mid);
        long rightArea=getArea(mid+1,hi);

        long max=Math.max(leftArea,rightArea);
        max=Math.max(max,getMidArea(lo,hi,mid));
        return max;
    }
    public static long getMidArea(int lo,int hi,int mid){
        int toLeft=mid;
        int toRigth=mid;
        long heigth=histogram[mid];

        long maxArea=heigth;

        while(lo<toLeft && toRigth<hi){
            if(histogram[toLeft-1]<histogram[toRigth+1]){
                toRigth++;
                heigth=Math.min(heigth,histogram[toRigth]);
            }
            else{
                toLeft--;
                heigth=Math.min(heigth,histogram[toLeft]);
            }
            maxArea=Math.max(maxArea,heigth*(toRigth-toLeft+1));
        }
        while(toRigth<hi){
            toRigth++;
            heigth=Math.min(heigth,histogram[toRigth]);
            maxArea=Math.max(maxArea,(toRigth-toLeft+1));
        }
        while(lo<toLeft){
            toLeft--;
            heigth=Math.min(heigth,histogram[toLeft]);
            maxArea=Math.max(maxArea,(toRigth-toLeft+1));
        }
        return maxArea;
    }
}