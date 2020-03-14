package solveTreasureMap;

public class MakeTreasureMap {
	/**
	 * 카카오톡 2018 블라인드 코딩테스트
	 * 주어진 n*n크기의 맵에서 arr1과 arr2를 이진법으로 바꿔 1이 표기된 곳은 #으로 0이 표기된 곳은 공백으로 하여 두 정보를 합쳐 맵을 완성시킨다.
	 * @param n
	 * @param arr1
	 * @param arr2
	 * @return
	 */
//	  public String[] solution(int n, int[] arr1, int[] arr2) {
//	      String[] answer = new String[n];
//	      char [][] treasureMap = new char[n][n];	
//	      int binaryScale = (int) Math.pow(2,n - 1);
//	      
//	      for(int i = 0; i < n ; i ++){
//	    	  int temp = binaryScale;
//	          int arr1Num = arr1[i];
//	          int arr2Num = arr2[i];
//	          
//	          for(int j = 0; j < n; j++){
//	              if(arr1Num >= temp){
//	                  arr1Num -= temp;
//	                  treasureMap[i][j] = '#';
//	              }
//	              if(arr2Num >= temp){
//	                  arr2Num -= temp;
//	                  treasureMap[i][j] = '#';
//	              }
//	              if(treasureMap[i][j] != '#')
//	            	  treasureMap[i][j] = ' ';
//	              temp /= 2;
//	          }
//	          
//	          answer[i] = String.copyValueOf(treasureMap[i]);
//	      }
//	      
//	      return answer;
//	  }
	public String[] solution(int n, int[] arr1, int[] arr2) {
	      String[] answer = new String[n];	
	      int binaryScale = (int) Math.pow(2,n - 1);
	      
	      for(int i = 0; i < n ; i ++){
	    	  int temp = binaryScale;
	          int arr1Num = arr1[i];
	          int arr2Num = arr2[i];
		      char [] treasureMap = new char[n];
	          
	          for(int j = 0; j < n; j++){
	              if(arr1Num >= temp){
	                  arr1Num -= temp;
	                  treasureMap[j] = '#';
	              }
	              if(arr2Num >= temp){
	                  arr2Num -= temp;
	                  treasureMap[j] = '#';
	              }
	              if(treasureMap[j] != '#')
	            	  treasureMap[j] = ' ';
	              temp /= 2;
	          }
	          
	          answer[i] = String.copyValueOf(treasureMap);
	      }
	   
	      return answer;
	  }
}
