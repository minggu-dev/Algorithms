public class FindGCDLCM {
	/**
	 * 인자로 받은 두 수의 최소공배수와 최대공약수 구하기
	 * 출처 : https://programmers.co.kr/learn/challenges
	 * @param n
	 * @param m
	 * @return
	 */
	public int[] solution(int n, int m) {
		int[] answer = new int[2];
		answer[1] = m * n;
		int temp = 0;
		while(m % n != 0) {
			temp = n;
			n = m % n;
			m = temp;
		}
		answer[0] = n;
		answer[1] = answer[1] / n;
		
		return answer;
	}
}
