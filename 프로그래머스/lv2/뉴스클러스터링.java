import java.util.*;

public class 뉴스클러스터링 {
    public int solution(String str1, String str2) {
        ArrayList<String> multiSet1 = new ArrayList<>();
        ArrayList<String> multiSet2 = new ArrayList<>();
        ArrayList<String> union = new ArrayList<>();
        ArrayList<String> intersection = new ArrayList<>();
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        multiSet1=makeTwoletter(str1);
        multiSet2=makeTwoletter(str2);

        Collections.sort(multiSet1);
        Collections.sort(multiSet2);

        for (String s: multiSet1){
            if (multiSet2.remove(s)){
                intersection.add(s);
            }
            union.add(s);
        }
        union.addAll(multiSet2);
        double jakard=0;
        if (union.size()==0){
            jakard=1;
        }else{
            jakard=(double) intersection.size()/(double) union.size();
        }

        return (int)(jakard*65536);
    }

    public ArrayList<String> makeTwoletter(String str){
        ArrayList<String> multiSet = new ArrayList<>();
        for (int i=0; i<str.length()-1; i++){
            char first=str.charAt(i);
            char second=str.charAt(i+1);
            if (Character.isLetter(first)&&Character.isLetter(second)){
                multiSet.add(first+""+second);
            }
        }
        return multiSet;
    }

    public static void main(String[] args) {
        뉴스클러스터링 news = new 뉴스클러스터링();
        System.out.println(news.solution("FRANCE","french"));
    }
}
