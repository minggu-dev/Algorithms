public class ChangeInteger {
	/**
	 * 문자열로 들어온 값을 숫자로 변환하기
	 * 출처 : https://programmers.co.kr/learn/challenges
	 * @param s
	 * @return
	 */
	public int solution(String s) {
		try {
			return Integer.parseInt(s);
		}catch (Exception e) {
			if(s.charAt(0) == '-') {
				return Integer.parseInt(s.substring(1)) * -1;
			}
			return Integer.parseInt(s.substring(1));
		}
	}
}
