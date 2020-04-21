import java.util.ArrayList;
import java.util.List;

public class SkillTree {
	/**
	 * skill_trees에서 skill의 순서대로 사용하는 경우의 수를 반환한다.
	 * 출처 : https://programmers.co.kr/learn/challenges 
	 * @param skill
	 * @param skill_trees
	 * @return
	 */
	public int solution(String skill, String[] skill_trees) {
		char[] skill_order = skill.toCharArray();
		List<Integer> commands = new ArrayList<Integer>();
		boolean possible = true;
		int result = 0;
		
		for(String command : skill_trees) {
			for(char ch: skill_order) {
				int index = command.indexOf(ch);
				if(!commands.isEmpty()) {
					if((index < commands.get(0) || commands.get(0) == -1) && index != -1) {
						possible = false;
						break;
					}else {
						commands.add(0,index);
					}
				}else {
					commands.add(0,index);
				}
			}
			if(possible) {
				result++;
			}else {
				possible = true;
			}
			commands.clear();
		}
		return result;
    }
}
