package lv1;

import java.util.LinkedList;
import java.util.Queue;

public class 카드뭉치 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        Queue<String> q1=new LinkedList<>();
        Queue<String> q2=new LinkedList<>();
        for(String card:cards1){
            q1.add(card);
        }
        for(String card:cards2){
            q2.add(card);
        }
        for(String word: goal){
            if(word.equals(q1.peek())){
                q1.poll();
            }else if(word.equals(q2.peek())){
                q2.poll();
            }else{
                answer="No";
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        카드뭉치 cards = new 카드뭉치();
        System.out.println(cards.solution(new String[]{"i", "drink", "water"}
                ,new String[]{"want", "to"},new String[]{"i", "want", "to", "drink", "water"}));
    }
}
