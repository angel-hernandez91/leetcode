public class IsPalindrome {
	public static boolean isPlaindrome(int x) {
		if (x < 10 && x > -10) {
			return true;
		}
		for (int i = 0; i < String.valueOf(x).length(); i++){
			if (x >= 0) {	
				if (!(String.valueOf(x).charAt(i) == String.valueOf(x).charAt(String.valueOf(x).length()-i-1))) {
					return false;
				}
			} else {
				x = -x;
				if (!(String.valueOf(x).charAt(i) == String.valueOf(x).charAt(String.valueOf(x).length()-i-1))) {
					return false;
				}
			}

		}
		return true;

	}

	public static void main(String[] args){
		System.out.println(isPlaindrome(12343321));
	}
}