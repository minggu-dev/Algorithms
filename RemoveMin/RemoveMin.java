public class RemoveMin {
	/**
	 * 인자로 받은 배열의 가장 작은 값을 지운 배열을 반환한다.
	 * @param arr
	 * @return
	 */
	public int[] solution(int[] arr) {
		if(arr.length == 1) {
			int [] answer = {-1};
			return answer;
		}
		int index = 0;
		int min = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(min > arr[i]) {
				index = i;
				min = arr[i];
			}
		}
		int [] answer = new int[arr.length-1];
		System.arraycopy(arr, 0, answer, 0, index);
		System.arraycopy(arr, index + 1, answer, index, arr.length - index - 1);
		return answer;
	}
	
	public static void main(String[] args) {
		RemoveMin rm = new RemoveMin();
		int [] arr = {4,3,2,1,56,7,8,0,11};
		for(int i : rm.solution(arr)) {
			System.out.println(i);
		}
	}
}
