public class HarshadNumber {
	/**
	 * 인자의 값이 하샤드 수인지 확인
	 * 출처 : https://programmers.co.kr/learn/challenges
	 * @param x
	 * @return
	 */
	public boolean solution(int x) {
		int rangeSum = 0;
		int num = x;
		while(num > 0) {
			rangeSum += num%10;
			num /= 10;
		}
		return x % rangeSum == 0 ? true : false;
	}
}
