package lv1;

import java.util.*;

public class 배열조각 {
    public int[] solution(int[] arr, int[] query) {
        int[] copyArr=arr;
        for(int i = 0; i<query.length; i++){
            if(i%2 == 0){
                copyArr = Arrays.copyOfRange(copyArr, 0 ,query[i]+1);
            }else{
                copyArr = Arrays.copyOfRange(copyArr, query[i], copyArr.length);
            }
        }

        return copyArr;
    }
}
