package lv2;

import java.util.*;

public class 스킬트리 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for(String s: skill_trees) {
            Queue<Character> q = new LinkedList<>();
            for(char c: skill.toCharArray()) {
                q.add(c);
            }
            boolean flag = true;
            for(char c: s.toCharArray()) {
                if(q.contains(c)) {
                    if(q.peek() == c) {
                        q.poll();
                    }else{
                        flag = false;
                    }
                }
            }

            if(flag) {
                answer++;
            }

        }

        return answer;
    }
    public static void main(String[] args) {
        스킬트리 skill = new 스킬트리();
        System.out.println(skill.solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"}));
    }
}
