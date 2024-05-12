public class 문자열다루기기본 {
    public boolean solution(String s) {
        boolean answer = false;
        if(s.length()==4|| s.length()==6){
            try {
                Integer.parseInt(s);
                return true;
            }catch (Exception e){
                return false;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        문자열다루기기본 string = new 문자열다루기기본();
        System.out.println(string.solution("a234"));
    }
}
