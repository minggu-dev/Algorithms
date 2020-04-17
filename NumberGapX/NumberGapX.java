public class NumberGapX {
	/**
	 * x간격으로 n만큼의 배열 저장
	 * 출처 : https://programmers.co.kr/learn/challenges
	 * @param x
	 * @param n
	 * @return
	 */
	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		for(int i = 1; i <= n; i++) {
			answer[i - 1] = (long)(x) * i;
		}
		return answer;
	}
}
