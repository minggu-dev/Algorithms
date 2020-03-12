class FindPY {
	/**
	 * 문자열 s내에서 p문자와 y문자를 비교하여 같은지 여부를 출력
	 * @param s 주어진 문자열
	 * @return p와 y가 같을시 true 다르면 false 반환
	 */
    boolean solution(String s) {
        boolean answer = true;
        int cur = 0;
        int count = 0;

        s = s.toLowerCase();

        //'p'문자 찾기
        while((cur = s.indexOf("p", cur)) != -1){
            count++;
            cur++;
        }
        
        cur = 0;
        //'y'문자 찾기
        while((cur = s.indexOf("y", cur)) != -1){
            count--;
            cur++;
        }

        if(count != 0)
            answer = false;
        return answer;
    }
}