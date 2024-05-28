package lv1;

public class 이상한문자만들기 {
    public String solution(String s) {
        String answer = "";
        //공백이 아예 사라진다.
        String[] strs = s.split(" ",-1);
        for(String str: strs){
            for(int i=0;i<str.length();i++){
                if(i%2==0){
                    answer+=Character.toUpperCase(str.charAt(i));
                }else{
                    answer+=Character.toLowerCase(str.charAt(i));
                }
            }
            answer+=" ";
        }
        return answer.substring(0,answer.length()-1);
    }

    public static void main(String[] args) {
        이상한문자만들기 strangeString = new 이상한문자만들기();
        System.out.println(strangeString.solution("try hello world"));
    }
}
