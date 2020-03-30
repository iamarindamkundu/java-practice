import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListMapTest {

	
	
	
	
	public static void main(String[] args) {

		Map<String, Object> emp1 = new HashMap<>();

		emp1.put("Id", "1");
		emp1.put("Name", "Arindam Kundu");
		emp1.put("MobileNo", 9038755320l);
		emp1.put("PhoneNo", 22640659);
		emp1.put("State", "Maharastra");
		emp1.put("City", "Mumbai");
		emp1.put("Street", "Powai Vikroli Link Road");
		emp1.put("House", "2D, New Mahara");
		emp1.put("FlatNo", 1701);
		emp1.put("Profile", "Graduation in Computer Science and Engineering on 2017. Trainee at Capgemini India.");
		emp1.put("Aadhaar No.", "8997-9008-6789");

		Map<String, Object> emp2 = new HashMap<>();

		emp2.put("Id", "2");
		emp2.put("Name", "Anupam Kundu");
		emp2.put("MobileNo", 9432208328l);
		emp2.put("PhoneNo", 22633659);
		emp2.put("State", "Karnataka");
		emp2.put("City", "Bengalore");
		emp2.put("Street", "Outer Ring Road");
		emp2.put("House", "2G, The Great Purva Rivara");
		emp2.put("FlatNo", 1701);
		emp2.put("Profile", "6 Year experience in Big Data Hadoop Technology. Currently Working at Amazon.com");
		emp2.put("Aadhaar No.", "8997-9678-6789");

		Map<String, Object> emp3 = new HashMap<>();
		
		emp3.put("Id", "234598");
		emp3.put("Name", "Ayan Kumar Singh Chatterjee");
		emp3.put("MobileNo", 9432208327l);
		emp3.put("PhoneNo", 22633650);
		emp3.put("State", "West Bangal");
		emp3.put("City", "Kolkata");
		emp3.put("Street", "Chitraranjon Road");
		emp3.put("House", "2G, Happy Home");
		emp3.put("FlatNo", 2202);
		emp3.put("Profile", "Graduation in Computer Science and Engineering on 2017. Trainee at Capgemini India.");
		emp3.put("Aadhaar No.", "8997-9178-4789");
		
		
		List<Map<String, Object>> emps = new ArrayList<>();

		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		// view designer

		Map<String, Integer> designersMap = new HashMap<>();

		String view = " >> ";
		for (Map<String, Object> emp : emps) {
			Set<String> headers = emp.keySet();

			for (String header : headers) {
				if (designersMap.containsKey(header)) {
					if (designersMap.get(header) < emp.get(header).toString().length()) {
						designersMap.put(header, emp.get(header).toString().length() + 2);
					}
				} else {
					designersMap.put(header, emp.get(header).toString().length() + 2);
				}
			}

		}

		Set<String> headers = designersMap.keySet();
		for (String header : headers) {
			System.out.println(header + ":" + designersMap.get(header));
		}
		// for (String header : headers)
		// {
		//
		// if(designersMap.containsKey(header)
		//
		// Map<String, Object> field = new HashMap<>();
		//
		// field.put("FieldMaxLength", emp.get(header).toString().length());
		// field.put("FieldWithSpace", value)
		//
		// designersMap.put(header, )
		// System.out.println(header);
		// }
		// }

		// System.out.println("Id\t\tName\t\t
		// MobileNo\t\tPhoneNo\t\tState\t\tCity\t\tStreet\t\tHouse\t\tFlatNo");
		// header map

		Map<String, Object> header = new HashMap<>();
		for (String key : emp1.keySet()) {
			header.put(key, key);
		}
		// formatting header
		header = myOutputFormatter(header, designersMap);

		String hr = (header.get("Id") + "| " + header.get("Name") + "| " + header.get("MobileNo") + "| "
				+ header.get("PhoneNo") + "| " + header.get("State") + "| " + header.get("City") + "| "
				+ header.get("Street") + "| " + header.get("House") + "| " + header.get("FlatNo")+"| " +header.get("Profile") +"| " +header.get("Aadhaar No.")).toString() ;
		for (int i = 1; i<= hr.length() + 5; i++)
			System.out.print("~");
		System.out.println();
		
		
		System.out.println(header.get("Id") + "| " + header.get("Name") + "| " + header.get("MobileNo") + "| "
				+ header.get("PhoneNo") + "| " + header.get("State") + "| " + header.get("City") + "| "
				+ header.get("Street") + "| " + header.get("House") + "| " + header.get("FlatNo") + "| " + header.get("Profile") +"| "+header.get("Aadhaar No."));
		
//		String hr = (header.get("Id") + "| " + header.get("Name") + "| " + header.get("MobileNo") + "| "
//				+ header.get("PhoneNo") + "| " + header.get("State") + "| " + header.get("City") + "| "
//				+ header.get("Street") + "| " + header.get("House") + "| " + header.get("FlatNo")).toString();
		
//		create horizontal line between header and data
		for (int i = 1; i<= hr.length() + 5; i++)
			System.out.print("~");
		System.out.println();
		
		for (Map<String, Object> emp : emps) {

			// System.out.println("before formatter");
			// System.out.println(emp.get("Id").toString().length() + " " +
			// emp.get("Name").toString().length() + " "
			// + emp.get("MobileNo").toString().length() + " " +
			// emp.get("PhoneNo").toString().length() + " "
			// + emp.get("State").toString().length() + " " +
			// emp.get("City").toString().length() + " "
			// + emp.get("Street").toString().length() + " " +
			// emp.get("House").toString().length() + " "
			// + emp.get("FlatNo").toString().length());
			//
			// // format output
			// System.out.println("After formatter");
			emp = myOutputFormatter(emp, designersMap);

			// System.out.println(emp.get("Id").toString().length() + " " +
			// emp.get("Name").toString().length() + " "
			// + emp.get("MobileNo").toString().length() + " " +
			// emp.get("PhoneNo").toString().length() + " "
			// + emp.get("State").toString().length() + " " +
			// emp.get("City").toString().length() + " "
			// + emp.get("Street").toString().length() + " " +
			// emp.get("House").toString().length() + " "
			// + emp.get("FlatNo").toString().length());
			System.out.println(emp.get("Id") + "| " + emp.get("Name") + "| " + emp.get("MobileNo") + "| "
					+ emp.get("PhoneNo") + "| " + emp.get("State") + "| " + emp.get("City") + "| " + emp.get("Street")
					+ "| " + emp.get("House") + "| " + emp.get("FlatNo") + "| " + emp.get("Profile") +"| "+ emp.get("Aadhaar No."));
		}

	}

	private static Map<String, Object> myOutputFormatter(Map<String, Object> emp, Map<String, Integer> designersMap) {
		for (String header : emp.keySet()) {

			String temp = "";

			// System.out.println(header + ":" + (designersMap.get(header) -
			// emp.get(header).toString().length()));

			int nameLen = emp.get(header).toString().length();

			for (int i = 1; i <= designersMap.get(header) - nameLen; i++) {

				emp.put(header, emp.get(header).toString() + " ");
			}
		}
		return emp;
	}
}
