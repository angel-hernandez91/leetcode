public class reverseInt {

	public static int reverse(int i) {
		String intStr = String.valueOf(i);
		String tempStr = "";
		for (int n = intStr.length() - 1; n >= 0; n--) {
			if (intStr.charAt(n) == "-".charAt(0)) {
				continue;
			}
			
			tempStr = tempStr + intStr.charAt(n);
			
		}
		if (intStr.charAt(0) == "-".charAt(0)) {
			tempStr = "-" + tempStr;
		}
		try {
			int reversedInt = Integer.parseInt(tempStr);
			return reversedInt;
		} catch (NumberFormatException e) {
			return 0;
		}
	}
	public static void main(String[] args){
		System.out.println(reverse(-1879999999));
	}
}