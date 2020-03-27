public class FindDate2016 {
	/**
	 * 2016년의 a월 b일의 실제 요일을 구해 반환
	 * 출처 : https://programmers.co.kr/learn/challenges
	 * @param a
	 * @param b
	 * @return
	 */
	public String solution(int a, int b) {
		String[] days = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		int[] months = {31,29,31,30,31,30,31,31,30,31,30,31};
		int first = 5;
		int gap = 0;
		for(int i = 0; i < a - 1; i++) {
			gap += months[i];
		}
		gap = gap + first + (b - 1);
		return days[gap % 7];
	}
}
