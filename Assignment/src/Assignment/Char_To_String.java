package Assignment;

public class Char_To_String {
	public static String toString(char[] arr) {
		String str = new String(arr);
		return str;
	}
	public static void main(String[] args) {
		char arr[] = {'M','o','h','i','t'};
		String str = toString(arr);
		System.out.println(str);
	}
}
