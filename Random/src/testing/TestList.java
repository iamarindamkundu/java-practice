package testing;

import java.util.LinkedList;
import java.util.List;

public class TestList {

	public static void main(String[] args) 
	{
		List<String> obj = new LinkedList<String>();
		obj.add("one");
		obj.add("two");
		obj.add("three");
		
		System.out.println(((LinkedList<String>) obj).poll());
	}

}
