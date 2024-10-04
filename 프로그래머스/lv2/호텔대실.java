package lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 호텔대실 {
    public int solution(String[][] book_time) {
        int[][] intBookTime = new int[book_time.length][2];

        for (int i = 0; i < book_time.length; i++) {
            int startTime = Integer.valueOf(book_time[i][0].split(":")[0])*60;
            int startMinute = Integer.valueOf(book_time[i][0].split(":")[1]);
            int endTime = Integer.valueOf(book_time[i][1].split(":")[0])*60;
            int endMinute = Integer.valueOf(book_time[i][1].split(":")[1]);

            intBookTime[i][0]=startTime+startMinute;
            intBookTime[i][1]=endTime+endMinute;
        }

        Arrays.sort(intBookTime, (a, b) -> (a[0] == b[0]) ? a[1] - b[1] : a[0] - b[0]);

        List<Integer> end_time = new ArrayList<>();
        end_time.add(intBookTime[0][1]);

        for (int i = 1; i < book_time.length; i++) {

            for (int j = 0; j < end_time.size(); j++) {
                //만약 입실 시간이 퇴실 시간보다 느리다면 대체, 아니라면 새로 방 추가
                if (end_time.get(j) + 10 <= intBookTime[i][0]) {
                    end_time.remove(end_time.get(j));
                    break;
                }
            }

            end_time.add(intBookTime[i][1]);
            Collections.sort(end_time);
        }

        return end_time.size();
    }

    public static void main(String[] args) {
        호텔대실 problem = new 호텔대실();
        System.out.println(problem.solution(new String[][]{{"15:00", "17:00"},
                {"16:40", "18:20"}, {"14:20", "15:20"}, {"14:10", "19:20"}, {"18:20", "21:20"}}));
    }
}
