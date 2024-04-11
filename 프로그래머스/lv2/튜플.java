import java.util.*;
import java.util.stream.Stream;

public class 튜플 {
    public int[] solution(String s) {
        s = s.replaceAll("\\{", "");
        String[] sArr = s.substring(0, s.length() - 2).split("},");
        Arrays.sort(sArr, (a,b)->Integer.compare(a.length(),b.length()));

        HashSet<Integer> duplicate = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for(String arr: sArr){
            int[] tuple = Stream.of(arr.split(",")).mapToInt(Integer::parseInt).toArray();
            for (int num: tuple){
                if (!duplicate.contains(num)){
                    result.add(num);
                }
                duplicate.add(num);
            }
        }
        int[] answer=new int[result.size()];

        for(int i=0;i<result.size();i++){
            answer[i]=result.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        튜플 tuple = new 튜플();
        System.out.println(tuple.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}"));
    }
}
