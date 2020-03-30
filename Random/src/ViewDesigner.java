import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ViewDesigner {

	public static void tableView(List<Map<String, Object>> items) {
		Map<String, Integer> designersMap = new HashMap<>();

		String view = " >> ";
		Map<String, Object> colName = null;
		for (Map<String, Object> item : items) {
			Set<String> headers = item.keySet();

			for (String header : headers) {
				if (designersMap.containsKey(header)) {
					if (designersMap.get(header) < item.get(header).toString().length()) {
						designersMap.put(header, item.get(header).toString().length() + 2);
					}
				} else {
					designersMap.put(header, item.get(header).toString().length() + 2);
				}
			}
			colName = item;
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
		for (String key : colName.keySet()) {
			header.put(key, key);
		}
		// formatting header
		header = myOutputFormatter(header, designersMap);

		String hr = (header.get("Id") + "| " + header.get("Name") + "| " + header.get("MobileNo") + "| "
				+ header.get("PhoneNo") + "| " + header.get("State") + "| " + header.get("City") + "| "
				+ header.get("Street") + "| " + header.get("House") + "| " + header.get("FlatNo") + "| "
				+ header.get("Profile") + "| " + header.get("Aadhaar No.")).toString();
		for (int i = 1; i <= hr.length() + 5; i++)
			System.out.print("~");
		System.out.println();

		System.out.println(header.get("Id") + "| " + header.get("Name") + "| " + header.get("MobileNo") + "| "
				+ header.get("PhoneNo") + "| " + header.get("State") + "| " + header.get("City") + "| "
				+ header.get("Street") + "| " + header.get("House") + "| " + header.get("FlatNo") + "| "
				+ header.get("Profile") + "| " + header.get("Aadhaar No."));

		// String hr = (header.get("Id") + "| " + header.get("Name") + "| " +
		// header.get("MobileNo") + "| "
		// + header.get("PhoneNo") + "| " + header.get("State") + "| " +
		// header.get("City") + "| "
		// + header.get("Street") + "| " + header.get("House") + "| " +
		// header.get("FlatNo")).toString();

		// create horizontal line between header and data
		for (int i = 1; i <= hr.length() + 5; i++)
			System.out.print("~");
		System.out.println();

		for (Map<String, Object> emp : items) {

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
					+ "| " + emp.get("House") + "| " + emp.get("FlatNo") + "| " + emp.get("Profile") + "| "
					+ emp.get("Aadhaar No."));
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
