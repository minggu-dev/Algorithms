import java.util.ArrayList;
import java.util.List;

public class LendUniform {
	/**
	 * 전체 학생 n명 중 옷을 lost한 학생들에게 최대한 옷을 빌려주어 그 최댓값을 반환 lost한 학생에게 여분이 있는 reserve학생이
	 * 빌려줄 땐 인접한 수 (+-1)에 해당하는 경우만 빌려줄 수 있다. 
	 * 출처 : https://programmers.co.kr/learn/challenges
	 * @param n
	 * @param lost
	 * @param reserve
	 * @return
	 */
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length;
		
		//lost의 학생이 옷을 빌린경우
		List<Integer> notLost = new ArrayList<>();
		//옷을 이미 빌려준 경우
		List<Integer> notRe = new ArrayList<>();
		
		//lost의 학생이 reserve에 있는경우
		for(int i : lost) {
			for(int j: reserve) {
				if(i == j) {
					notLost.add(i);
					notRe.add(j);
					answer++;
				}
			}
		}
		
		//lost의 학생의 주변에 reserve가 있는경우
		for(int i : lost) {
			if(notLost.contains(i))
				continue;
			for(int j: reserve) {
				if(notRe.contains(j))
					continue;
				if(i - 1 == j || i + 1 == j) {
					notRe.add(j);
					answer++;
					break;
				}
			}
		}

		return answer;
		
		
	}

	public static void main(String[] args) {
		LendUniform ob = new LendUniform();
		int[] lost = {3,9,10};
		int[] reser = {3,8,9};
		System.out.println(ob.solution(10, lost, reser));
		
	}

/* Map을 이용해서 문제풀이
import java.util.Map;
import java.util.HashMap;
class Solution {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = n;
		Map<Integer,Integer> lostList = new HashMap<>();
		Map<Integer,Integer> reserveList = new HashMap<>();
		
		for(int i : lost) {
			lostList.put(i,i);
		}
		for(int j: reserve) {
			if(lostList.containsValue(j)) {
				lostList.remove(j);
			}else {
				reserveList.put(j,j);
			}
		}
		
		for(int i : lostList.keySet()) {
			if(reserveList.containsValue(i - 1)) {
				reserveList.remove(i - 1);
			}else if(reserveList.containsValue(i + 1)) {
				reserveList.remove(i + 1);
			}else {
				answer--;
			}
		}
		return answer;		
	}
}*/
/* 배열을 생성하여 문제풀이
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
		int answer = n;
		int[] allStu = new int[n];
		
		for(int i : lost) {
			allStu[i - 1]--;
		}
		
		for(int i : reserve) {
			allStu[i - 1]++;
		}
		
		for(int i = 0; i < n; i++) {
			if(allStu[i] == -1) {
				if(i > 0 && i < n - 1) {
					if(allStu[i - 1] == 1) {
						allStu[i]++;
						allStu[i - 1]--;
					}else if(allStu[i + 1] == 1) {
						allStu[i]++;
						allStu[i + 1]--;
					}else
						answer--;
				}else if (i == 0) {
					if(allStu[i + 1] == 1){
						allStu[i]++;
						allStu[i + 1]--;
					}else
						answer--;
				}else if(i == n-1) {
					if(allStu[i - 1] == 1){
						allStu[i]++;
						allStu[i - 1]--;
					}else
						answer--;
				}
			}
		}
		return answer;
		
	}
}
*/
}
