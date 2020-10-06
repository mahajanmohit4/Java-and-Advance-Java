package Assignment;

public class Que56_First_Latter_Capital {
	public static String toString(char[] arr) {
		String str = new String(arr);
		return str;
	}
	public static void main(String[] args) {
		String str = "mohit";
		char arr[] = str.toCharArray();
		for(int i=0 ; i<arr.length;i++) {
			if(i==0) arr[i] = Character.toUpperCase(arr[i]);
//			System.out.print(arr[i]);
		}
		
		String str1 = toString(arr);
		System.out.println(str1);
		
	}
}
