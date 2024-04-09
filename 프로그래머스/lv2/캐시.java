import java.util.*;

public class 캐시 {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        LinkedList<String> cache = new LinkedList<>();
        if (cacheSize==0){
            answer=cities.length*5;
            return answer;
        }

        for (String city:cities){
            city=city.toLowerCase();
            if(cache.remove(city)){
                answer+=1;
                cache.add(city);
            }else{
                answer+=5;
                if (cache.size()>=cacheSize){
                    cache.remove(0);
                }
                cache.add(city);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        캐시 cash = new 캐시();
        System.out.println(cash.solution(3,
                new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
    }
}
