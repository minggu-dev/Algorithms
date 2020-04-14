public class IsSquared {
	/**
	 * n이 특정수의 제곱인지를 판별하여 제곱이면 제곱근을 x라할 때 x+1의 제곱을 반환
	 * 출처 : https://programmers.co.kr/learn/challenges
	 * @param n
	 * @return
	 */
	public long solution(long n) {
		int sqr = (int)Math.sqrt(n);
		if(Math.pow(sqr,2) == n) {
			return (long)Math.pow(sqr + 1, 2);
		}
		return -1;
	}
}
