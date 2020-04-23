import java.util.Arrays;

public class ProcessDevelop {
	/**
	 * 현재 작업들의 처리율 progresses와 각 작업들의 처리속도 speeds가 들어올 때 여러 작업을 한 번에 처리할 수 있도록 기능을 개발한다.
	 * round robin형식의 작업 스케줄링에서 처리 완료하는 부분을 새롭게 한다.
	 * 출처 : https://programmers.co.kr/learn/challenges
	 * @param progresses
	 * @param speeds
	 * @return
	 */
	public int[] solution(int[] progresses, int[] speeds) {
        int len = progresses.length;
        int[] answer = new int[len];
        int cur = -1;
        int count = 0;
        int cursor = 0;
        
        for(int i = 0; i < len; i++) {
        	//잔여일 수
        	progresses[i] = (100 - progresses[i]) / speeds[i] + ((100 - progresses[i]) % speeds[i] == 0 ? 0 : 1);
        	if(cur == -1) {
        		cur = progresses[i];
        		count++;
        	}else {
        		if(cur < progresses[i]) {
        			cur = progresses[i];
        			answer[cursor++] = count;
        			count = 1;
        		}else {
        			count++;
        		}
        	}
        }
        
        answer[cursor] = count;
        
        return Arrays.copyOf(answer, cursor + 1);
    }
}
