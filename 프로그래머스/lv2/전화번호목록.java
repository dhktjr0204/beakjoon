import java.util.Arrays;

public class 전화번호목록 {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for (int i = 0; i< phone_book.length-1; i++){
            if(phone_book[i+1].startsWith(phone_book[i])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        전화번호목록 tel = new 전화번호목록();
        System.out.println(tel.solution(new String[]{"523","119", "97674223", "1195524421"}));
    }
}
