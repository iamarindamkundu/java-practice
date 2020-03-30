package testing;

class Base {
	Base() {
		System.out.println("base");
	}

	void method() {

	}
}

public class TestClass2 extends Base {

	static float f;
	static {
		System.out.println("Static");
	}
	{
		System.out.println("Init");
	}

	TestClass2() {
		// this(f);
		System.out.println("cons");
		f = 3;
	}

	TestClass2(float f) {
		System.out.println(f);
	}

	void method(String s) {
		System.out.println("String");
	}

	void method(Object o) {
		System.out.println("Object");
	}

	public static void main(String[] args) {
		TestClass2 tc = new TestClass2();

		tc.method(null);

		int myint = 800;
		// int your-int = 800;
		int $dollarint = 900;
		int $$$$ = 900;
		int ___ = 9000;

		// String[][] s1 = String[20][20];
		// String[][] s2 = new String[20,20];
		String[][] s3 = new String[20][20];
		String s4[][] = new String[20][20];
		String[] s5[] = new String[20][20];

		// System.out.println(06+07+08);

		char a = '\u0000';

		boolean b1 = false;
		boolean b2 = false;

		// if(b1 != b2 =! b2)

		int x;
		// System.out.println(x);

		Integer myInt = new Integer(3);
		System.out.println(myInt.intValue());

		String myString = "apple";
		System.out.println(myString.length());

		String str1 = "abc";
		String str2 = "def";
		String str3 = str1.concat(str2);
		str1.concat(str2);
		System.out.println(str1);

	}
}
