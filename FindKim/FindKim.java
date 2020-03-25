public class FindKim {
	/**
	 * 문자열 배열에서 "Kim"의 인덱스 찾기
	 * 출처 : https://programmers.co.kr/learn/challenges
	 * @param seoul
	 * @return
	 */
	public String solution(String[] seoul) {
		StringBuilder builder = new StringBuilder();
		builder.append("김서방은 ");
		int index = 0;
		for(String str : seoul) {
			if("Kim".equals(str))
				break;
			index++;
		}
		builder.append(index);
		builder.append("에 있다");
		return builder.toString();
	}

	public static void main(String[] args) {
		FindKim fk = new FindKim();
		String[] seoul = { "kim123", "kim", "Kim", "fff" };
		System.out.println(fk.solution(seoul));
	}
}
