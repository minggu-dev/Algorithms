import java.util.Arrays;

public class DigitSort {
	/**
	 * 인자로 받은 숫자 내의 각 자리 수를 큰 순서대로 정렬하여 출력한다.
	 * 출처 : https://programmers.co.kr/learn/challenges
	 * @param n
	 * @return
	 */
	public long solution(long n) {
		long answer = 0;
		char[] charArr = Long.toString(n).toCharArray();
		
		Arrays.sort(charArr);
		for(int i = charArr.length - 1; i >= 0; i--) {
			answer *= 10;
			answer += charArr[i] - 48;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		DigitSort ds = new DigitSort();
		long a = 578819811;
		System.out.println(ds.solution((a)));
	}
}
