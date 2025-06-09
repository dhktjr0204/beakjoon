package lv2;

import java.util.*;

public class 파일명정렬 {
    public String[] solution(String[] files) {
        String[] answer = new String[files.length];
        List<String[]> arr = new ArrayList<>();

        for(int i=0; i<files.length; i++) {
            int index = 0;
            String[] file = new String[3];
            Arrays.fill(file, "");
            for(char c: files[i].toCharArray()) {
                if(Character.isDigit(c) && index == 0) {
                    index = 1;
                }else if(!Character.isDigit(c) && index == 1) {
                    index = 2;
                }

                if(c == '.') {
                    index = 2;
                }

                file[index] += "" + c;
            }
            arr.add(file);
        }

        Collections.sort(arr, (o1,o2) ->{
            int cmp = o1[0].toLowerCase().compareTo(o2[0].toLowerCase());
            if (cmp != 0) return cmp;
            return Integer.compare(Integer.parseInt(o1[1]), Integer.parseInt(o2[1]));
        });

        for(int i=0; i<answer.length; i++) {
            answer[i] = arr.get(i)[0] + arr.get(i)[1] + arr.get(i)[2];
        }

        return answer;
    }
}