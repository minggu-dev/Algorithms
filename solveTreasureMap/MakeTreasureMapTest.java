package solveTreasureMap;

public class MakeTreasureMapTest {

	public static void main(String[] args) {
		MakeTreasureMap mtm = new MakeTreasureMap();
		int [] arr1 = {9, 20, 28, 18, 11};
		int [] arr2 = {30, 1, 21, 17, 28};
		for(String str : mtm.solution(5, arr1, arr2)) {
			System.out.println(str);
		}
	}

}
