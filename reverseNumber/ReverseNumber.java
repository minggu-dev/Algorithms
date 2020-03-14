
public class ReverseNumber {
	/**
	 * 프로그래머스 연습문제 풀이
	 * https://programmers.co.kr/learn/challenges
	 * 인자로 입력받은 숫자를 배열 형태로 뒤집어서 반환한다.
	 * @param n
	 * @return
	 */
	public int[] solution(long n) {
	      int len = Long.toString(n).length();
	      int[] answer = new int[len];
	      
	      int cur = 0;
	      while(n > 0){
	          answer[cur++] = (int)(n % 10);
	          n /= 10;
	         }
	      
	      return answer;
	  }
}
