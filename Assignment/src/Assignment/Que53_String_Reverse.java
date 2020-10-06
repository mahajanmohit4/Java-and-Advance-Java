package Assignment;

public class Que53_String_Reverse {
	
	public static void main(String[] args) {
		String str = "Mohit";		
		char arr[] = str.toCharArray();

		char arr1[] = new char[arr.length];
		for(int i=arr.length-1,j=0 ; i>=0 ; i--,j++) {
			arr1[j]=arr[i];
			System.out.println(arr1[j]);
		}
		
		
	}
}
