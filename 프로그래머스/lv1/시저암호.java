package lv1;

public class 시저암호 {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch)){
                ch=(char)((ch-'A'+n)%26+'A');
            }else if (Character.isLowerCase(s.charAt(i))){
                ch=(char)((ch-'a'+n)%26+'a');
            }
            answer+=ch;
        }
        return answer;
    }

    public static void main(String[] args) {
        시저암호 code = new 시저암호();
        System.out.println(code.solution("AB",1));
    }
}
