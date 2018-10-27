public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {
		int[] indicies = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++){
				if (i == j) {
					continue;
				} else if ((nums[i] + nums[j]) == target) {
					indicies[0] = j;
					indicies[1] = i;
				}
			}
		}
		return indicies;
	}

	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		int target = 18;

		System.out.println(twoSum(nums, target)[0]);
	
		System.out.println(twoSum(nums, target)[1]);
	}
}