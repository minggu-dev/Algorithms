import java.util.Arrays;

public class Budget {
	/**
	 * 예산 budget안으로 부서별 신청금액이 담긴 d배열을 가장 많이 나눠주도록 한다.
	 * 출처 : https://programmers.co.kr/learn/challenges
	 * @param d
	 * @param budget
	 * @return
	 */
	public int solution(int[] d, int budget) {
		int answer = 0;
		
		Arrays.sort(d);
		
		for(int i : d) {
			budget -= i;
			if(budget >= 0) {
				answer++;
			}else {
				break;
			}
		}
		return answer;
	}
}
