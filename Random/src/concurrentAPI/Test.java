package concurrentAPI;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Map<Integer, String> myMap = new HashMap<>();
		
		myMap.put(12, "hello");
		myMap.put(12, "apple");
		
		System.out.println(myMap);
	}
}
