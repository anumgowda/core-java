package interview;

public class ReverseString {

	static void reverseString() {
		String name = "anusha.m";
		String reverseString = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			reverseString = reverseString + name.charAt(i);

		}
		System.out.println(reverseString);
	}

	public static void main(String[] args) {
		ReverseString.reverseString();

	}
}
