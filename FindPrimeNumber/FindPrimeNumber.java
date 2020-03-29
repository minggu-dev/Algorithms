import java.util.ArrayList;
import java.util.List;
public class FindPrimeNumber {
	/**
	 * n까지 범위 내의 모든 소수 갯수 찾기
	 * 출처 : https://programmers.co.kr/learn/challenges
	 * @param n
	 * @return
	 */
	 /*모든 소수를 구해서 소수 갯수 반환하기
	 public int solution(int n) {
        boolean check = true;
        List<Integer> primes = new ArrayList<Integer>();
        for(int i = 3; i <= n; i += 2) {
            for(int prime: primes) {
                if(Math.sqrt(i) < prime) {
                    break;
                }
                if(i % prime == 0) {
                    check = false;
                    break;
                }
            }
            if(check) {
                primes.add(i);
            }
            check = true;
        }
        return (primes.size() + 1);
    }*/
	public int solution(int n) {
		int[] arr = new int[n];
		int count = 0;
		//1제외
		arr[0] = -1;
		
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(arr[i - 1] != 0)
				continue;
			for(int j = i * i; j <= n; j += i ) {
				arr[j - 1] = -1;
			}
		}
		for(int i = 0; i < n; i++) {
			if(arr[i] == 0) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		FindPrimeNumber f = new FindPrimeNumber();
		List<Integer> list = new ArrayList<>(5);
		System.out.println(f.solution(100));
		
	}
}
