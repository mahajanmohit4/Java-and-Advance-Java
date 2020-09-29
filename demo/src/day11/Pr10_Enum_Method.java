package day11;
enum Day{
SUN(1),MON(2),TUE(3),WED(4),THU(5),FRI(6),SAT(7);
	private int dayNo;
//	Day(){}
	Day(int dayNo){
		this.dayNo = dayNo;
	}
	int getDayNo() {
		return dayNo;
	}
}
public class Pr10_Enum_Method {
	public static void main(String[] args) {
		Day d = Day.THU;
		System.out.println(d);
//		System.out.println(d.getDayNo);
		
	}
}
