package testing;

class Base1 {
	Base1() {
		System.out.println("Base");
	}
}

abstract class Driver1 extends Base1 {
	Driver1() {
		System.out.println("Drived1");
	}
}

public class Driver2 extends Driver1 {

	Driver2()
	{
		System.out.println("Driver2");
	}
	public static void main(String[] args) {
		Driver2 d2 = new Driver2();
		
		int i = 0, j = 2;
		do
		{
			i =++i;
			j--;
		}while(j>0);
		System.out.println(i);
		
		String s1 = "abc";
		String s2 = new String("abc");
		if(s1==s2)
			System.out.println(1);
		else
			System.out.println(2);
		if (s1.equals(s2))
			System.out.println(3);
		else
			System.out.println(4);
		
		
		int a[][];
		
		int $anc;
		int _a_long;
		
		String s = new String("xyz");
//		s = 2*s;
//		int i = s[0];
		s = s+s;
//		s = s>>2;
	}
}
