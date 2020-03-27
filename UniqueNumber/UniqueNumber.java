import java.util.List;
import java.util.ArrayList;

public class UniqueNumber {
	/**
	 * arr배열에서 모든 값들이 유일한 값을 갖도록 한다.
	 * 출처 : https://programmers.co.kr/learn/challenges
	 * @param arr
	 * @return
	 */
	public int[] solution(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		int[] answer = null;
		int cur = 10;
		for (int i : arr) {
			if (cur != i) {
				cur = i;
				list.add(cur);
			} else {
				continue;
			}
		}
		int len = list.size();
		answer = new int[len];

		for (int i = 0; i < len; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}

}
