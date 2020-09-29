package day11;

import java.io.IOException;

public class Pr02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = Integer.parseInt("12");
		System.out.println(i);
		try {
			int j = System.in.read();
		}catch(IOException e){
			System.out.println("error");
			e.printStackTrace();
		}
		
		
	}

}
