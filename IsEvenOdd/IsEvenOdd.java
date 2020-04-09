public class IsEvenOdd {
	/**
	 * 인자로 받은 숫자가 짝수이면 "Even" 홀수이면 "Odd"를 반환
	 * 출처 : https://programmers.co.kr/learn/challenges
	 * @param num
	 * @return
	 */
	public String solution(int num) {
		return Math.abs(num) % 2 == 1 ? "Odd" : "Even";
	}
	
	public static void main(String[] args) {
		IsEvenOdd is = new IsEvenOdd();
		System.out.println(is.solution(-3));
	}
}
