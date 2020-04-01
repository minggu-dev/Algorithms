public class AppendString {
	/**
	 * 문자열 n만큼 이어붙이기
	 * @param n
	 * @return
	 */
	/*3항연산자 사용
	public String solution(int n) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < n; i++) {
				builder.append(i % 2 == 0 ? "수" : "박");
		}
		return builder.toString();
	}
	*/
	//2개씩 이어 붙이기
	public String solution(int n) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < n/2; i++) {
				builder.append("수박");
		}
        if(n % 2 == 1){
            builder.append("수");
        }
		return builder.toString();
	}
}
