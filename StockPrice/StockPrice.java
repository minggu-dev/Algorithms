import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StockPrice {
	/**
	 * 초단위로 주식가격 정보가 저장된 배열 prices에 대해 시간이 변함에 따라 가격변동여부를 저장하는 배열 반환
	 * 출처 : https://programmers.co.kr/learn/challenges
	 * @param prices
	 * @return
	 */
	public int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		for(int i = 0; i < prices.length - 1; i++) {
			if(prices[i] == 1) {
				answer[i] = prices.length - 1 - i;
			}else {
				for(int j = i + 1; j < prices.length; j++) {
					answer[i]++;
					if(prices[i] > prices[j]) {
						break;
					}
				}
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		StockPrice sp = new StockPrice();
		int [] prices = {1, 2, 3, 2, 3};
		int [] arr = sp.solution(prices);
		for(int i : arr) {
			System.out.println(i);
		}
	}
}