import java.util.ArrayList;
import java.util.List;

public class CraneDoll {
	/**
	 * 인형이 담긴 board에서 moves로 인형을 하나씩 뽑아 스택에 쌓는데 같은 인형이 스택에 쌓여있으면 사라진다.
	 * 출처 : https://programmers.co.kr/learn/challenges
	 * @param board
	 * @param moves
	 * @return
	 */
	public int solution(int[][] board, int[] moves) {
		List<Integer> list = new ArrayList<>();
		int result = 0;
		int count = 0;
		
		for(int pick : moves) {
			for(int i = 0; i < board.length; i++) {
				if(board[i][pick - 1] != 0) {
					if(list.size() != 0) {
						System.out.println("이전 " + list.get(list.size() - 1) + "/지금 " + board[i][pick - 1]);
						if(list.get(list.size() - 1) == board[i][pick - 1]) {
							list.remove(list.size() - 1);
							result += 2;
						}else {
							list.add(board[i][pick-1]);
						}
						board[i][pick - 1] = 0;
						break;
					}else {
						list.add(board[i][pick-1]);
					}
					board[i][pick - 1] = 0;
					break;
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int [] moves = {1,5,3,5,1,2,1,4};
		
		System.out.println(new CraneDoll().solution(board, moves));
	}
}
