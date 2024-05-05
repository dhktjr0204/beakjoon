package lv1;

import java.util.*;

public class 문자열내마음대로정렬하기 {
    public String[] solution(String[] strings, int n) {
        ArrayList<String> arr=new ArrayList<>();
        for(int i=0;i<strings.length;i++){
            arr.add(strings[i].charAt(n)+strings[i]);
        }
        Collections.sort(arr);
        String[] answer = new String[arr.size()];
        for(int i=0;i<arr.size();i++){
            answer[i]=arr.get(i).substring(1,arr.get(i).length());
        }

        return answer;
    }
    public static void main(String[] args) {
        문자열내마음대로정렬하기 sortStr = new 문자열내마음대로정렬하기();
        System.out.println(Arrays.toString(sortStr.solution(new String[]{"sun", "bed", "car"}, 1)));
    }
}
