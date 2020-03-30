import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestConsole {

	public static void main(String[] args) {
//		Map<String, Object> map = new HashMap<>();
		
		List<Object> employees = new ArrayList<>();
		
		Map<String, String> employee1 = new HashMap<>();
		
		employee1.put("Id", "Ak12");
		employee1.put("Name", "Arindam Kundu");
		employee1.put("Address", "34, Creek Row, Kolkata-700014");
		
		Map<String, String> employee2 = new HashMap<>();
		
		employee2.put("Id", "Ay34");
		employee2.put("Name", "Ayan Chatterjee");
		employee2.put("Address", "Asansol, West Bangal");
		
		employees.add(employee1);
		employees.add(employee2);
		
//		map.put("employees", employees);
		
		System.out.println("Id\tName\tAddress");
		
		for(Object emp : employees)
		{
			(HashMap)emp
		}
	}

}
