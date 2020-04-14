import java.util.Arrays;
import java.util.Scanner;
public class RectangleStar {
	/**
	 * 입력으로 숫자 2개를 받아서 열 a 행 b만큼 크기의 직사각형 별찍기
	 * 출처 : https://programmers.co.kr/learn/challenges
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder builder = new StringBuilder();
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int i= 0; i < b; i++) {
			for(int j = 0; j < a; j++ ) {
				builder.append('*');
			}
			builder.append("\n");
		}
		System.out.println(builder.toString());
	}
}
