public class CollatzConjecture {
	/**
	 * 콜라츠 추측으로 반복횟수를 반환한다. 반복횟수가 500을 넘어가면 -1을 반환한다.
	 * 출처 : https://programmers.co.kr/learn/challenges
	 * @param num
	 * @return
	 */
	public int solution(int num) {
		int index = 0;
		for(;index < 500 && num != 1; index++) {
			num = num % 2 == 1 ? num * 3 + 1 : num / 2;
		}
		if(index == 500)
			return -1;
		return index;
	}
}
