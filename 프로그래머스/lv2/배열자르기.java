import java.util.*;
public class 배열자르기 {
    public List<Long> solution(int n, long left, long right) {
        ArrayList<Long> list = new ArrayList<>();
        for(long i=left; i<right+1; i++){
            list.add(Math.max(i/n,i%n)+1);
        }
        return list;
    }

    public static void main(String[] args) {
        배열자르기 cutArr = new 배열자르기();
        System.out.println(cutArr.solution(3,2,5));
    }
}
