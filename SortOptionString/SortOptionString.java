import java.util.Arrays;

public class SortOptionString {
	/**
	 * 문자열의 n번째 값을 기준으로 정렬을 한다.
	 * 출처 : https://programmers.co.kr/learn/challenges
	 * @param strings
	 * @param n
	 * @return
	 */
	public String[] solution(String[] strings, int n) {
		int len = strings.length;
		String temp = null;

		for (int i = len - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				char cur = strings[j].charAt(n);
				char next = strings[j + 1].charAt(n);
				if (cur > next) {
					temp = strings[j];
					strings[j] = strings[j + 1];
					strings[j + 1] = temp;
				} else if (cur == next) {
					String[] arr = { strings[j], strings[j + 1] };
					Arrays.sort(arr);
					if (arr[0].equals(strings[j + 1])) {
						temp = strings[j];
						strings[j] = strings[j + 1];
						strings[j + 1] = temp;
					}
				}
			}
		}
		return strings;
	}
	public static void main(String[] args) {
		int a = 3;
		a *= 4 + 5;
		System.out.println(a);
	}
}
