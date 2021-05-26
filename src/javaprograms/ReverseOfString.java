package javaprograms;

public class ReverseOfString {

	public static void main(String[] args) {
		String s = "srihari";
		int length = s.length();// it will give us length of string and here string length is 8
		String rev = " ";// to store the reverse string
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);// here we are appending becoz first time it is blank
		}
		System.out.println(rev);
	}

}
