import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FailRate {
	/**
	 * 2019카카오톡 블라인드 테스트 실패율 구하기
	 * 출처 : https://programmers.co.kr/learn/challenges
	 * @param N  전체 스테이지 수
	 * @param stages  현재 유저들이 도달한 스테이지 배열
	 * @return
	 */
	public int[] solution(int N, int[] stages) {
		Arrays.sort(stages);	//스테이지 정렬
		double user = stages.length;	//전체 유저 수
		List<Double> failRate = new ArrayList<Double>();	//스테이지별 실패율 기록
		List<Integer> stageList = new ArrayList<Integer>();	//실패율 순으로 스테이지 정렬
		int count = 0;	// 머물러있는 사람 수
		int cur = 0;	// stages배열의 커서
		
		//i는 스테이지
		for(int i = 0; i < N; i++) {
			for(; cur < stages.length;) {
				if(!(stages[cur] == i + 1)) {
					break;
				}
				count++;
				cur++;
			}
			
			//유저가 없다면 실패율은 0
			if(count == 0) {
				failRate.add((double) 0);
				stageList.add(i + 1);
				continue;
			}
			
			double rate = count / user;
			int order = 0;
			for(double d : failRate) {
				if(rate > d) {
					break;
				}
				order++;
			}
			
			failRate.add(order, rate);
			stageList.add(order, i + 1);
			user -= count;
			count = 0;
		}
		
		int [] answer = new int [N];
		for(int i = 0 ; i < N ; i++) {
			answer[i] = stageList.get(i);
			System.out.println(answer[i] + " : " + failRate.get(i));
		}
		
		return answer;
    }
}
