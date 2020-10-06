package Assignment;
import java.util.*;
public class Que52 {
	public static void main(String[] args) {
//		 String s = "Mohit";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name : ");
		String s = sc.next();
		 String str = s.toLowerCase();
		 char arr[] = str.toCharArray();
		 int count=0;
		 for(int i=0 ; i<arr.length;i++) {
			 if(arr[i]=='a' || arr[i]=='o' || arr[i]=='i' || arr[i]=='e' || arr[i]=='u')
				 count++;
		 }
		 System.out.println(count);
	}
}
