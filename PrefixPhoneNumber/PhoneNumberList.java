import java.util.Arrays;

public class PhoneNumberList {
	/**
	 * phone_book에 들어있는 전화번호들을 보고 만약 한 값이 다른 값의 접두어에 해당하는 값이 있다면 true를 아니면 false를 반환한다.
	 * 출처 : https://programmers.co.kr/learn/challenges
	 * @param phone_book
	 * @return
	 */
	public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        int i = 0;
        int len = phone_book.length;
        for(i = 0; i < len - 1; i++ ){
            if(phone_book[i].length() > phone_book[i + 1].length())
                continue;
            else{
                if(phone_book[i].equals(phone_book[i+1].substring(0,phone_book[i].length())))
                    return false;
            }
        }
        return true;
    }
}
