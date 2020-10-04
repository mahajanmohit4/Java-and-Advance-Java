package day11;

//enum Day{
//	SUN,MON,TUE,WED,THU,FRI,SAT;
//}

//enum Day{
//SUN,MON,TUE,WED,THU,FRI,SAT
//}



public class Pr09_Enum {
	public static void main(String[] args) {
		Day d = Day.MON;
		System.out.println(d);
		
		for(Day a : Day.values()) {
			System.out.println(a);
		}
	}
}
