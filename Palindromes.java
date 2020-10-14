import java.util.Stack;
public class Palindromes {
	public static boolean isPalindromeSentence(String sentence) {
		if (sentence == null) return false;
			Stack<Character> st = new Stack<>();
			String justChar = sentence.replaceAll("[^A-Za-z0-9]", "");	// Removes all whitespace and punctuation.
			justChar = justChar.toLowerCase();
			for (char c : justChar.toCharArray()) {
				st.push(c);
			}
			String revStr = "";
			while (!st.empty()) {
				revStr += st.pop() + "";
			}

			return revStr.equals(justChar);
		}
}
