public class AppendString {
	/**
	 * 문자열 n만큼 이어붙이기
	 * @param n
	 * @return
	 */
	public String solution(int n) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < n; i++) {
				builder.append(i % 2 == 0 ? "수" : "박");
		}
		return builder.toString();
	}
}
