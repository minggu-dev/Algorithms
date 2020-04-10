import java.util.Arrays;

public class MarkingPhoneNumber {
	/**
	 * 인자로 받은 핸드폰번호의 뒷4자리를 제외한 번호를 *로 바꾸기 
	 * 출처 : https://programmers.co.kr/learn/challenges
	 * @param phone_number
	 * @return
	 */
	public String solution(String phone_number) {
		StringBuilder builder = new StringBuilder();
		int len = phone_number.length();
		char [] charArr = new char[len - 4];
		Arrays.fill(charArr,'*');
		builder.append(charArr);
		builder.append(phone_number.substring(len - 4));
		return builder.toString();
	}
}
