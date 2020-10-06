package Assignment;

public class Que57_Reverse_Word {
	public static String toString(char[] arr) {
		char arr1[] = new char[arr.length];
		for(int i=arr.length-1,j=0 ; i>=0 ; i--,j++) {
			arr1[j] = arr[i];
		}
		String str = new String(arr1);
		return str;
	}
	
	public static void main(String[] args) {
		String str = "Mohit Mahajan";
		String strArr[] = str.split(" ");
		for(int i=0 ; i<strArr.length; i++) {
			char[] arr=strArr[i].toCharArray();
			System.out.println(toString(arr));
		}
	
	}
}
