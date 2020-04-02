import java.util.Arrays;

public class RetirePeople {
	/**
	 * 완주하지 못한 한 선수 찾기
	 * 출처 : https://programmers.co.kr/learn/challenges
	 * @param participant 전체참가선수
	 * @param completion 완주한선수
	 * @return
	 */
	public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i = 0; i < completion.length; i++) {
        	if(participant[i].equals(completion[i]))
        		continue;
        	return participant[i];
        }
        return participant[participant.length - 1];
    }
}
