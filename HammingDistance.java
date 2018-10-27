public class HammingDistance {

	public static int hammingDistance(int x, int y) {
		String binaryX = Integer.toBinaryString(x);
		String binaryY = Integer.toBinaryString(y);

		for (int i = 0; i < binaryX.length(); i++) {
			if (binaryX.length() < binaryY.length()) {
				binaryX = "0" + binaryX;
				}
			}

		for(int i = 0; i < binaryY.length(); i++) {
			if (binaryY.length() < binaryX.length()) {
				binaryY = "0" + binaryY;
			}
		}

		System.out.println(binaryX);
		System.out.println(binaryY);
		

		int count = 0;
		for (int i = 0; i < binaryX.length(); i++) {
			if (binaryX.charAt(i) != binaryY.charAt(i)){
				count++;
			}
			
		}
		return count;
	}


	public static void main(String[] args) {
		String binaryX = Integer.toBinaryString(11);
		String binaryY = Integer.toBinaryString(43);

		System.out.println(hammingDistance(111, 114));
	}
}