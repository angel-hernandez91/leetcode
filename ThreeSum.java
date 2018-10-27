import java.util.*;
public class ThreeSum {
	public static List<List<Integer>> threeSum(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		List<List<Integer>> solutionSet = new ArrayList<List<Integer>>();
		for (int i= 0; i < nums.length; i++) {
			map.put(i, nums[i]);
		}
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {	
				int complement = 0;
				if (nums[i] == map.get(j)) {
					continue;
				} else {
					complement = 0 - (nums[i] + map.get(j));
					
					if (map.containsValue(complement) && (map.get(j) != complement && nums[i] != complement)) {	
					System.out.println(nums[i] + " " + map.get(j) + " " + complement);
						if ((nums[i] + map.get(j) + complement) == 0) {
							List<Integer> tempList = new ArrayList<Integer>();
							tempList.add(nums[i]);
							tempList.add(map.get(j));
							tempList.add(complement);
							solutionSet.add(tempList);
						}
					}
				}
			}
		}
		return solutionSet;
	}

	public static void main(String[] args){
		int s[] = {-1, 0, 1, 2, 3};
		System.out.println(threeSum(s));
	}
}