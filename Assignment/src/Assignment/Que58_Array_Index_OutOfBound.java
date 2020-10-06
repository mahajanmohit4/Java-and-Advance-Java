package Assignment;
import java.util.*;
public class Que58_Array_Index_OutOfBound {
	public static void main(String[] args) {
		String strArr[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thusday", "Friday", "Saterday" };
		System.out.print("Enter the Day number : ");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		try {
			System.out.println(strArr[no]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error !! Enter the valid number");
		}
		
	}
}
