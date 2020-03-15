
public class CenterString {
	/**
	 * 인자로 받은 문자열의 가운데 문자를 반환
	 * 문자열의 길이가 홀수이면 문자 1개, 짝수이면 문자 2개를 반환
	 * @param s
	 * @return
	 */
	public String solution(String s) {
		int len = s.length();
		int even = len%2 == 0 ? 1 : 0;
		String answer = s.substring(len / 2 - even, len / 2 + len % 2 + even);
		return answer;
	}
	
	public static void main(String[] args) {
		CenterString cs = new CenterString();
		System.out.println(cs.solution("1234"));
	}
}
