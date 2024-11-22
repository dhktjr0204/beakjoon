package lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class 데이터분석 {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        HashMap<String, Integer> map=new HashMap<>();
        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);

        Arrays.sort(data, (a,b)-> a[map.get(sort_by)]-b[map.get(sort_by)]);

        ArrayList<int[]> arr=new ArrayList<>();

        for(int[] d: data){
            if(d[map.get(ext)]<val_ext){
                arr.add(d);
            }
        }
        int[][] answer = new int[arr.size()][4];

        for(int i=0;i<arr.size();i++){
            answer[i]=arr.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        데이터분석 problem = new 데이터분석();
        // [코드번호, 제조일, 최대수량, 현재 수량] / 제조일(ext)이 20300501(val_ext) 이전인 물건들을 수량이 작은 순서대로 정렬
        // ext = code, date, maximum, remain
        System.out.println(Arrays.deepToString(problem.solution(new int[][]{{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}},
                "date", 20300501, "remain")));
    }
}
