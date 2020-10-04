package code;
import java.util.Scanner;
public class Pr1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		String str=sc.nextLine(); //CDAC Mumbai
				
		int count=0;
		
		for(char c='A';c<='z';c++){ //c=A,B,C...a,b,c,d...
			 count=0;
			for(int j=0 ; j<str.length() ; j++){
				
				char ch = str.charAt(j);
				if(c == ch){
					count++; 
				}
			}
			
			if(count>0){
				System.out.print(c + ":");
				
				for(int i=1 ; i<=count ; i++){
					System.out.print("*");
				}
				System.out.println();	
			}
			
		}
		
	}
}
