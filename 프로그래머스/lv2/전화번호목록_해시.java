import java.util.HashMap;

public class 전화번호목록_해시 {
    public boolean solution(String[] phone_book){
        HashMap<String, Integer> hashMap = new HashMap<>();
        for(int i=0;i<phone_book.length;i++){
            hashMap.put(phone_book[i],i);
        }

        for(String phone_num: phone_book){
            for (int j=1;j<phone_num.length();j++){
                if (hashMap.containsKey(phone_num.substring(0,j))){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        전화번호목록_해시 tel = new 전화번호목록_해시();
        System.out.println(tel.solution(new String[]{"523","119", "97674223", "1195524421"}));
    }
}
