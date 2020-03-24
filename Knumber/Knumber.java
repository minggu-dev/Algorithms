import java.util.Arrays;
public class Knumber {
	/**
	 * commands는 n * 3으로 구성된 이차원 배열이다.
	 * 각 행마다 첫 번째부터 두 번째 인자까지의 array배열에서 꺼낸 후 정렬하고
	 * 정렬한 배열을 세 번째 인자의 인덱스를 이용해 꺼낸 값을 반환한다.
	 * 
	 * @param array
	 * @param commands
	 * @return
	 */
	public int[] solution(int[] array, int[][] commands) {
		int[] sortArr = null;
		int len = commands.length;

		int[] answer = new int[len];
        for(int i = 0; i < len; i++) {
        	sortArr = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
        	Arrays.sort(sortArr);
        	int a = sortArr[commands[i][2] - 1];
        	answer[i] = a;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		Knumber k = new Knumber();
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		int [] result = k.solution(array, commands);
		for(int i : result) {
			System.out.println(i);
		}
	}
}
