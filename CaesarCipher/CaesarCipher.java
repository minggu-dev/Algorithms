package date0402;
public class CaesarCipher {
	/**
	 * 시저암호 구현하기
	 * 출처 : https://programmers.co.kr/learn/challenges
	 * @param s 문자열
	 * @param n 키값
	 * @return
	 */
	public String solution(String s, int n) {
		char[] charArr = s.toCharArray();
		for(int i = 0; i < charArr.length; i++) {
			if(charArr[i] <= 90 && charArr[i] >= 65) {//대문자
				charArr[i] = (char) ((n + charArr[i] - 65) % 26 + 65);
			}else if(charArr[i] <= 122 && charArr[i] >= 97) {//소문자
				charArr[i] = (char) ((n + charArr[i] - 97) % 26 + 97);
			}
		}
		return new String(charArr);
	}
	
	public static void main(String[] args) {
		CaesarCipher cc = new CaesarCipher();
		System.out.println(cc.solution("abc", 1));
	}
	
}
