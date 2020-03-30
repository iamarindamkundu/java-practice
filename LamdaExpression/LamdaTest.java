// Lamda expressing testing
interface MyNumber {
	double getValue();
}

public class LamdaTest {
	public static void main(String[] args) {
		MyNumber myNum;
		myNum = () -> 123.45;
		System.out.println(myNum.getValue());
	}
}