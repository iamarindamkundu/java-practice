package testing;

public class TestEquals 
{
	public static void main(String[] args) 
	{
		String str1 = "Hello";
		String str2 = new String("Hello");
		
		Integer var1 = new Integer(2); 
		Integer var2 = new Integer(2); 

		if (var1==var2)
			System.out.println("1");
		
//		if (str1 == str2)
//			System.out.println(str1 +"="+ str2);
//		
//		if (str1.equals(str2))
//			System.out.println("str1.equals(str2)");
		
//		Product p1 = new Product(101, "Apple", 23);
//		Product p2 = new Product(101, "Apple", 23);//p1;//new Product(123, "Mango", 20);
//		
//		System.out.println(p1.equals(p2));
	}
}
