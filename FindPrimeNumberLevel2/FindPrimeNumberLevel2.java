import java.util.HashSet;
import java.util.Set;

public class FindPrimeNumberLevel2 {
	public int solution(String numbers) {
		Set<Integer> set = new HashSet<Integer>();
		char [] chArr = numbers.toCharArray();
		boolean[] using = new boolean[chArr.length];
		int number = 0;
		
		//
		for(int count = 0; count < chArr.length; count++) {
			System.out.println(count +"번째");
			findNumber(chArr, using, set, count, number);
		}
		return findPrime(set);
	}
	
	public void findNumber(char[] chArr, boolean[] using, Set<Integer> set, int count, int number) {
		for(int i = 0; i < chArr.length; i++) {
			if(!using[i]) {
				System.out.println(chArr[i] - '0');
				using[i] = true;
				number += chArr[i] - '0';
				
				if(count == 0) {
					set.add(number);
					System.out.println("추가");
				}else {
					System.out.println("넘어가자");
					findNumber(chArr, using, set, count - 1, number * 10);
				}
				//다음 반복문을 돌 때 사용하지 않은 값으로 초기화 해줌
				using[i] = false;
				//다음 반복문을 돌 때 이전값과 더해지지 않도록 빼줌
				number -= chArr[i] - '0';
			}
		}
		System.out.println("나가자");
	}
	
	public int findPrime(Set<Integer> set) {
		boolean isPrime = true;
		int result = 0;
		
		for(int i : set) {
			if(i < 2) {
				continue;
			}
			for(int j = 2; j*j <= i; j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				result++;
			}
			isPrime = true;
		}
		return result;
	}
	
	public static void main(String[] args) {
		FindPrimeNumberLevel2 fp = new FindPrimeNumberLevel2();
		System.out.println(fp.solution("1234567"));
	}
}
