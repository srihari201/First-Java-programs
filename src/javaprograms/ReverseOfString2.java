package javaprograms;

public class ReverseOfString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ramesh";
		int length = s.length();
		String rev = " ";

		for (int i = length - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
			// System.out.println(rev);
		}
		System.out.println(rev);
	}

}
