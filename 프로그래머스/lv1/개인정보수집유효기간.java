package lv1;

import java.util.*;

public class 개인정보수집유효기간 {
    public int[] solution(String today, String[] terms, String[] privacies) {

        String[] dateParts = today.split("\\.");

        int expiredYear = Integer.parseInt(dateParts[0]);
        int expiredMonth = Integer.parseInt(dateParts[1]);
        int expiredDay = Integer.parseInt(dateParts[2]);

        int expiredDate = expiredYear*12*28 + expiredMonth*28+ expiredDay;

        HashMap<String, Integer> map= new HashMap<>();

        for(String s: terms){
            String[] strings = s.split(" ");
            map.put(strings[0], Integer.parseInt(strings[1])*28);
        }

        ArrayList<Integer> arr=new ArrayList<>();

        for(int i=0;i<privacies.length; i++){
            String[] s = privacies[i].split(" ");
            int date=calculateDate(s[0]);
            if(date+map.get(s[1])<=expiredDate){
                arr.add(i+1);
            }
        }



        return arr.stream().mapToInt(Integer::intValue).toArray();
    }

    public int calculateDate(String date){
        String[] d = date.split("\\.");

        int year=Integer.parseInt(d[0]);
        int month=Integer.parseInt(d[1]);
        int day=Integer.parseInt(d[2]);

        return year*12*28+month*28+day;
    }
}