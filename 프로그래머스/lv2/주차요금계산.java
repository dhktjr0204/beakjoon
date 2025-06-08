package lv2;
import java.util.*;

public class 주차요금계산 {
    public int[] solution(int[] fees, String[] records) {
        List<Integer> answer = new ArrayList<>();
        List<String> outIndex = new ArrayList<>();
        Map<String, Integer> parkingMap = new HashMap<>();
        Map<String, Integer> timeMap = new HashMap<>();

        for(String record: records) {
            String[] list = record.split(" ");
            if("IN".equals(list[2])) {
                parkingMap.put(list[1], getTime(list[0]));
                if(!outIndex.contains(list[1])) {
                    outIndex.add(list[1]);
                }
            }else{
                int time = getTime(list[0]) - parkingMap.get(list[1]);
                parkingMap.remove(list[1]);
                timeMap.put(list[1], timeMap.getOrDefault(list[1], 0) + time);
            }
        }

        for(String key : parkingMap.keySet()) {
            int accureTime = getTime("23:59") - parkingMap.get(key);
            timeMap.put(key, timeMap.getOrDefault(key, 0) + accureTime);
        }

        Collections.sort(outIndex);
        for(String index: outIndex) {
            int accureTime = Math.max(0, ((timeMap.get(index) - fees[0]) + fees[2] -1) / fees[2]);
            answer.add(fees[1] + accureTime * fees[3]);
        }


        return answer.stream().mapToInt(i->i).toArray();
    }

    public int getTime(String time) {
        String[] times = time.split(":");
        String hour = times[0];
        String minute = times[1];

        return Integer.parseInt(hour)*60 + Integer.parseInt(minute);
    }
}
