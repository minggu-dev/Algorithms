package date0402;

public class AllFactorSum {
	/**
	 * 인자로 받은 숫자의 모든 약수들의 합을 반환
	 * 출처 : https://programmers.co.kr/learn/challenges
	 * @param n
	 * @return
	 */
	public int solution(int n) {
		int result = 0;
		for(int i = 1; i <= n / 2; i++) {
			if(n % i == 0) {
				result += i;
				System.out.println(i);
			}
		}
		return result + n;
	}
}
