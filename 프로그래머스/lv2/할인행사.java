import java.util.*;
public class 할인행사 {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int days=10;
        Map<String, Integer> map = new HashMap<>();
        for (int i=0;i<want.length;i++){
            map.put(want[i],number[i]);
        }

        for (int i=0;i<discount.length-days+1;i++){
            Map<String, Integer> dMap = new HashMap<>();
            for (int j=0;j<days;j++){
                dMap.put(discount[i+j],dMap.getOrDefault(discount[i+j],0)+1);
            }
            Boolean flag=true;
            for (String key:map.keySet()){
                if(map.get(key)!=dMap.get(key)){
                    flag=false;
                    break;
                }
            }
            answer+= flag ? 1 : 0;

        }
        return answer;
    }

    public static void main(String[] args) {
        할인행사 sale = new 할인행사();
        System.out.println(sale.solution(new String[]{"banana", "apple", "rice", "pork", "pot"}
                , new int[]{3, 2, 2, 2, 1}
                ,new String[]{"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"}));
    }
}
