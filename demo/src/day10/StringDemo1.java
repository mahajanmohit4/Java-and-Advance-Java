package day10;

public class StringDemo1 {
	public static void main(String[] args) {
		String s = "MOhit";
		System.out.println(s);
		String s1 = s.toLowerCase();
		System.out.println(s1);
		int len = s.length();
		System.out.println(len);
		int i = s.charAt(0);
		System.out.println(i);
		int j = s.indexOf('o');
		System.out.println(j);
		int k = s.lastIndexOf('t');
		System.out.println(k);
		String ss = s.substring(1);
		System.out.println(ss);
		String ss1 = s.substring(1 , 4);
		System.out.println(ss1);
	}
}
