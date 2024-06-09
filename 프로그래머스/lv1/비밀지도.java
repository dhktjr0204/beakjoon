package lv1;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.String.*;

public class 비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0;i<n;i++){
            String str=Integer.toBinaryString(arr1[i]|arr2[i]);
            //5자리 문자열 형태로 만들기
            str=String.format("%"+n+"s",str);
            str=str.replaceAll("1","#");
            str=str.replaceAll("0"," ");
            answer[i]=str;
        }
        return answer;
    }

    public static void main(String[] args) {
        비밀지도 secretMap = new 비밀지도();
        System.out.println(Arrays.toString(secretMap.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28})));
    }
}
