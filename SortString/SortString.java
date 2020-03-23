import java.util.Arrays;
public class SortString {
	/**
	 * 문자열s를 아스키코드 큰값부터 정렬
	 * @param s
	 * @return
	 */
	public String solution(String s) {
	      StringBuilder builder = new StringBuilder();
	      char [] arr = s.toCharArray();
	      Arrays.sort(arr);
	      builder.append(arr);
	      builder.reverse();
	      return builder.toString();
	  }
}
