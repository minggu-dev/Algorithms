package date0402;

public class AverageArray {
	/**
	 * 배열의 값들의 평균 구하기
	 * 출처 : https://programmers.co.kr/learn/challenges
	 * @param arr
	 * @return
	 */
	public double solution(int[] arr) {
		double answer = 0;
		for(int i : arr) {
			answer += i;
		}
		return answer / arr.length;
	}
}
