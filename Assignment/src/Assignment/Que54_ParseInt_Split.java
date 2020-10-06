package Assignment;
import java.util.*;
public class Que54_ParseInt_Split {
	public static void main(String[] args) {
		String str = "67, 89, 23, 67, 12, 55, 66";
		 String[] arrOfStr = str.split(", "); 
//		 for (String a : arrOfStr) 
//			 System.out.println(a);
		 int a[] = new int[arrOfStr.length];
		 
		 for(int i=0 ; i<arrOfStr.length ; i++) {
			 a[i] = Integer.parseInt(arrOfStr[i]);
		 }
		
		 int sum=0;
		for(int j=0 ; j<a.length ; j++) {
			if(a[j]%2 ==0) {
				sum=sum+a[j];
			}
			
		}
		System.out.println("Sum of int Values : "+sum);
	}
}
