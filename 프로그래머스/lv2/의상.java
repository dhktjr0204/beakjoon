import java.util.HashMap;

public class 의상 {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] cloth:clothes){
            map.put(cloth[1],map.getOrDefault(cloth[1],1)+1);
        }
        for (String key:map.keySet()){
            answer *= map.get(key);
        }

        return answer-1;
    }

    public static void main(String[] args) {
        의상 cloth = new 의상();
        System.out.println(cloth.solution(
                new String[][]{{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}}));
    }
}
