public class MatrixSum {
	/**
	 * 인자로 받은 두 행렬의 합을 반환
	 * 출처 : https://programmers.co.kr/learn/challenges
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	public int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr1[0].length];
		for(int i = 0; i < answer.length; i++) {
			for(int j = 0; j < answer[0].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return answer;
	}
}
