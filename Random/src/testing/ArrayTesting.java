package testing;

public class ArrayTesting 
{
	public static void main(String[] args) 
	{
//		compile time error
		int arr[5] = {1,2,3,4,5};
		for (int ele : arr)
			System.out.println(ele);
	}
}
