package testing;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestOne {
	public static void main(String[] args) {
		List myList = new LinkedList();
		myList.add(new Integer(0));
		Integer myInt = (Integer)myList.iterator().next();
		ArrayList<Number> arrLst = new ArrayList<Number>();
		arrLst.add(new Integer(3));
		Object o = 3;
		ArrayList<Object> al = new ArrayList<Object>();
		al.add(new Integer(3));
	}
}
