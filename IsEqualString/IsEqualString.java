public class IsEqualString {
	/**
	 * 문자열이 4 혹은 6글자인지 그리고 숫자로만 이루어져 있는지 확인
	 * 출처 : https://programmers.co.kr/learn/challenges
	 * @param s
	 * @return
	 */
	public boolean solution(String s) {
		if (s.length() == 4 || s.length() == 6) {
			try {
				Integer.parseInt(s);
				return true;
			} catch (Exception e) {
				return false;
			}
		}else
			return false;
	}

}
