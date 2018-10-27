import java.util.*;
public class IsValidParen {
	public static boolean isValid(String s) {
	    Stack<Character> stack = new Stack<Character>();
	    for (char character : s.toCharArray()) {
	    	if (character == '(' ){
	    		stack.push(')');
	    	}
	    	else if (character == '{') {
	    		stack.push('}');
	    	}
	    	else if (character == '[') {
	    		stack.push(']');
	    	}
	    	else if (stack.isEmpty() || stack.pop() != character) {
	    		return false;
	    	}
	    }
	    return stack.isEmpty();
	}

	public static void main(String[] args) {
		String s = "([{}])[]";
		System.out.println(isValid(s));
	}
}